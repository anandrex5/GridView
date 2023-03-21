package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<String> text = new ArrayList<>();
    ArrayList<Integer> image = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridView);

        //call this method in the activity
        fillArray();

        //Creating an object of this adapter class in the MainActivity
        GridAdapter adapter = new GridAdapter(this, text, image);
        //now we this GridView to the Adapter
        gridView.setAdapter(adapter);

        //now we add clickListener to post the Toast Message.
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), " You Selected " + text.get(position),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    //Now we fill the Array
    public void fillArray()
    {
        text.add("Bird");
        text.add("Cat");
        text.add("Chicken");
        text.add("Dog");
        text.add("Fish");
        text.add("Monkey");
        text.add("Rabbit");
        text.add("Sheep");
        text.add("Lion");

        image.add(R.drawable.bird);
        image.add(R.drawable.cat);
        image.add(R.drawable.chichek);
        image.add(R.drawable.dog);
        image.add(R.drawable.fish);
        image.add(R.drawable.monkey);
        image.add(R.drawable.rabbit);
        image.add(R.drawable.sheep);
        image.add(R.drawable.lion);



    }
}