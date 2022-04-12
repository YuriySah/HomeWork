package Lesson_3;

public class EmployeeListClass {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com",
                "892312312", 30000, 30);
        employeesArray[1] = new Employee("Petrov Igor", "Driver", "pet.igor@mail.ru",
                "896125599", 15000, 50);
        employeesArray[2] = new Employee("Mikhael Jackson", "Developer", "strange.person@gmail.com",
                "890485800", 250000, 67);
        employeesArray[3] = new Employee("Sancho Pansa", "Designer", "sancho@ya.com",
                "897955551", 80000, 39);
        employeesArray[4] = new Employee("Harry Potter", "Wizard", "hogwards@gmail.com",
                "899999999", 150000, 41);
        int age = 40;

        for (int i = 0; i < 5; i++) {
            if (employeesArray[i].getAge() > age) {
                employeesArray[i].employeeInfo();
            }
        }
    }
}
