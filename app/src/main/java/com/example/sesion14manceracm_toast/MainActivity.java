package com.example.sesion14manceracm_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPrimero,btnSegundo,btnTercero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//Inicia Metodo onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrimero=findViewById(R.id.btnPrimero);
        btnSegundo=findViewById(R.id.btnSegundo);
        btnTercero=findViewById(R.id.btnTercero);
    }// Termina Metodo onCreate

    public void primerToast(View view){//inicia metodo
        Context context = getApplicationContext();
        CharSequence mensaje="Mensaje TOAST \nDiego Mancera \n CM";
        int duration=Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,mensaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        //Toast integrado
        Toast.makeText(this, "Ventana Emergente 2", Toast.LENGTH_SHORT).show();
    }//termina metodo

    public void segundoToast(View view){//inicia metodo
        Context context = getApplicationContext();
        CharSequence mensaje="Mensaje TOAST \nDiego Mancera \n CM";
        int duration=Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,mensaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        //Toast integrado
        Toast.makeText(this, "Ventana Emergente 2", Toast.LENGTH_SHORT).show();
    }//termina metodo

    public void tercerToast(View view){//inicia metodo
        Context context = getApplicationContext();
        CharSequence mensaje="Mensaje TOAST \nDiego Mancera \n CM";
        int duration=Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context,mensaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        //Toast integrado
        Toast.makeText(this, "Ventana Emergente 2", Toast.LENGTH_SHORT).show();
    }//termina metodo

    //Toast Personalizado con XML
    public void toastPersonalizadoXML1(View view){//inicia metodo
        // Inflater=> Ejecucion, visualizacion, desplegado de una vista
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast2,null);

        Toast toastXML =new Toast(getApplicationContext());
        toastXML.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toastXML.setDuration(Toast.LENGTH_LONG);
        //integracion de los elementos
        toastXML.setView(layout);
        toastXML.show();

    }//Termina metodo




    }//Termina Class