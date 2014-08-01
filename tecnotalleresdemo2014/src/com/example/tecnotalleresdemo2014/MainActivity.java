package com.example.tecnotalleresdemo2014;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Definimos y asociamos un Boton al valor del ID en nuestro archivo activity_main.xml.
		// Cuando creamos el archivo xml dimos un valor de ID para el boton. En este caso BtnHola
		
        final Button btnHola = (Button)findViewById(R.id.BtnHola);
        
        // Si queremos enviar texto entre Activities, recuperamos el valor entregado por el usuario. TxtNombre
        // es el ID que le dimos en el fichero acitivity_main.xml al editText.
        
        // Asociamos ambos elementos
        // final EditText txtNombre = (EditText)findViewById(R.id.TxtNombre);
        
        //Implementamos el evento “click” para el boton btnHola que creamos mas arriba
        btnHola.setOnClickListener(new OnClickListener() {
             @Override
             public void onClick(View v) {
                  //Creamos el Intent, indicamos Actividad de origen (MainActivity) y la Actividad que se ejecutara despues
            	 // En este caso Activity_2
                  Intent intent = new Intent(MainActivity.this, Activity_2.class);
 
                  // Para pasar información entre actividades creamos el siguiente elemento
                  // txtNombre es el valor creado que recogue el elemento de nuestro archivo xml.
              
                  //Bundle b = new Bundle();
                 // b.putString("NOMBRE", txtNombre.getText().toString());
 
                  //Añadimos la información al intent
                 // intent.putExtras(b);
 
                  //Iniciamos la nueva actividad
                  startActivity(intent);
             }
        });
    }

 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
