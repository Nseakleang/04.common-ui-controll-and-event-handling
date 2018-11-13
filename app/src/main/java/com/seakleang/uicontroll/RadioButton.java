package com.seakleang.uicontroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RadioButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
    }

    void onClick(View view){

    }

    void showsmg(String smg){
        Toast.makeText(this,smg,Toast.LENGTH_SHORT).show();
    }
}
