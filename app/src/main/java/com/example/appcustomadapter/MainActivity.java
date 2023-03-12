package com.example.appcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView JugadoresListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Obtener la lista de jugadores
        ArrayList<Jugadores> jugadores= obtenerProductos();

        // Configurar el adaptador jugadores
        CustomBaseAdapter adapter = new CustomBaseAdapter(this, jugadores);

        // Mostrar la lista de jugadores
        JugadoresListView = findViewById(R.id.customListView);
        JugadoresListView.setAdapter(adapter);


    }
    private ArrayList<Jugadores> obtenerProductos() {
        ArrayList<Jugadores>  jugadores = new ArrayList<>();

        // Agregar los jugadores a la lista
        jugadores.add(new Jugadores("Lionel Messi", "Nombre Completo: Lionel Andres Messi Cuccittini\n" +
                "Edad: 35\n" +
                "Nacionalidad: Argentina\n" +
                "Equipos : Paris Saint-Germain Football Club(Actual #30 /Delantero), Fc Barcelona, Newell´s old boys , Seleccion Argentina(Actual # 10 / Delantero).\n" +
                "Estatura: 1.69 M\n" +
                "Nacimiiento : 24 de Junio de 1987 .", R.drawable.img_2));
        jugadores.add(new Jugadores("Cristiano Ronaldo", "Nombre Completo: Cristiano Ronaldo dos Santos Aveiro\n" +
                "Eda: 38\n" +
                "Nacionalida: Portugues.\n" +
                "Equipos: Al-Nassr(Actual), Manchester United, Real Madrid, Sporting de Lisboa, Seleccion de Portugal.\n" +
                "Estatura: 1.87 M\n" +
                "Nacimiento: 5 de febrero de 1985 ", R.drawable.cristiano));

        jugadores.add(new Jugadores("Robert Lewandoski", "Nombre Completo: Robert Lewandowski\n" +
                "Edad:34\n" +
                "Nacionalidad: Polaca\n" +
                "Equipos: Futbol Club Barcelona(#9 Actual) , Bayern Munich, Borrussia Dormund, Seleccion Polonia.\n" +
                "Estatura:1.85 M\n" +
                "Nacimiento:21 de agosto de 1988", R.drawable.img_1));

        jugadores.add(new Jugadores("Karim Benzema", "Nombre Completo: Karim Mostafa Benzema\n" +
                "Edad: 35\n" +
                "Nacionalidad: Frances\n" +
                "Equipos:Real Madrid Club de Futbol (#9/ Delantero Actual) , Olimpyque Lyon, Seleccion Francesa\n" +
                "Estatura:1.85 M\n" +
                "Nacimiento: 19 de diciembre de 1987", R.drawable.img));

        jugadores.add(new Jugadores("Kylian Mbappe", "Nombre Completo:Kylian Mbappé Lottin \n" +
                "Eda:24\n" +
                "Nacionalidad:Frances\n" +
                "Equipos:Paris Saint-Germain(#7/Delantero Actual) \n" +
                "Estatura:1.78 M\n" +
                "Nacimiento: 20 de diciembre de 1998 ", R.drawable.mbappe));

        jugadores.add(new Jugadores("Erling Haaland", "Nombre Completo:Erling Braut Haaland\n" +
                "Edad:22\n" +
                "Nacionalidad:Noruega\n" +
                "Equipos:Manchester City Football Club (#9 / Delantero), Selección de fútbol de Noruega (Delantero)\n" +
                "Estatura:1.94 M\n" +
                "Nacimiento: 21 de julio de 2000 (edad 22 años), Leeds, Reino Unidos", R.drawable.haaland));

        jugadores.add(new Jugadores("Vinicius JR", "Nombre Completo:Vinícius José Paixaõ de Oliveira Junior\n" +
                "Edad:22\n" +
                "Nacionalidad:Brasileño\n" +
                "Equipos: Selección de fútbol de Brasil (#18 / Delantero), Real Madrid Club de Fútbol (#20 / Delantero)\n" +
                "Estatura:1.76 M\n" +
                "Nacimiento: 12 de julio de 2000 (edad 22 años), São Gonçalo, Estado de Río de Janeiro, Brasil", R.drawable.vini));

        jugadores.add(new Jugadores("Neymar JR", "Nombre Completo:Neymar da Silva Santos Júnior\n" +
                "Edad:31\n" +
                "Nacionalidad:Brasileño\n" +
                "Equipos: París Saint-Germain Football Club (#10 / Delantero), Selección de fútbol de Brasil (#10 / Delantero), Brazil\n" +
                "Estatura:1.75\n" +
                "Nacimiento: 5 de febrero de 1992 (edad 31 años), Mogi das Cruzes, Estado de São Paulo, Brasil", R.drawable.neymar));

        jugadores.add(new Jugadores("Thomas Muller", "Nombre Completo:Thomas Müller \n" +
                "Edad:33\n" +
                "Nacionalidad: Alemana\n" +
                "Equipos:  Selección de fútbol de Alemania (#13 / Delantero), Bayern de Múnich (#25 / Delantero)\n" +
                "Estatura:1.85M\n" +
                "Nacimiento:  13 de septiembre de 1989 (edad 33 años), Weilheim in Oberbayern, Alemania", R.drawable.muller));

        jugadores.add(new Jugadores("Ousmane Dembele", "Nombre Completo:\n" +
                "Edad:\n" +
                "Nacionalidad:\n" +
                "Equipos: \n" +
                "Estatura:\n" +
                "Nacimiento: ", R.drawable.dembele));

        jugadores.add(new Jugadores("Andres Iniesta", "Nombre Completo:Andrés Iniesta Luján\n" +
                "Edad:38\n" +
                "Nacionalidad:Española\n" +
                "Equipos:  Vissel Kobe (#8 / Centrocampista), Fc Barcelona, Seleccion Española\n" +
                "Estatura:1.70\n" +
                "Nacimiento:  11 de mayo de 1984 (edad 38 años), Fuentealbilla, España", R.drawable.iniesta));

        jugadores.add(new Jugadores("Mohamed Salah", "\n" +
                "Nombre Completo:Mohamed Salah Hamed Mahrous Ghaly\n" +
                "Edad:30\n" +
                "Nacionalidad:Egipcia\n" +
                "Equipos: Liverpool Football Club (#11 / Delantero), Selección de fútbol de Egipto (#10 / Delantero)\n" +
                "Estatura:1.75 M\n" +
                "Nacimiento: 15 de junio de 1992 (edad 30 años), Nagrig, Egipto\n", R.drawable.salah));

        jugadores.add(new Jugadores("Angel Di Maria", "\n" +
                "Nombre Completo:Ángel Fabián Di María\n" +
                "Edad:35\n" +
                "Nacionalidad:Argentina\n" +
                "Equipos: Juventus de Turín (#22 / Centrocampista), Selección de fútbol de Argentina (#11 / Centrocampista)\n" +
                "Estatura:1.80 M\n" +
                "Nacimiento: 14 de febrero de 1988 (edad 35 años), Rosario, Argentina", R.drawable.dimaria));



        return jugadores;
    }

}