package com.example.appcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String PlayerList[] = {"Lionel Messi", "Cristiano Ronaldo", "Robert Lewandowski", "Karim Benzema",
                           "Kylian Mbappe", "Erling Haaland"};

    int playerImages [] = {R.drawable.img_2, R.drawable.cristiano, R.drawable.img_1, R.drawable.img,
                        R.drawable.mbappe, R.drawable.haaland };

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), PlayerList, playerImages);
        listView.setAdapter(customBaseAdapter);


    }
}