package abhishek.constructor;

public class ConstructorWithNoParameter {
    int age;
    String name;

    public ConstructorWithNoParameter() {
        age=25;
        name="Abhi";
        System.out.println("I am in Constructor With No Parameter");
    }

    public static void main(String[] args) {
        ConstructorWithNoParameter obj=new ConstructorWithNoParameter();
        System.out.println("Age:" +obj.age);
        System.out.println("Name :" +obj.name);
    }

}
