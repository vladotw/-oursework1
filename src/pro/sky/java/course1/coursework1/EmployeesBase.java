package pro.sky.java.course1.coursework1;

import java.util.Arrays;

public class EmployeesBase {

    static int size = 10;
    static Employee[] employees = new Employee[size];


    void addEmployee(Employee employee) {
        int index = -1;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                index = i;
                break;
            }
        }

        if (index < 0) {
            System.out.println("В справочнике нет места.");
        }

        employees[index] = employee;
        System.out.println("Новый сотрудник " + employee.getEmployeeFio() + " добавлен.");
    }

    static void printEployeesList() {
        System.out.println(Arrays.toString(employees));
    }

    static double calculateSalarySum() {
        double salarySum = 0;
        for (Employee employee : employees) {
            salarySum = salarySum + employee.getEmployeeSalary();
        }
        return salarySum;
    }

    static String findMinSalary() {

        String minSalaryEmployee = null;
        int index;
        double minSalary = employees[0].getEmployeeSalary();
        for (int i = 1; i < employees.length; i++) {
            if (minSalary > employees[i].getEmployeeSalary()) {

                minSalary = employees[i].getEmployeeSalary();
                index = i;
                minSalaryEmployee = employees[index].getEmployeeFio();
            }
        }
        return "Сотрудник " + minSalaryEmployee + " имеет минимальную ЗП (" + minSalary + ")";
    }

    static String findMaxSalary() {
        String maxSalaryEmployee = null;
        int index;
        double maxSalary = employees[0].getEmployeeSalary();
        for (int i = 1; i < employees.length; i++) {
            if (maxSalary < employees[i].getEmployeeSalary()) {
                maxSalary = employees[i].getEmployeeSalary();
                index = i;
                maxSalaryEmployee = employees[index].getEmployeeFio();
            }
        }
        return "Сотрудник " + maxSalaryEmployee + " имеет максимальную ЗП (" + maxSalary + ")";
    }


    static double calculateAverageSalaryValue() {
        double averageSalaryValue;
        averageSalaryValue = calculateSalarySum() / size;
        return averageSalaryValue;
    }

    static void printEmployeeFio() {
        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeFio());
        }
    }
}







