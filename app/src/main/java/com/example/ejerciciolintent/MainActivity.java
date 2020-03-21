package com.example.ejerciciolintent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity {
    static boolean primera = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnAceptar=(Button)findViewById(R.id.btnEnviar);
        final EditText edtNombre=(EditText)findViewById(R.id.edtNombre);
        if(primera == false) {
            String nombre = "";
            Bundle extras = getIntent().getExtras();
            nombre = extras.getString("NOMBRE");
            nombre = nombre.toLowerCase();
            edtNombre.setText(nombre);
        }
        else
            primera = false;
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                String sNombre=edtNombre.getText().toString();
                intent.putExtra("NOMBRE",sNombre);
                startActivity(intent);
            }
        });
    }
}