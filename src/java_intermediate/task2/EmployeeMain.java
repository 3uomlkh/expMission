package java_intermediate.task2;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("김구름", 4000);
        Manager manager = new Manager("이구름", 6000, "개발팀장");

        employee.display();
        System.out.println();
        manager.display();
    }
}
