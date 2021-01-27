import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee empl = new Employee("Ivanov Ivan Ivanovich","rab1", "ivanov@mail.ru", "8999", 10000, 18);

        System.out.println(empl.fio);
        empl.info();
        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length ; i++) {
            employees[i] = new Employee(empl.generateFio(), empl.generatePosition(), empl.generateEmail(), empl.generatePhone(), empl.generateSalary(), empl.generateAge());
            employees[i].info();
            System.out.println();
        }
        for (Employee e: employees) {
            if(e.age>40) e.info();
        }

    }


}
