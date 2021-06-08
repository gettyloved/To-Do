package com.ciru.todo;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

class FoodCategory extends ListActivity {

    protected void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        ListView listView = getListView();

        ArrayAdapter<Food> listAdapter = new ArrayAdapter<Food>(
                this,
                android.R.layout.simple_list_item_1,
                Food.food
        );
        listView.setAdapter(listAdapter);
    }

    public void onListItemClick(ListView listView, View view, int i, long id){
        Intent intent = new Intent(FoodCategory.this, FoodActivity.class);
        startActivity(intent);
    }
}
