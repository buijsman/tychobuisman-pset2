package tycho.tychobuisman_pset2;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        displaythestory();

    }

    public void displaythestory(){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String placeholder = preferences.getString("placeholder", "");

        TextView displaystring = (TextView)findViewById(R.id.displaystring);
        displaystring.setText(placeholder);
    }
}
