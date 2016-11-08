package tycho.tychobuisman_pset2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }

    public void forward(View view){

        Intent goToFiller = new Intent(this, Filler.class);
        startActivity(goToFiller);
        finish();
    }
}
