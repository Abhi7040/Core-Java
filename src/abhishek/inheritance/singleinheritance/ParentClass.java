package abhishek.inheritance.singleinheritance;

public class ParentClass {
    int id;
    String name;

    public ParentClass(int id,String name) {
        this.id=id;
        this.name=name;
    }
    public ParentClass() {

    }

    public void display() {
        System.out.println("Employee ID :" +id+ "\nEmployee Name :" +name);

    }

    public static void main(String[] args) {
        ParentClass obj=new ParentClass(1234,"Abhi");
        obj.display();
    }


}
