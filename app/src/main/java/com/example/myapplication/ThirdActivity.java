package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class ThirdActivity extends AppCompatActivity{

    private String result = "notChecked";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        ToggleButton toggle = findViewById(R.id.toggleButton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    result = "Checked";
                } else {
                    result = "notChecked";
                }
            }

        });
    }
    @Override
    public void onBackPressed() {
        Intent intent_returned = new Intent();
        intent_returned.putExtra("btn_value", result);
        setResult(MainActivity.RESULT_OK, intent_returned);
        finish();
    }

}
