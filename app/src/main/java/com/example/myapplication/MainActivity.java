package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private int THIRD_ACTIVITY_CODE = 77;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate was called");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart was called");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume was called");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause was called");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop was called");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart was called");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy was called");
    }

    public void toSecondActivity(View view){
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }
    public void toThirdActivity(View view){
        Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
        startActivityForResult(intent, THIRD_ACTIVITY_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == THIRD_ACTIVITY_CODE) {
            Log.i("FIRST IF:", "PASSED");
            if (resultCode == MainActivity.RESULT_OK) {
                Log.i("SECOND IF:", "PASSED");

                String returnString = data.getStringExtra("btn_value");
                Log.i("Button Value 3rd Activity: ", returnString);
            }
        }
    }
}
