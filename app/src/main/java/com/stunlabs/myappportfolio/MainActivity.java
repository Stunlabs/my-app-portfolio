package com.stunlabs.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Called when each button is pressed
    // Toasts text of button
    public void onButtonClick(View v){
        Button b = (Button)v;
        String toastText = b.getText().toString();
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }


}
