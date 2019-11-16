package com.example.navecontextmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

/**
 * this activity collect 3 numbers from the user, the first number is the kind of sidra, second first place and third is the number for the hefresh or kefel
 */
public class MainActivity extends AppCompatActivity {
 EditText edfirst,edhefresh,ed1or2;
 String ed1,ed2,ed3;
 Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edfirst = findViewById(R.id.editText1);
        edhefresh = findViewById(R.id.editText2);
        ed1or2 = findViewById(R.id.editText3);
    }


    /**
     * this act send the 3 numbers to the second activity or send toast if the user didnt picked one of the numbers
     * @param view
     */
    public void goto20(View view) {
        ed1= edfirst.getText().toString();

        ed2= edhefresh.getText().toString();

        ed3= ed1or2.getText().toString();


        if (ed1.equals("")||(ed2.equals(""))||(ed3.equals(""))) {
            Toast toast;
            toast = Toast.makeText(this, "plz pick", Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            Intent gi = new Intent(this, Main2Activity.class);
            gi.putExtra("n", ed1);
            gi.putExtra("nn", ed2);
            gi.putExtra("nnn", ed3);
            startActivity(gi);
        }

    }

    /**
     * this act send the user to the credits activity
     * @param view
     */
    public void gotocredits(View view) {
        Intent si=new Intent(this,Main3Activity.class);
        startActivity(si);
    }
}
