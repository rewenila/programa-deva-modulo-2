package br.com.ada.pooii.projeto_prof;

public class BeanConfig {

    static Repository<Task> repository() {
        return new TaskRepository();
    }

    static Repository<PersonalTask> personalTaskRepository() {
        return new PersonalTaskRepository();
    }
}
