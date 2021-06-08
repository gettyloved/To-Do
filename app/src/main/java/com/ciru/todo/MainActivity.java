package com.ciru.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listView = findViewById(R.id.list_options);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent(MainActivity.this, DrinksCategory.class);
                    startActivity(intent);
                } else if (i == 1){
                    Intent intent = new Intent(MainActivity.this, FoodCategory.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(MainActivity.this, OthersCategory.class);
                    startActivity(intent);
                }
            }
        };

        listView.setOnItemClickListener(itemClickListener); 

    }
}