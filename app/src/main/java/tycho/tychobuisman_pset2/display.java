/*
This screen will show the complete story and give the user the option to fill in a new story.
 */

package tycho.tychobuisman_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        displaythestory();
    }

    public void displaythestory(){

        String story = getIntent().getExtras().getString("story");
        TextView displaystring = (TextView)findViewById(R.id.displaystring);
        displaystring.setText(story);
    }

    public void newStory(View view){
        Intent goToFiller = new Intent(this, Filler.class);
        startActivity(goToFiller);
        finish();
    }
}
