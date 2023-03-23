package com.example.parcial2_alvarez_cristian_2503112019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String [] personas={"Alexander Pierrot","Carlos Lopez","Sara Bonz", "Liliana Clarence", "Benito Peralta", "Juan Jaramillo", "Christian Steps", "Alexa Giraldo", "Linda Murillo", "Lizeth Astrada"};
    String [] cargo={"CEO ","Asistente ","Directora de Marketing", "Diseñadora de Producto", "Supervisor de Ventas", "CEO", "CTO", "Lead Programmer", "Directora de Marketing", "CEO"};
    String [] compañia={"Insures S.O.","Hospital Blue","Electrical Parts Itd", "Creativa App", "Neumaticos Press", "Banco Nacional", "Cooperativa Verde", "Frutisofy", "Seguros Boliver", "Concesionario Motolox"};
    ListView lvstPersonas;
    Integer []ImgPers= {
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,
            R.drawable.lead_photo_10,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdaptadorPersona adaptador = new AdaptadorPersona(this,personas,cargo,compañia,ImgPers);
        lvstPersonas = findViewById(R.id.lstPersonas);
        lvstPersonas.setAdapter(adaptador);
    }
}