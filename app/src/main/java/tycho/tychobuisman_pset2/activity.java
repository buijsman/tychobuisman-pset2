/*
Tycho Buisman, 10773584
Mad Libs

This is the intro screen for the app
 */


package tycho.tychobuisman_pset2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void forward(View view){

        Intent goToFiller = new Intent(this, Filler.class);
        startActivity(goToFiller);
        finish();
    }
}
