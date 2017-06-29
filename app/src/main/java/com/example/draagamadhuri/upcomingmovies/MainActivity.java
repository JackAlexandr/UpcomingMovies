package com.example.draagamadhuri.upcomingmovies;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = (RecyclerView)findViewById(R.id.list);
        list.setItemAnimator(new DefaultItemAnimator());
        list.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<String> names = new ArrayList<>();
        names.add("Spiderman Homecoming");
        names.add("Dunkirk");
        names.add("The Emoji Movie");
        names.add("Justice League");
        names.add("Thor Ragnarok");
        names.add("War For The Planet Of The Apes");

        ArrayList<Drawable> images = new ArrayList<>();
        images.add(getResources().getDrawable(R.drawable.homecoming));
        images.add(getResources().getDrawable(R.drawable.dunkirk));
        images.add(getResources().getDrawable(R.drawable.emoji));
        images.add(getResources().getDrawable(R.drawable.justice));
        images.add(getResources().getDrawable(R.drawable.thor));
        images.add(getResources().getDrawable(R.drawable.planet));

        ArrayList<String> dates = new ArrayList<>();
        dates.add("07/07/2017");
        dates.add("21/07/2017");
        dates.add("28/07/2017");
        dates.add("16/11/2017");
        dates.add("25/10/2017");
        dates.add("14/07/2017");

        AdapterCreate myAdapter = new AdapterCreate(names, images, dates);

        list.setAdapter(myAdapter);

    }
}
