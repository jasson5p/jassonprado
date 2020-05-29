package com.uisrael.jassonprado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Resumen extends AppCompatActivity {

    EditText recibir3,recibir2,recibir1,recibir4;
    Bundle datos3,datos2,datos1,datos4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

        recibir1 = findViewById(R.id.resumen);
        datos1 = getIntent().getExtras();
        String datoRecibi1 = datos1.getString("DATOSENVIADOS6");
        recibir1.setText(datoRecibi1);



        recibir2 = findViewById(R.id.deporte);
        datos2 = getIntent().getExtras();
        String datoRecibid1 = datos2.getString("DATOSENVIADOS1");
        String datoRecibid2 = datos2.getString("DATOSENVIADOS2");
        String datoRecibid3 = datos2.getString("DATOSENVIADOS3");
        recibir2.setText(datoRecibid1);
        recibir2.setText(datoRecibid2);
        recibir2.setText(datoRecibid3);

        recibir4= findViewById(R.id.etTotal);
        datos4 = getIntent().getExtras();




        recibir3 = findViewById(R.id.ingles);
        datos3 = getIntent().getExtras();
        String datoRecibido = datos3.getString("DATOSENVIADOS4");
        String datoRecibido1 = datos3.getString("DATOSENVIADOS5");
        recibir3.setText(datoRecibido);
        recibir3.setText(datoRecibido1);
    }
}
