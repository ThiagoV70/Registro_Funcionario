import jdk.jshell.execution.LocalExecutionControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Registro> list = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ": ");

            System.out.print("Id: ");
            Integer id = sc.nextInt();

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            Registro regis = new Registro(id, name, salary);

            list.add(regis);
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        Integer idregistro = sc.nextInt();
        Registro regis = list.stream().filter(x -> x.getId() == idregistro).findFirst().orElse(null);
        if (regis == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            regis.addSalario(percentage);
        }
        System.out.println();
        System.out.println("List of employees:");
        for (Registro r : list) {
            System.out.println(r);
        }

    }
}