package com.example.cristi.independentafinanciara;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    float libertate_financiara = 0, sala = 0;
    float economii_termen_lung = 0, educatie= 0, necesitati= 0, joaca= 0, donatii= 0;
  TextView libertateFinanciara, economiiTermenLung,educatieFinanciara, necesitatiFinanciare,
    joacaFinanciara,donatiiFinanciare;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         libertateFinanciara = (TextView) findViewById(R.id.libertate_financiara);
          economiiTermenLung = (TextView) findViewById(R.id.economii_termen_lung);
          educatieFinanciara = (TextView) findViewById(R.id.educatie);
         necesitatiFinanciare = (TextView) findViewById(R.id.necesitati);
          joacaFinanciara = (TextView) findViewById(R.id.joaca);
         donatiiFinanciare = (TextView) findViewById(R.id.donatii);



    }

    public void calculeaza(View view) {
        EditText salar = (EditText) findViewById(R.id.editText);
      sala = Integer.parseInt(salar.getText().toString());
        libertate_financiara = libertate_financiara + sala/10;
        economii_termen_lung = economii_termen_lung + sala/10;
        educatie = educatie + sala/10;
        necesitati = sala * 55/100;
        joaca = sala * 5/100;
        donatii = sala * 10/100;

        //Afisare informatii
        libertateFinanciara.setText(String.valueOf(libertate_financiara));
        economiiTermenLung.setText(String.valueOf(economii_termen_lung));
        educatieFinanciara.setText(String.valueOf(educatie));
        necesitatiFinanciare.setText(String.valueOf(necesitati));
        joacaFinanciara.setText(String.valueOf(joaca));
        donatiiFinanciare.setText(String.valueOf(donatii));


    }
}
