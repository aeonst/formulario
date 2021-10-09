package com.example.formulario;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

public class basededatos extends SQLiteOpenHelper {

    private static final String NOMBRE_BD = "bdproyecto.bd";
    private static final int  VERSION_BD=1;
    private static final String TABLA_ESTUDIANTE = "create table estudiantes(codigo text  primary key,nombre text , carrera text )";

    public basededatos (Context context){
        super(context,NOMBRE_BD,null,VERSION_BD);
    }
    public void onCreate(SQLiteDatabase db){
        db.execSQL(TABLA_ESTUDIANTE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF exists"+TABLA_ESTUDIANTE);
        db.execSQL(TABLA_ESTUDIANTE);

    }
    public void agregarEstudiantes(String codigo,String nombre,String carrera ){
        SQLiteDatabase bd = getReadableDatabase();
        if(bd!= null){
            bd.execSQL("INSERT INTO estudiantes VALUES ('"+codigo+"','"+nombre+"','"+carrera+"')");
            bd.close();

        }
    }
}
