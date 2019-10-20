package com.letmeoff.letmeoff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;


public class SetTimeActivity extends AppCompatActivity implements NumberPicker.OnValueChangeListener {

    private TextView StopNumbers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_time);

        StopNumbers = findViewById(R.id.StopNumbers);
        NumberPicker numberPicker = findViewById(R.id.numberPicker);
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(5);
        numberPicker.setOnValueChangedListener(this);

    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i, int il ){
        StopNumbers.setText(" "+ (il) + " Stop(s) Before");

    }
}
