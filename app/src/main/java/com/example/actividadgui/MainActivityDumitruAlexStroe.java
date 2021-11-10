package com.example.actividadgui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityDumitruAlexStroe extends AppCompatActivity {

    private EditText txtHorasDia, txtDiasSemana;
    private CheckBox chkbRefrigeracion, chkbLeds;
    private RadioGroup rgroupUso, rgroupProcesador;
    private RadioButton rbnGaming, rbnOficina, rbnIntel, rbnAmd;
    private Button btnCalcular, btnLimpiar;
    private TextView lblResultado, lblWatios;
    int numHoras, numDias, intIntel, intAmd, intOficina, intGaming, intRefrig=0, intLeds=0, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHorasDia = (EditText) findViewById(R.id.txtHorasDias);
        txtDiasSemana = (EditText) findViewById(R.id.txtDiasSemana);
        chkbRefrigeracion = (CheckBox) findViewById((R.id.chkbRefrigeracion));
        chkbLeds = (CheckBox) findViewById((R.id.chkbLeds));
        rgroupUso = (RadioGroup) findViewById((R.id.rgroupUso));
        rgroupProcesador = (RadioGroup) findViewById((R.id.rgroupProcesador));
        rbnGaming = (RadioButton) findViewById((R.id.rbnGaming));
        rbnOficina = (RadioButton) findViewById((R.id.rbnOficina));
        rbnIntel = (RadioButton) findViewById((R.id.rbnIntel));
        rbnAmd = (RadioButton) findViewById((R.id.rbnAmd));
        btnCalcular = (Button) findViewById((R.id.btnCalcular));
        btnLimpiar = (Button) findViewById((R.id.btnLimpiar));
        lblResultado = (TextView) findViewById((R.id.lblResultado));
        lblWatios = (TextView) findViewById(R.id.lblWatios);
    }

    public void Calcular(View v){

        lblWatios.setVisibility(View.VISIBLE);
        int horas = Integer.parseInt(txtHorasDia.getText().toString());
        int dias = Integer.parseInt(txtDiasSemana.getText().toString());
        total = 0;

        horas = 0;
        dias = 0;

        if (horas < 4 ){
            numHoras = 65;
        } else if (horas > 4 && horas < 8){
            numHoras = 75;
        } else if (horas > 8){
            numHoras = 95;
        }

        if (dias < 2){
            numDias = 65;
        } else if (dias > 2 && dias < 5){
            numDias = 80;
        } else {
            numDias = 100;
        }

        if (rbnIntel.isChecked()){
            intIntel = 70;
        } else if (rbnAmd.isChecked()){
            intAmd = 90;
        }

        if (chkbRefrigeracion.isChecked()){
            intRefrig = 40;
        }

        if (chkbLeds.isChecked()){
            intLeds = 60;
        }

        total = numHoras + numDias + intIntel + intAmd + intOficina + intGaming + intRefrig + intLeds + 200;

        if (rbnOficina.isChecked()){
            total = total;
        } else if (rbnGaming.isChecked()){
            total += total * 0.2;
        }

        lblResultado.setText(String.format(String.valueOf(total)));


    }

    public void limpiar(View v){
        chkbRefrigeracion.setChecked(false);
        chkbLeds.setChecked(false);
        rbnAmd.setChecked(false);
        rbnIntel.setChecked(false);
        rbnGaming.setChecked(false);
        rbnOficina.setChecked(false);
        lblResultado.setText("");
        lblWatios.setVisibility(View.INVISIBLE);
        txtHorasDia.setText("");
        txtDiasSemana.setText("");
        total = 0;
    }

}