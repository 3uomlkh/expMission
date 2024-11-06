package java_intermediate.task2;

public class Manager extends Employee {
    private String position;

    public Manager(String name, int salary, String position) {
        super(name, salary);
        this.position = position;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(", 직책 : " + position);
    }
}
