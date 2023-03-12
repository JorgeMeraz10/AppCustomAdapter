package com.example.appcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BiblioActivity extends AppCompatActivity {
    private TextView nombreTextView;
    private TextView descripcionTextView;

    private ImageView imagenImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblio);
        // Obtener la información del producto seleccionado
        Intent intent = getIntent();
        String nombre = intent.getStringExtra("nombre");
        String descripcion = intent.getStringExtra("descripcion");

        int imagen = intent.getIntExtra("imagen", R.drawable.ic_launcher_foreground);

        // Mostrar la información del producto
        nombreTextView = findViewById(R.id.txtnombre);
        descripcionTextView = findViewById(R.id.txtdescripcion);
        imagenImageView = findViewById(R.id.imageView);

        nombreTextView.setText(nombre);
        descripcionTextView.setText(descripcion);
        imagenImageView.setImageResource(imagen);

    }
}