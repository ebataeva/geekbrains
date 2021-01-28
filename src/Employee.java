
/*
Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
Создать массив из 5 сотрудников.
Пример:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

 */
public class Employee {
    String fio;
    String position;
    String email;
    String phone;
    int salary;
    int age;
    String[] LASTNAMES = new String[]{"Ivanov", "Kuznecov", "Sokolov", "Popov", "Lebedev", "Kozlov", "Novikov", "Morozov", "Petrov", "Volkov", "Solovyov", "Vasilev", "Zajcev", "Pavlov", "Semyonov", "Golubev", "Vinogradov", "Bogdanov", "Vorobyov", "Fyodorov", "Mihajlov", "Belyaev", "Tarasov", "Belov", "Komarov", "Orlov", "Kiselyov", "Makarov", "Andreev", "Kovalyov", "Ilin", "Gusev", "Titov", "Kuzmin", "Kudryavcev", "Baranov", "Kulikov", "Alekseev", "Stepanov"};
    String[] NAMES = new String[]{"Aleksandr", "Aleksej", "Albert", "Grigorij", "David", "Dmitrij", "Evgenij", "Elisej", "Ivan", "Ignat", "Kirill", "Klim", "Andrej", "Anton", "Arsenij", "Artem", "Artemij", "Artur", "Bogdan", "Boris", "Vadim", "Valentin", "Valerij", "Vasilij", "Vladimir", "Gleb"};
    String[] PHONES = new String[]{"12", "21", "34", "43", "56", "67", "78", "89"};
    String[] POSITION = new String[]{"doctor", "teacher", "engineer"};
    int[] AGE = new int[]{10, 12, 34, 22, 55, 62, 43,86,87};


    public Employee(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position ;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }

    public Employee() {
    }

    public  void info(){
        System.out.printf("фио = %s, должность = %s, электронная почта = %s,\nтелефон = %s, \nвозраст = %d, зарплата = %d \n",  this.fio, this.position, this.email, this.phone, this.age, this.salary);
    }
    public String randArray(String[] array) {

        int n = (int) Math.floor(Math.random() * array.length);
        return array[n];
    }

    public int randArray(int[] array) {

        int n = (int) Math.floor(Math.random() * array.length);
        return array[n];
    }
    public  String generatePosition(){
    String position = new String(randArray(POSITION));
    return position;
    }

    public String generateFio() {
        String name = new String(randArray(LASTNAMES)+" "+randArray(NAMES)+ " "+ randArray(NAMES)+"ich");
        return name;
    }

    public String generateEmail(){
        String email = new String(randArray(NAMES)+"@mail.ru");
        return email;
    }
    public String generatePhone() {
        String name = new String("+79" + randArray(PHONES) + randArray(PHONES) + randArray(PHONES) + randArray(PHONES));
        return name;
    }
    public int generateAge() {
        int age =  randArray(AGE);
        return age;
    }
    public int generateSalary() {
        int salary = randArray(AGE)*10000;
        return salary;
    }
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
