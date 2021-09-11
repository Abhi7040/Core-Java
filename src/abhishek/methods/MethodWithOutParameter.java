package abhishek.methods;

public class MethodWithOutParameter {
int i=10;
    public void display() {

        System.out.println("I am in Display Method");
    }
    public void display1() {
        System.out.println("I AM IN DISPLAY1 METHOD");
    }
        public static void display2() {
            System.out.println("I AM IN DISPLAY 2 METHOD");

        }



    public static void main(String[] args) {
        MethodWithOutParameter obj = new MethodWithOutParameter();
        obj.display();
        obj.display1();
    }
}
