package com.example.covidario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.covidario.design.model.Pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CadastroPacienteActivity extends AppCompatActivity {

    public CadastroPacienteActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_paciente);

        Button buttonSalvar = findViewById(R.id.buttonSalvar);
        buttonSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pessoa pessoa = new Pessoa();

                EditText nome = findViewById(R.id.editTextPersonName);
                pessoa.setNome(nome.getText().toString());
                nome.setText("");

                EditText dataNascimento = findViewById(R.id.editTextDataNascimento);
                try {
                    pessoa.setData(new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento.getText().toString()));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                dataNascimento.setText("");

                EditText dataAtual = findViewById(R.id.editTextDateAtual);
                try {
                    pessoa.setDataAtual(new SimpleDateFormat("dd/MM/yyyy").parse(dataAtual.getText().toString()));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                dataAtual.setText("");

                EditText lugares = findViewById(R.id.editTextMultiLineLugares);
                pessoa.setLugares(nome.getText().toString());
                lugares.setText("");

                Toast.makeText(CadastroPacienteActivity.this, "Seus dados foram salvos com sucesso!",Toast.LENGTH_LONG).show();




            }
        });

        Button buttonVoltar = findViewById(R.id.buttonVoltar);
        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }










}
