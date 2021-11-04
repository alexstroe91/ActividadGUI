package com.example.actividadgui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText txtHorasDia, txtDiasSemana;
    private CheckBox chkbRefrigeracion, chkbLeds;
    private RadioGroup rgroupUso, rgroupProcesador;
    private RadioButton rbnGaming, rbnOficina, rbnIntel, rbnAmd;
    private Button btnCalcular, btnLimpiar;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHorasDia = (EditText) findViewById(R.id.txtHorasDia);
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
    }

    public void Calcular(View v){
        int horas = Integer.parseInt(txtHorasDia.getText().toString());
        int dias = Integer.parseInt(txtDiasSemana.getText().toString());
        // video minuto 23:22

    }

}