package com.letmeoff.letmeoff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class SetStopActivity extends AppCompatActivity {
    ArrayList<String> stopList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_stop);

        stopList.addAll(Arrays.asList(getResources().getStringArray(R.array.route1)));

    }
}
