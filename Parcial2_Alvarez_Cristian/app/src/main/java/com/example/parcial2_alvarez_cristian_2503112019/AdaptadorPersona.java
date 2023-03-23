package com.example.parcial2_alvarez_cristian_2503112019;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorPersona extends ArrayAdapter<String> {
    Activity contexto;
    String []personas;
    String []cargo;
    String []compañias;
    Integer [] ImgPers;
    ImageView imgPersona;
    TextView tvNombrePerson;
    TextView tvCargoPerson;
    TextView tvCompañiaPerson;

    public AdaptadorPersona (Activity contexto,String [] personas,String []cargo,String []compañias, Integer[] ImgPers){
        super(contexto,R.layout.personas,personas);
        this.contexto=contexto;
        this.personas=personas;
        this.cargo=cargo;
        this.compañias=compañias;
        this.ImgPers=ImgPers;
    }
    public View getView(int position, View v, ViewGroup parent) {
        LayoutInflater inflater = contexto.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.personas,null, true);
        tvNombrePerson=rowView.findViewById(R.id.tvNombrePersona);
        tvCargoPerson=rowView.findViewById(R.id.tvCargoPersona);
        tvCompañiaPerson=rowView.findViewById(R.id.tvCompañia);
        imgPersona=rowView.findViewById(R.id.imgvPersonas);
        tvNombrePerson.setText(personas[position]);
        tvCargoPerson.setText(cargo[position]);
        tvCompañiaPerson.setText(compañias[position]);
        imgPersona.setImageResource(ImgPers[position]);
        return rowView;
    }

}
