package com.brainfix.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*public void clickTextView(View v){
        TextView textView = findViewById(R.id.textview);
        textView.setTextColor(Color.rgb(130,20,70));
    }*/

    public void functionConverter(View view){
        EditText edite_text = findViewById(R.id.editTextUSDAmount);
        if(edite_text.getText().toString().length() > 0) {
            double lkr_amount,USD_rate,USD_amount;
            USD_amount = Double.parseDouble(edite_text.getText().toString());
            USD_rate = 179.68;
            lkr_amount = USD_amount * USD_rate;
            String lkr_text = String.format("%.2f",lkr_amount);
            Toast.makeText(this, "RS."+lkr_text, Toast.LENGTH_LONG).show();
            Intent intent =new Intent(this,Main2Activity.class);
            intent.putExtra(Intent.EXTRA_TEXT,lkr_text);
            startActivity(intent);
        }
        else{
            String empty_text_message = "Please enter valide USD Amount." ;
            Toast.makeText(this, empty_text_message, Toast.LENGTH_LONG).show();

        }
    }

}
