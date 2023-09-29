import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    static ArrayList<Task> tasks = new ArrayList<>();
    static Scanner keyword = new Scanner(System.in);
    public static void addTask() {

        System.out.println("Enter a task");
        String task = keyword.nextLine();
        System.out.println("Enter the description");
        String description = keyword.nextLine();
        System.out.println("Enter the due date");
        String date = keyword.nextLine();

        Task list = new Task(task, description, date);
        tasks.add(list);
        System.out.println("Entered Successfully");
    }

    public static void viewTasks(){
        System.out.println("\n To Do List: ");
        for(int i = 0; i < tasks.size();i++){
            Task task = tasks.get(i);
            System.out.println("Task " + (i + 1) + ":");
            System.out.println("Title: " + task.getTask());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Due Date: " + task.getDate());
        }
    }

    public static void editTask(){

        viewTasks();

        System.out.println("Select a class");{
            int number = keyword.nextInt();
            keyword.nextLine();

            Task task = tasks.get(number - 1);

            System.out.print("Enter new title: ");
            String newTitle = keyword.nextLine();
            System.out.print("Enter new description: ");
            String newDescription = keyword.nextLine();
            System.out.print("Enter new due date: ");
            String newDueDate = keyword.nextLine();

            task.setTask(newTitle);
            task.setDescription(newDescription);
            task.setDate(newDueDate);
        }

    }

    public static void removeTask(){
        viewTasks();
        System.out.println("Select a Class to remove ");
        int number = keyword.nextInt();
        keyword.nextLine();

        tasks.remove(number-1);

        System.out.println("Task removed successfully!");


    }

    public static void main(String[] args) {

        while (true){
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Edit Task");
            System.out.println("4. Remove Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = keyword.nextInt();
            keyword.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    editTask();
                    break;
                case 4:
                    removeTask();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }
}