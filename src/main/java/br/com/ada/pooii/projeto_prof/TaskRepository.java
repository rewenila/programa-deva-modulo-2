package br.com.ada.pooii.projeto_prof;

public class TaskRepository implements Repository<Task> {

    @Override
    public void salvar(Task task) {
        System.out.println("Salvando tarefa.");
    }

}
