package com.brainfix.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView displayTextView = findViewById(R.id.TextValue);
        if(getIntent() != null && getIntent().hasExtra(Intent.EXTRA_TEXT)){
            Log.i("string value",getIntent().getStringExtra(Intent.EXTRA_TEXT));
            displayTextView.setText("Rs." + getIntent().getStringExtra(Intent.EXTRA_TEXT));
        }
    }



    public void onClickClose(View view){
        finish();

    }
}
