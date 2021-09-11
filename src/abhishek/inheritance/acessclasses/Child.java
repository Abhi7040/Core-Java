package abhishek.inheritance.acessclasses;

public class Child extends Parent {
    public Child() {
        System.out.println("I am in Child-Constructor");
    }
    public void display() {
        System.out.println("I am in Child-OverrideDisplayMethod");
    }
    public void display1() {
        System.out.println("I am in Child-1DisplayMethod");
    }

    public static void main(String[] args) {

        //1)We have Access Child as well Parent Class Properties....
        Child obj=new Child();
        obj.display(); //It will give first Priority to Call Display Method of Child Class Instead of Parent Display Class after Overrides also
        obj.display1();
        System.out.println("--------------------------------------------------------------");
        // 2) We can Access only Parent Class Properties....
        Parent obj1=new Parent();
        obj1.display();
        System.out.println("--------------------------------------------------------------");
        /*3) Compile time Compiler Will Check if display() method is present in Parent
           if yes,at runtime it will call child class display() method bcz we have created child class object....*/

        Parent obj2=new Child();
        //obj2.display3; display3() method is not present in Parent Class bcz we created Object reference of Parent Class....
         obj2.display();//It will call Child Class display() Method bcz we created object of Child Class....

        /* This is not allowed
        Child obj3=new Parent();//It will Throw compiler time error....
         */
    }
}
