package Queues;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class TaskManager {
    public static final int ADD_NEW_TASK = 0;
    public static final int SHOW_NEXT_TASK = 1;
    public static final int TICK_NEXT_TASK = 2;
    public static final int EXIT = 3;

    static Scanner scanner = new Scanner(System.in);

    private Queue<Task> tasks = new PriorityQueue<>();

    public static void printOptions() {
        System.out.println("Wybierz opcję : ");
        System.out.println(ADD_NEW_TASK + " Dodanie nowego zadania");
        System.out.println(SHOW_NEXT_TASK + " Wyświetlenie pierwszego zadania na liście do zrobienia");
        System.out.println(TICK_NEXT_TASK + " Odznaczenie pierwszego zadania na liście jako zrobione");
        System.out.println(EXIT + " Wyjście z programu");
    }

    private static int getOptionFromUser(Scanner scanner) {
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private static Task createTask(Scanner scanner) {
        String name = getTaskName(scanner);
        Task.Priority priority = getPriority(scanner);
        System.out.println("Dodanie opisu jest opcjonalne, potwierdź wpisując Y lub wpisz cokolwiek jeśli nie chcesz opisu");
        if (scanner.nextLine().equals("Y")) {
            System.out.println("Wprowadź opis zadania");
            String description = scanner.nextLine();
            return new Task(name, description, priority);
        } else {
            return new Task(name, priority);
        }

    }

    private static String getTaskName(Scanner scanner) {
        System.out.println("Wprowadź nazwę zadania");
        return scanner.nextLine();
    }

    private static Task.Priority getPriority(Scanner scanner) {
        System.out.println("Wprowadź priorytet dla zadania - wysoki, średni lub niski");
        String priority = scanner.nextLine();
        return Task.Priority.fromDesc(priority);
    }

    public Queue<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.offer(task);
    }

    public void getTaskWithHighestPriority() {
        System.out.println("Teraz Twoje najważniejsze zadanie to: " + tasks.peek());
    }

    public void tickTaskWithHighestPriority() {
        System.out.println("Zadanie " + tasks.peek() + " zostanie odznaczone");
        tasks.poll();
    }

    public void controlLoop() {
        int option;
        do {
            printOptions();
            option = getOptionFromUser(scanner);
            switch (option) {
                case ADD_NEW_TASK:
                    Task task = createTask(scanner);
                    addTask(task);
                    break;
                case SHOW_NEXT_TASK:
                    getTaskWithHighestPriority();
                    break;
                case TICK_NEXT_TASK:
                    tickTaskWithHighestPriority();
                    break;
                case EXIT:
                    break;
                default:
                    System.out.println("Wybrano niedozwoloną opcję");
            }
        } while (option != EXIT);
    }
}
