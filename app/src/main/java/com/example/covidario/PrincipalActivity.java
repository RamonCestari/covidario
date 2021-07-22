package com.example.covidario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class PrincipalActivity extends Activity {

    public PrincipalActivity() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        List<String> pacientes = new ArrayList<>();
        pacientes.add("Ari Thomazini");
        pacientes.add("Ramon");
        pacientes.add("Igor");
        pacientes.add("Beatriz");
        pacientes.add("Nailton");
        pacientes.add("Jonathan");
        pacientes.add("Celso");
        pacientes.add("Marcio");

        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PrincipalActivity.this, CadastroPacienteActivity.class));

            }
        });

        ListView listaPacientes = findViewById(R.id.activity_principal_lista_pacientes);

        listaPacientes.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,  pacientes));



        };
    }

