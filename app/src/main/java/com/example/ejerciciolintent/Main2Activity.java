package com.example.ejerciciolintent;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Main2Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnRegresar = (Button) findViewById(R.id.btnRegresar);
        final TextView txtNombre = (TextView) findViewById(R.id.txtNombre);
        String nombre="";
        Bundle extras = getIntent().getExtras();
        nombre=extras.getString("NOMBRE");
        nombre = nombre.toUpperCase();
        txtNombre.setText(nombre);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), MainActivity.class);
                String iNombre= txtNombre.getText().toString();
                i2.putExtra("NOMBRE",iNombre);
                startActivity(i2);
            }
        });
    }
}