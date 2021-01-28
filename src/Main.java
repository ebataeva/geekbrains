import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee empl = new Employee();
        Employee[] employees = new Employee[5];
        System.out.println("Все пятеро случайных сотрудников");
        for (int i = 0; i < employees.length ; i++) {
            employees[i] = new Employee(empl.generateFio(), empl.generatePosition(), empl.generateEmail(), empl.generatePhone(), empl.generateSalary(), empl.generateAge());
            employees[i].info();
            System.out.println();
        }
        System.out.println("\nСотрудники, которые старше 40 \n");

        for (Employee e: employees) {   // №5 вывод сотрудников старше 40
            if(e.age>40) e.info();
        }


    }


}
