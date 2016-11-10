/*
This screen will allow the user to input the words for the story.
It will tell the user the amount of words left to fill in and what type of word should be filled in.
 */

package tycho.tychobuisman_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

public class Filler extends AppCompatActivity {

    Story story;
    InputStream in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filler);
        getStory();
        displaytext();
    }
    public void getStory(){
        String stories[] = {"madlib0_simple.txt", "madlib1_tarzan.txt", "madlib2_university.txt", "madlib3_clothes.txt", "madlib4_dance.txt"};
        String randomstory = stories[new Random().nextInt(5)];

        try {
            in = this.getAssets().open(randomstory); // try catch
        } catch (IOException e) {
            e.printStackTrace();
        }
        story = new Story(in);

    }

    public void displaytext(){
        TextView type = (TextView)findViewById(R.id.placeholdertype);
        TextView count = (TextView)findViewById(R.id.wordsleft);
        String placeHolder = story.getNextPlaceholder();
        int wordsLeft = story.getPlaceholderRemainingCount();


        type.setText("Please type a/an " + placeHolder);
        count.setText("Words left to fill in: " + wordsLeft);
    }

    public void savePlaceholder(View view){

        EditText text = (EditText) findViewById(R.id.editText);
        String placeholder = text.getText().toString();

        story.fillInPlaceholder(placeholder);

        text.setText("");

        displaytext();

        if (story.getPlaceholderRemainingCount() == 0){
            String completeStory = story.toString();
            Intent goToDisplay = new Intent(this, display.class);
            goToDisplay.putExtra("story", completeStory);//bundle doorgeven aan intent
            startActivity(goToDisplay);
            finish();
        }
    }
}
