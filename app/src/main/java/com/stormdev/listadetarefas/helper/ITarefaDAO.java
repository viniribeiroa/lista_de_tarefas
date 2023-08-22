package com.stormdev.listadetarefas.helper;

import com.stormdev.listadetarefas.model.Tarefa;

import java.util.List;

/**
 * Interface para definir metodos obrigatorios TarefaDAO
 */
public interface ITarefaDAO {

    public boolean salvar(Tarefa tarefa);
    public boolean atualizar(Tarefa tarefa);
    public boolean deletar(Tarefa tarefa);
    public List<Tarefa> listar();
}
