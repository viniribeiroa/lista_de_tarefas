package com.stormdev.listadetarefas.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.textfield.TextInputEditText;
import com.stormdev.listadetarefas.R;
import com.stormdev.listadetarefas.helper.TarefaDAO;
import com.stormdev.listadetarefas.model.Tarefa;

public class AdicionarTarefaActivity extends AppCompatActivity {

    private TextInputEditText editTarefa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar_tarefa);

        editTarefa = findViewById(R.id.textTarefa);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_adicionar_tarefa, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.itemSalvar){

            //Execultar um codigo
            TarefaDAO tarefaDAO = new TarefaDAO(getApplicationContext());

            Tarefa tarefa = new Tarefa();
            tarefa.setNomeTarefa("Ir ao mercado");
            tarefaDAO.salvar( tarefa );

        }
        return super.onOptionsItemSelected(item);
    }
}