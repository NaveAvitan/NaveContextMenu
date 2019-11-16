package com.example.navecontextmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

/**
 * this activity shoe credits
 */
public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    /**
     * this act return us to the open activity
     * @param view
     */
    public void back(View view) {
        finish();
    }
}
