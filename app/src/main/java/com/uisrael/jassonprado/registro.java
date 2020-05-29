package com.uisrael.jassonprado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class registro extends AppCompatActivity {
    EditText recibir,nombre,inicial,mensual;
    Bundle datos;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        recibir = findViewById(R.id.usuario);
        datos = getIntent().getExtras();
        String datoRecibido = datos.getString("DATOSENVIADOS");
        recibir.setText(datoRecibido);
        nombre = findViewById(R.id.inputnombre);
        mensual = findViewById(R.id.editText3);
        inicial= findViewById(R.id.editText2);
    }
    public void Ingreso(View v){
        double mi,men, pagoMensual, total;
        double monto_inicial = 1800;

        mi =Double.parseDouble(inicial.getText().toString());
        men =  monto_inicial - mi;
        pagoMensual = men / 3;
        total = pagoMensual + 90;
        mensual.setText(Double.toString(total));

    }

    public  void  abrirAc(View v){

        Intent abrir_v2 = new Intent(  registro.this, Encuesta.class);
        abrir_v2.putExtra("DATOSENVIADOS", recibir.getText().toString());
        abrir_v2.putExtra("DATOSENVIADOS1", nombre.getText().toString());
        startActivity(abrir_v2);
        Toast.makeText(getApplicationContext()," Guardado con exito ",Toast.LENGTH_LONG).show();

    }

}
