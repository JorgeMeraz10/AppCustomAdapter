package com.example.appcustomadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    //define una variable de instancia llamada "context" de tipo "Context".
    // "Context" es una clase de Android que proporciona acceso a los recursos
    // y las clases fundamentales de la aplicación, así como a cierta información del sistema.
    // La variable "context" se utiliza para acceder a este objeto de contexto en varias partes
    // del código de la aplicación.
    Context context;

    //Se definen los Array utilizados en el Main Activity.
    String PlayerList[];
    int playerImages[];

    //Se declara una variable llamada "inflater" del tipo "LayoutInflater". "LayoutInflater" es una clase
    // de Android que se utiliza para crear una vista a partir de un archivo de diseño XML. La variable "inflater"
    // se utiliza para acceder a un objeto "LayoutInflater" en varias partes del código de la aplicación.
    LayoutInflater inflater;

    //Se crea el costructor de la Clase con todos los necesitado
    public  CustomBaseAdapter(Context context, String [] PlayerList, int [] images)
    {
        this.context = context;
        this.PlayerList = PlayerList;
        this.playerImages = images;
        inflater = LayoutInflater.from(context);

    }
   //El metodo gerCount retorna el valor de Imagenes que se tienen en la lista de Array y el tamaño.
    @Override
    public int getCount() {

        return PlayerList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

   // Se define un método llamado "getItemId" en una clase que extiende la clase "Adaptador ,en este caso "CustomBaseAdaper".
   // El método "getItemId" devuelve un valor de tipo "long" que representa el ID único del elemento
   // en la posición especificada en el adaptador.
    @Override
    public long getItemId(int position) {
        return 0;
    }


    //Se define un método llamado "getView" en una clase que extiende la clase "Adapter". El método
    // "getView" se utiliza para obtener la vista que se muestra en cada fila de la lista en función de
    // la posición del elemento en el adaptador.
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        ImageView playerImg = (ImageView) convertView.findViewById(R.id.imageIcom);
        textView.setText(PlayerList[position]);
        playerImg.setImageResource(playerImages[position]);
        return convertView;



    }
}
