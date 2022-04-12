package Lesson_3;

public class Employee {
    private String employeeName;
    private String employeePosition;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, int salary, int age) {
        this.employeeName = name;
        this.employeePosition = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void employeeInfo() {
        System.out.println("ФИО: " + employeeName + "\tДолжность: " + employeePosition + "\tEmail: " + email +
                "\tТелефон: " + phoneNumber + "\tЗарплата: " + salary + "\tВозраст: " + age);
    }
}
