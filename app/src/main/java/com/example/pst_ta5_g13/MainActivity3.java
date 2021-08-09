package com.example.pst_ta5_g13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity3 extends AppCompatActivity {

    ListView lista;

    String[][] datos = {
            {"La Historia del Loco", "Suspenso", "Francis Petrel tenía poco más de veinte años cuando su familia lo recluyó en el psiquiátrico tras una conducta imprevisible que culminó en una crisis. Ahora, alcanzada la mediana edad, lleva una vida sin rumbo y solitaria, alojado en un piso barato y permanentemente medicado para acallar el coro de voces en su cabeza."},
            {"Soy Número cuatro", "Ciencia Ficción", "Un fugitivo extraterrestre, uno de nueve que viven en la Tierra, tiene habilidades extraordinarias y se hace pasar por un adolescente ordinario con la esperanza de evitar a las personas que desean matarlo."},
            {"La Ladrona de Libros", "Ficción Historica ", "En la Alemania de la era nazi, el Ángel de la Muerte narra la historia de una niña adoptada, quien aprende a leer gracias a su padre. Ella se hace amiga de un joven judío, cuyos padres están ocultando."},
            {"El Principito", "Infantil", "El principito es una narración corta del escritor francés Antoine de Saint-Exupéry, que trata de la historia de un pequeño príncipe que parte de su asteroide a una travesía por el universo, en la cual descubre la extraña forma en que los adultos ven la vida y comprende el valor del amor y la amistad."}

    };

    int[] datosImg = {R.drawable.loco, R.drawable.soy_numero_cuatro, R.drawable.ladrona, R.drawable.principito};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lista = (ListView) findViewById(R.id.Vilista);

        lista.setAdapter(new Adaptador(this, datos, datosImg));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent visorDetalles = new Intent(view.getContext(), Sinopsis.class);
                visorDetalles.putExtra("TIT", datos[position][0]);
                visorDetalles.putExtra("DET", datos[position][4]);
                startActivity(visorDetalles);
            }   
        });
    }
}























