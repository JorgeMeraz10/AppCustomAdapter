package com.example.appcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CustomListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);

        //Se crea la la Actividad CustomList View para poder utilizar su XML, para posicionar la imagen y el texto, hacia
        //el customListView que tenemos en la Pantalla  XML del Main Activty.
    }
}