package com.letmeoff.letmeoff;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class SetStopActivity extends AppCompatActivity {
    ArrayList<String> stopList;
    TextView bus_number;
    ArrayAdapter<String> adapter;
    ListView bus_route;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_stop);

        bus_number = (TextView) findViewById(R.id.bus_number);
        bus_number.setText( getIntent().getStringExtra("bus_number"));

        stopList = new ArrayList<String>();
        stopList.addAll(Arrays.asList(getResources().getStringArray(R.array.route1)));

        bus_route = (ListView) findViewById(R.id.bus_route);
        adapter = new ArrayAdapter<>(
                SetStopActivity.this,
                android.R.layout.simple_list_item_1,
                stopList
        );
        bus_route.setAdapter(adapter);

        bus_route.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

                Object o = bus_route.getItemAtPosition(position);

                Intent intent = new Intent(getBaseContext(), SetTimeActivity.class);
                intent.putExtra("bus_stop", o.toString());
                startActivity(intent);
            }
        });
    }
}
