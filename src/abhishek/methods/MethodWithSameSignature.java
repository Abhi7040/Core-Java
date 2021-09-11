package abhishek.methods;

public class MethodWithSameSignature {

    // IT IS NOT ALLOWED TO DECLARE METHOD WITH SAME SIGNATURE

    public void display(int a) {
        System.out.println("I AM IN DISPLAY METHOD" +a);
    }

    /*public void display(int a) {
        System.out.println("I AM IN DISPLAY METHOD");
    }*/

    public static void main(String[] args) {
        MethodWithSameSignature obj=new MethodWithSameSignature();
        obj.display(20);
    }

}
