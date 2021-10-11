package com.example.componenttests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void Szamol (View view ){

        Log.i(  "Info","Gomb megnyomva");

        EditText ertek1 = (EditText)  findViewById(R.id.etErtek1);
        EditText ertek2 = (EditText)  findViewById(R.id.etErtek2);

        if(ertek1 != null && ertek2 != null)
        {
           double ertek1Szam  = Double.parseDouble(ertek1.getText().toString());
           double ertek2Szam  = Double.parseDouble(ertek2.getText().toString());

            String eredmeny = String.format("%.2f",ertek1Szam*ertek2Szam);
            Toast.makeText( this, eredmeny, Toast.LENGTH_LONG).show();
        }



    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}