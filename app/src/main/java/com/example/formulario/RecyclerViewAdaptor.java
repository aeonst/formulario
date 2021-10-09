package com.example.formulario;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptor extends RecyclerView.Adapter<RecyclerViewAdaptor.ViewHolder> {
    public static class ViewHolder extends RecyclerView.ViewHolder{
    private TextView codigo,nombre ,carrera;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            codigo=(TextView) itemView.findViewById(R.id.tvcodigo);
            nombre=(TextView) itemView.findViewById(R.id.tvnombre);
            carrera=(TextView) itemView.findViewById(R.id.tvcarrera);

        }
    }

    public RecyclerViewAdaptor(List<estudianteModelo> estudianteModeloList) {
        this.estudianteModeloList = estudianteModeloList;
    }

    public List <estudianteModelo> estudianteModeloList;


}
