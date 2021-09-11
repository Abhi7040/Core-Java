package abhishek.inheritance.acessclasses;

public class Parent {

    public Parent() {
        System.out.println("I am in Parent-Constructor");
    }
    public void display() {
        System.out.println("I am in Parent-DisplayMethod");
    }

    public static void main(String[] args) {
        Parent obj=new Parent();
        obj.display();
    }
}
