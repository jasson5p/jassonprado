package com.uisrael.jassonprado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {

    EditText ingre;
    CheckBox op1,op2,op3;
    RadioButton rop1,rop2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);
        op1=findViewById(R.id.ch1);
        op2=findViewById(R.id.ch2);
        op3=findViewById(R.id.ch3);
        rop1=findViewById(R.id.rd1);
        rop2=findViewById(R.id.rd2);
        ingre=findViewById(R.id.inputedu);


    }

    public  void  abrirAc(View v){

        Intent abrir_v2 = new Intent(  Encuesta.this, Resumen.class);
        abrir_v2.putExtra("DATOSENVIADOS1", op1.getText().toString());
        abrir_v2.putExtra("DATOSENVIADOS2", op2.getText().toString());
        abrir_v2.putExtra("DATOSENVIADOS3", op3.getText().toString());
        abrir_v2.putExtra("DATOSENVIADOS4", rop1.getText().toString());
        abrir_v2.putExtra("DATOSENVIADOS5", rop2.getText().toString());
        abrir_v2.putExtra("DATOSENVIADOS6", ingre.getText().toString());

        startActivity(abrir_v2);
        Toast.makeText(getApplicationContext()," Guardado exito ",Toast.LENGTH_LONG).show();

    }

}
