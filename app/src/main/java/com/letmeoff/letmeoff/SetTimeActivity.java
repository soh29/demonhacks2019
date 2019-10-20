package com.letmeoff.letmeoff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class SetTimeActivity extends AppCompatActivity implements NumberPicker.OnValueChangeListener{

    private TextView StopNumbers;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_time);

        StopNumbers = findViewById(R.id.StopNumbers);
        NumberPicker numberPicker = findViewById(R.id.numberPicker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(5);
        numberPicker.setOnValueChangedListener(this);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                openActivity2();
            }

        });
    }

        @Override
        public void onValueChange(NumberPicker numberPicker, int i, int il){
            StopNumbers.setText((i+1) +" Stop(s) Before ");

        }




    public void openActivity2(){
        Intent intent = new Intent(this, ConfirmActivity.class);
        startActivity(intent);
    }

}

