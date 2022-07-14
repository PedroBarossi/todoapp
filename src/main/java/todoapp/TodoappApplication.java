package todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*import todoapp.controller.ProjectController;
import todoapp.controller.TaskController;
import todoapp.model.Project;
import todoapp.model.Task;

import java.util.Date;*/

@SpringBootApplication
public class TodoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);

		/* Teste 14/07/22 17:00
		ProjectController projectController = new ProjectController();
		TaskController taskController = new TaskController();
		Project proj1 = new Project(1, "Teste1", "Primeiro projeto teste", new Date(), new Date());
		Project proj2 = new Project(2, "Teste2", "Segundo projeto teste", new Date(), new Date());
		Task task1 = new Task(1, 1, "taskTest1", "descricao1", "anotacaoteste", false, new Date(), new Date(), new Date());
		Task task2 = new Task(2, 2, "taskTest2", "descricao2", "anotacaoteste", false, new Date(), new Date(), new Date());
		Task task3 = new Task(3, 2, "taskTest3", "descricao3", "anotacaoteste", false, new Date(), new Date(), new Date());

		projectController.save(proj1);
		projectController.save(proj2);
		taskController.save(task1);
		taskController.save(task2);
		taskController.save(task3);

		proj1.setName("Mudei o nome");
		proj2.setDescription("Mudei a descrição");
		task2.setCompleted(true);
		projectController.update(proj1);
		projectController.update(proj2);
		taskController.update(task2);
		taskController.removeById(3);
		System.out.println(projectController.getAll().size());*/

	}

}
