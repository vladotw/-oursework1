package pro.sky.java.course1.coursework1;

public class Main {
    public static void main(String[] args) {

        EmployeesBase employeesBase = new EmployeesBase();

        employeesBase.addEmployee(new Employee("Иванов Иван Иванович", 1, 25000));
        employeesBase.addEmployee(new Employee("Сергеев Сергей Сергеевич", 2, 25000));
        employeesBase.addEmployee(new Employee("Петров Петр Петрович", 2, 32000));
        employeesBase.addEmployee(new Employee("Семенов Семен Семенович", 3, 18000));
        employeesBase.addEmployee(new Employee("Мышкина Александра Ивановна", 4, 11000));
        employeesBase.addEmployee(new Employee("Селиванов Андрей Владимирович", 1, 52000));
        employeesBase.addEmployee(new Employee("Карпенко Наталья Константиновна", 5, 44000));
        employeesBase.addEmployee(new Employee("Зубец Юлия Андреевна", 5, 14000));
        employeesBase.addEmployee(new Employee("Ногин Святослав Евпатиевич", 3, 23000));
        employeesBase.addEmployee(new Employee("Ким Ильдар Иннокентиевич", 4, 30000));


        System.out.println();
        EmployeesBase.printEployeesList();
        System.out.println();
        System.out.println("Сумма затрат на зарплаты: " + EmployeesBase.calculateSalarySum());
        System.out.println(EmployeesBase.findMinSalary());
        System.out.println(EmployeesBase.findMaxSalary());
        System.out.println("Среднее значение зарплат = " + EmployeesBase.calculateAverageSalaryValue());
        System.out.println();
        EmployeesBase.printEmployeeFio();


    }
}