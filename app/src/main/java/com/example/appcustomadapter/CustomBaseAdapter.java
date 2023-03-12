package com.example.appcustomadapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflater;
    private List<Jugadores> jugadores;




    public  CustomBaseAdapter(Context context, ArrayList<Jugadores> jugadores)
    {
        this.context = context;
        this.jugadores = jugadores;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return jugadores.size();
    }

    @Override
    public Object getItem(int position) {

        return jugadores.get(position);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_custom_list_view, parent, false);
        }

        ImageView imagenImageView = convertView.findViewById(R.id.imageIcom);
        TextView nombreTextView = convertView.findViewById(R.id.txtnombre);

        Jugadores jugador= jugadores.get(position);
        imagenImageView.setImageResource(jugador.getImagen());
        nombreTextView.setText(jugador.getNombre());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pasar la información del producto seleccionado a la actividad de BiblioActivity
                Intent intent = new Intent(context, BiblioActivity.class);
                intent.putExtra("nombre", jugador.getNombre());
                intent.putExtra("descripcion",jugador .getDescripcion());
                intent.putExtra("imagen", jugador.getImagen());
                context.startActivity(intent);
            }
        });

        return convertView;
    }








    }
