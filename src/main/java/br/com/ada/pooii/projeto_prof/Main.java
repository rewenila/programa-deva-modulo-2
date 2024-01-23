package br.com.ada.pooii.projeto_prof;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Task type: 1 = standard, 2 = personal");
        int taskType = scanner.nextInt();

        TaskService service;

        if (taskType == 1) {
            // TaskRepository repository = new TaskRepository(); // sem BeanConfig
            service = new TaskService(BeanConfig.repository()); // com BeanConfig
        } else if (taskType == 2) {
            //PersonalTaskRepository personalTaskRepository = new PersonalTaskRepository(); // sem BeanConfig
            service = new TaskService(BeanConfig.personalTaskRepository()); // com BeanConfig
        } else {
            service = new TaskService(null);
        }

        service.salvarNovaTask(new Task());

    }
}
