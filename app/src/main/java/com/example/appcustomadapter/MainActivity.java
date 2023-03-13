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
        ArrayList<Jugadores> jugadores= obtenerJugadores();

        // Configurar el adaptador jugadores
        CustomBaseAdapter adapter = new CustomBaseAdapter(this, jugadores);

        // Mostrar la lista de jugadores
        JugadoresListView = findViewById(R.id.customListView);
        JugadoresListView.setAdapter(adapter);


    }
    private ArrayList<Jugadores> obtenerJugadores() {
        ArrayList<Jugadores>  jugadores = new ArrayList<>();

        // Agregar los jugadores a la lista
        jugadores.add(new Jugadores("Lionel Messi", "Nombre Completo: Lionel Andres Messi Cuccittini\n" +
                "Edad: 35\n" +
                "Nacionalidad: Argentina\n" +
                "Equipos : Paris Sainxt-Germain Football Club( Actual #30 /Delantero), Fc Barcelona, Newell´s old boys , Seleccion Argentina(Actual # 10 / Delantero).\n" +
                "Estatura: 1.69 M\n" +
                "Nacimiento : 24 de Junio de 1987 ."+"\n\nResumen: \n Lionel Andrés Messi Cuccittini, conocido como Leo Messi, es un futbolista argentino que juega como delantero o centrocampista. Jugador" + " histórico del Fútbol Club Barcelona, al que estuvo ligado veinte años, desde 2021 integra el plantel del Paris Saint-Germain de la Ligue 1 de Francia. Recientemente gano la copa del mundo en Qatar 2022 , con la Seleccion de Argentina.\n"
                , R.drawable.img_2));

        jugadores.add(new Jugadores("Cristiano Ronaldo", "Nombre Completo: Cristiano Ronaldo dos Santos Aveiro\n" +
                "Edad: 38\n" +
                "Nacionalidad: Portugues.\n" +
                "Equipos: Al-Nassr(Actual), Manchester United, Real Madrid, Sporting de Lisboa, Seleccion de Portugal.\n" +
                "Estatura: 1.87 M\n" +
                "Nacimiento: 5 de febrero de 1985."+"\n\nResumen:\nCristiano Ronaldo dos Santos Aveiro, conocido como Cristiano Ronaldo, es un futbolista portugués. Juega como extremo izquierdo o delantero y su equipo actual es el Al-Nassr F. C. de la Liga Profesional Saudí.\u200BEs internacional absoluto con la selección de Portugal, de la cual es capitán y máximo goleador histórico.\n"
                , R.drawable.cristiano));

        jugadores.add(new Jugadores("Robert Lewandoski", "Nombre Completo: Robert Lewandowski\n" +
                "Edad:34\n" +
                "Nacionalidad: Polaca\n" +
                "Equipos: Futbol Club Barcelona(#9 Actual) , Bayern Munich, Borrussia Dormund, Seleccion Polonia.\n" +
                "Estatura:1.85 M\n" +
                "Nacimiento: 21 de agosto de 1988"+"\n\nResumen:\n" +
                "Robert Lewandowski es un futbolista polaco que juega como delantero en el F. C. Barcelona de la Primera División de España. Es además internacional absoluto con la selección de Polonia desde 2008, de la cual es su capitán y máximo goleador histórico.\u200B\n", R.drawable.img_1));

        jugadores.add(new Jugadores("Karim Benzema", "Nombre Completo: Karim Mostafa Benzema\n" +
                "Edad: 35\n" +
                "Nacionalidad: Frances\n" +
                "Equipos:Real Madrid Club de Futbol (#9/ Delantero Actual) , Olimpyque Lyon, Seleccion Francesa\n" +
                "Estatura:1.85 M\n" +
                "Nacimiento: 19 de diciembre de 1987"+"\n\nResumen:\n" +
                "Karim Benzema es un futbolista francés de ascendencia argelina \u200B\u200Bque juega como delantero en el Real Madrid Club de Fútbol de la Primera División de España desde la temporada 2009-10.", R.drawable.img));

        jugadores.add(new Jugadores("Kylian Mbappe", "Nombre Completo:Kylian Mbappé Lottin \n" +
                "Eda:24\n" +
                "Nacionalidad:Frances\n" +
                "Equipos:Paris Saint-Germain(#7/Delantero Actual) \n" +
                "Estatura:1.78 M\n" +
                "Nacimiento: 20 de diciembre de 1998"+"\n\nResumen:\n" +
                "Karim Benzema es un futbolista francés de ascendencia argelina \u200B\u200Bque juega como delantero en el Real Madrid Club de Fútbol de la Primera División de España desde la temporada 2009-10.", R.drawable.mbappe));

        jugadores.add(new Jugadores("Erling Haaland", "Nombre Completo:Erling Braut Haaland\n" +
                "Edad:22\n" +
                "Nacionalidad:Noruega\n" +
                "Equipos:Manchester City Football Club (#9 / Delantero), Selección de fútbol de Noruega (Delantero)\n" +
                "Estatura:1.94 M\n" +
                "Nacimiento: 21 de julio de 2000 (edad 22 años), Leeds, Reino Unidos"+"\n\nResumen:\n" +
                "Erling Braut Haaland es un futbolista noruego que juega como delantero en el Manchester City F. C. de la Premier League de Inglaterra.\u200B", R.drawable.haaland));

        jugadores.add(new Jugadores("Vinicius JR", "Nombre Completo:Vinícius José Paixaõ de Oliveira Junior\n" +
                "Edad:22\n" +
                "Nacionalidad:Brasileño\n" +
                "Equipos: Selección de fútbol de Brasil (#18 / Delantero), Real Madrid Club de Fútbol (#20 / Delantero)\n" +
                "Estatura:1.76 M\n" +
                "Nacimiento: 12 de julio de 2000 (edad 22 años), São Gonçalo, Estado de Río de Janeiro, Brasil"+"\n\nResumen:\n" +
                "Vinícius José Paixaõ de Oliveira Junior, es un futbolista brasileño con nacionalidad española que juega como delantero en el Real Madrid C. F. de la Primera División de España.", R.drawable.vini));

        jugadores.add(new Jugadores("Neymar JR", "Nombre Completo:Neymar da Silva Santos Júnior\n" +
                "Edad:31\n" +
                "Nacionalidad:Brasileño\n" +
                "Equipos: París Saint-Germain Football Club (#10 / Delantero), Selección de fútbol de Brasil (#10 / Delantero), Brazil\n" +
                "Estatura:1.75\n" +
                "Nacimiento: 5 de febrero de 1992 (edad 31 años), Mogi das Cruzes, Estado de São Paulo, Brasil"+"\n\nResumen:\n" +
                "Neymar da Silva Santos Júnior, conocido como Neymar Júnior o simplemente Neymar, es un futbolista brasileño que juega como delantero en el Paris Saint-Germain F.", R.drawable.neymar));

        jugadores.add(new Jugadores("Thomas Muller", "Nombre Completo:Thomas Müller \n" +
                "Edad:33\n" +
                "Nacionalidad: Alemana\n" +
                "Equipos:  Selección de fútbol de Alemania (#13 / Delantero), Bayern de Múnich (#25 / Delantero)\n" +
                "Estatura:1.85M\n" +
                "Nacimiento:  13 de septiembre de 1989 (edad 33 años), Weilheim in Oberbayern, Alemania"+"\n\nResumen:\n" +
                "Thomas Müller es un futbolista alemán que juega de delantero y centrocampista en el Bayern de Múnich de la Bundesliga. Fue internacional absoluto de la selección de fútbol de Alemania.\u200B Es el futbolista alemán que más títulos ha conquistado en toda la historia del futbol, con un total de 32.", R.drawable.muller));

        jugadores.add(new Jugadores("Ousmane Dembele", "Nombre Completo: Masour Ousmane Dembélé \n" +
                "Edad: 25 Años\n" +
                "Nacionalidad: Francesa\n" +
                "Equipos: Fútbol Club Barcelona (#7 / Delantero), Selección de fútbol de Francia (#11 / Delantero) \n" +
                "Estatura: 1.78 M\n" +
                "Nacimiento: 15 de mayo de 1997 (edad 25 años), Vernon, Francia "+"\n\nMasour Ousmane Dembélé es un futbolista francés que juega como delantero en el F. C. Barcelona de la Primera División de España. Es internacional con la selección de fútbol de Francia.", R.drawable.dembele));

        jugadores.add(new Jugadores("Andres Iniesta", "Nombre Completo:Andrés Iniesta Luján\n" +
                "Edad:38\n" +
                "Nacionalidad:Española\n" +
                "Equipos:  Vissel Kobe (#8 / Centrocampista), Fc Barcelona, Seleccion Española\n" +
                "Estatura:1.70\n" +
                "Nacimiento:  11 de mayo de 1984 (edad 38 años), Fuentealbilla, España"+"\n\nResumen:\n" +
                "Andrés Iniesta Luján, conocido simplemente como Iniesta, es un futbolista y licenciado en Ciencias de la Actividad Física y del Deporte\u200B español que juega como centrocampista en el Vissel Kobe de la J1 League de Japón.\u200BFue internacional absoluto con la selección de fútbol de España, de la cual fue su capitán.", R.drawable.iniesta));

        jugadores.add(new Jugadores("Mohamed Salah", "\n" +
                "Nombre Completo:Mohamed Salah Hamed Mahrous Ghaly\n" +
                "Edad:30\n" +
                "Nacionalidad:Egipcia\n" +
                "Equipos: Liverpool Football Club (#11 / Delantero), Selección de fútbol de Egipto (#10 / Delantero)\n" +
                "Estatura:1.75 M\n" +
                "Nacimiento: 15 de junio de 1992 (edad 30 años), Nagrig, Egipto\n"+"\nResumen:\n" +
                "Mohamed Salah Hamed Mahrous Ghaly, más conocido como Mohamed Salah, es un futbolista egipcio que juega como delantero en el Liverpool F. C. de la Premier League. En 2013 fue galardonado con el premio SAFP Golden Player por ser el mejor jugador de la Superliga de Suiza.", R.drawable.salah));

        jugadores.add(new Jugadores("Angel Di Maria", "\n" +
                "Nombre Completo:Ángel Fabián Di María\n" +
                "Edad:35\n" +
                "Nacionalidad:Argentina\n" +
                "Equipos: Juventus de Turín (#22 / Centrocampista), Selección de fútbol de Argentina (#11 / Centrocampista)\n" +
                "Estatura:1.80 M\n" +
                "Nacimiento: 14 de febrero de 1988 (edad 35 años), Rosario, Argentina\n"+"\nResumen:\n" +
                "Ángel Fabián Di María es un futbolista argentino. Juega de extremo en la Juventus de Turín de la Serie A de Italia y en la Seleccion de Argentina, Actualmente Campeona del Mundo.\n" +
                "\n", R.drawable.dimaria));



        return jugadores;
    }

}