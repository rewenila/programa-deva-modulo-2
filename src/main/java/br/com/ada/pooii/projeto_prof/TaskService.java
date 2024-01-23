package br.com.ada.pooii.projeto_prof;

public class TaskService {

    // following SRP, OCP, DIP
    private final Repository repository;

    public TaskService(Repository Repository) {
        this.repository = Repository;
    }

    public void salvarNovaTask(Task task){
        System.out.println("Salvando tarefa com o repository " + this.repository.getClass().getName());
        repository.salvar(task);
    }
}
