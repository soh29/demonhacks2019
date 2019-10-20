package com.letmeoff.letmeoff;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;


public class SearchActivity extends AppCompatActivity {
    SearchView searchView;
    ListView listView;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        searchView = (SearchView)findViewById(R.id.searchView);
        listView = (ListView)findViewById((R.id.myList));
        list = new ArrayList<>();
        list.add("404-1");
        list.add("404-2");
        //list.addAll(Arrays.asList(getResources().getStringArray(R.array.buses)));
        adapter = new ArrayAdapter<>(
                SearchActivity.this,
                android.R.layout.simple_list_item_1,
                list
        );
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {

            Object o = listView.getItemAtPosition(position);
            //Toast.makeText(getApplicationContext(), o.toString(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getBaseContext(), SetStopActivity.class);
                intent.putExtra("bus_number", o.toString());
                startActivity(intent);
            }
        });







    }
}
