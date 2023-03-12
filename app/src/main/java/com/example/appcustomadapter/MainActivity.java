package com.example.appcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Arreglo, Array o matriz de cadenas llamada "PlayerList" que contiene los nombres de varios futbolistas
    // famosos. La matriz está inicializada con 13 elementos, cada uno de los cuales es un nombre de jugador.
    String PlayerList[] = {"Lionel Messi", "Cristiano Ronaldo", "Robert Lewandowski", "Karim Benzema",
                           "Kylian Mbappe", "Erling Haaland", "Vinicius Jr", "Neymar Jr", "Thomas Muller",
                           "Ousmane Dembele" , "Andres Iniesta", "Mohamed Salah", "Angel Di Maria"};

    //matriz de enteros llamada "playerImages", que contiene identificadores de recursos de imágenes.
    // Cada elemento de la matriz se inicializa con el identificador de un recurso de imagen que se encuentra
    // en la carpeta "drawable" del proyecto.
    int playerImages [] = {R.drawable.img_2, R.drawable.cristiano, R.drawable.img_1, R.drawable.img,
                        R.drawable.mbappe, R.drawable.haaland , R.drawable.vini , R.drawable.neymar,
                        R.drawable.muller, R.drawable.dembele, R.drawable.iniesta,  R.drawable.salah,
                         R.drawable.dimaria};


    //Se Inicializa el la Lista que se usara.
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.customListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), PlayerList, playerImages);
        listView.setAdapter(customBaseAdapter);
        //se utiliza para configurar un ListView personalizado (customListView) en una actividad. El ListView mostrará
        // una lista de elementos con nombres de jugadores y sus imágenes.


    }
}