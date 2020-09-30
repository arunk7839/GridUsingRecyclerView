package com.c1ctech.gridusingrecyclerview;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private List<Item> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        prepareItemData();

        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        recyclerView.setAdapter(new ItemAdapter(list, this));
    }

    public void prepareItemData() {
        Item item = new Item(R.drawable.eclair, "Eclair");
        list.add(item);
        item = new Item(R.drawable.froyo, "Froyo");
        list.add(item);
        item = new Item(R.drawable.gingerbread, "Gingerbread");
        list.add(item);
        item = new Item(R.drawable.honeycomb, "Honeycomb");
        list.add(item);
        item = new Item(R.drawable.ice_cream_sandwich, "Ice Cream Sandwich");
        list.add(item);
        item = new Item(R.drawable.jellybean, "Jelly Bean");
        list.add(item);
        item = new Item(R.drawable.kitkat, "KitKat");
        list.add(item);
        item = new Item(R.drawable.lollipop, "Lollipop");
        list.add(item);
        item = new Item(R.drawable.marshmallow, "Marshmallow");
        list.add(item);
        item = new Item(R.drawable.nougat, "Nougat");
        list.add(item);
        item = new Item(R.drawable.oreo, "Oreo");
        list.add(item);
        item = new Item(R.drawable.pie, "Pie");
        list.add(item);

    }
}


