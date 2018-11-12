package com.seakleang.uicontroll;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
        //2. implement from Interface OnClickListener
        implements View.OnClickListener {

    TextView textView;
    Button btnButton;
    ImageButton btnImageButton;
    ToggleButton btnToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        btnButton = findViewById(R.id.btnButton);
        btnImageButton = findViewById(R.id.btnImage);
        btnToggle = findViewById(R.id.toggleButton);

        String text = getString(R.string.text);
        textView.setText(text);

        //2. implement from Interface OnClickListener
        //btnImageButton.setOnClickListener(this);
        //btnButton.setOnClickListener(this);
        btnToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    textView.setBackgroundColor(Color.BLUE);
                }
                else
                    textView.setBackgroundColor(Color.RED);
            }
        });

        /*register event have three type of subscriber event
        1. create anonymous inner class
        2. implement from Interface OnClickListener
        3. use onclick attribute in xml
        */

        //1. create anonymous inner class
        /*btnImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showsmg("ImageButton");
            }
        });*/



    }

    void showsmg(String smg){
        Toast.makeText(this,smg,Toast.LENGTH_SHORT).show();
    }

    //2. implement from Interface OnClickListener
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnImage:
                showsmg("ImageButton");
                break;
            case R.id.btnButton:
                showsmg("Button");
                break;
        }
    }

    //3. use onclick attribute in xml
    void onclickAttribute(View v){
        showsmg("onclick attribute");
    }
}
