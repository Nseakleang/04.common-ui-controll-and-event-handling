package com.seakleang.uicontroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AutoCompleteTextViewActivity extends AppCompatActivity {

    @BindView(R.id.autoCompleteText) AutoCompleteTextView txtSearch;
    String[] countries={"Cambodia","Japan","Thai","Canada","China","Korea"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);
        ButterKnife.bind(this);

        ArrayAdapter<String> adapter= new ArrayAdapter(
                this,
                android.R.layout.simple_dropdown_item_1line,
                countries
        );
        txtSearch.setAdapter(adapter);
    }
}
