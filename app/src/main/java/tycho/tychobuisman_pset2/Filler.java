package tycho.tychobuisman_pset2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import static tycho.tychobuisman_pset2.R.id.editText;
import static tycho.tychobuisman_pset2.R.id.text;

public class Filler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.filler);

    }

    public void savePlaceholder(View view){

        EditText text = (EditText) findViewById(R.id.editText);
        String placeholder = text.getText().toString();

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("placeholder", placeholder);
        editor.commit();

        Intent goToDisplay = new Intent(this, display.class);
        startActivity(goToDisplay);
        finish();
    }


}
