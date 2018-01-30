package id.qurratufalmuriat.ujianosca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTextView(View view) {
        case R.id.jawabtext:
            if ("G1P1A0")
                score = score + 15;
            else
                score = score - 10;
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio1:
                if (checked)
                    score = score + 10;
            case R.id.radio2:
                if (checked)
                    break;
            case R.id.radio3:
                if (checked)
                    break;
        }
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.pilihan1:
                if (checked)
                    score = score + 20 ;
            else
                break;
            case R.id.pilihan2:
                if (checked)
                    score = score - 10 ;
            else
                break;
            case R.id.pilihan3:
                if (checked)
                    score = score + 20 ;
            else
                break;
            case R.id.pilihan4:
                if (checked)
                    score = score - 10 ;
            else
                break;
            case R.id.pilihan5:
                if (checked)
                    score = score + 20 ;
            else
                break;
        }
    }



    public void submit (View view) {
//        Log.v("selesai","score anda ...");
        Toast.makeText(getApplicationContext(),"score anda ...",Toast.LENGTH_SHORT).show();
    }
    public void reset (View view) {

        Toast.makeText(getApplicationContext(),"reset",Toast.LENGTH_SHORT).show();
    }
}
