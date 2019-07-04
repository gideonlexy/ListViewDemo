package com.stardev.soigolexy.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.myListView);

        final ArrayList<String> myFriends = new ArrayList<String>(asList("Jaymo","Dave","Samaki","Saida"));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,myFriends);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String user = myFriends.get(i);
                Toast.makeText(getApplicationContext(),"Hello "+ user,Toast.LENGTH_SHORT).show();
            }
        });

    }
}

