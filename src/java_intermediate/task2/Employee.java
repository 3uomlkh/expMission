package java_intermediate.task2;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.print("이름 : " + name + ", 급여 : " + salary);
    }
}
