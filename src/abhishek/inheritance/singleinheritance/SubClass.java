package abhishek.inheritance.singleinheritance;

public class SubClass extends ParentClass {
    float salary;

    public SubClass(float salary) {
        super(1234,"Abhi");
        this.salary=salary;
        display1();
    }

    public void display1() {
        display();
        System.out.println(salary);
    }

    public static void main(String[] args) {
       new SubClass(20000f);
    }
}
