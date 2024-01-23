package br.com.ada.pooii.projeto_prof;

public class PersonalTaskRepository implements Repository<PersonalTask>{
    @Override
    public void salvar(PersonalTask personalTask) {
        System.out.println("Salvando tarefa pessoal.");
    }
}
