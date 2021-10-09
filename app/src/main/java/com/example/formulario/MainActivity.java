package com.example.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText CODIGO1,CARRERA,nOMBRE1;
    Button aregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CODIGO1=(EditText) findViewById(R.id.CODIGO1);
        CARRERA=(EditText) findViewById(R.id.CARRERA);
        nOMBRE1=(EditText) findViewById(R.id.nOMBRE1);
        aregar=(Button) findViewById(R.id.aregar);

        final basededatos basededatos = new basededatos(getApplicationContext());

        aregar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
              basededatos.agregarEstudiantes(CODIGO1.getText().toString(),nOMBRE1.getText().toString(),CARRERA.getText().toString());
                Toast.makeText(getApplicationContext(),"la datos an cido ingresados exitosamente ",Toast.LENGTH_LONG).show();
            }

        });





    }
}