public class LocalVariable {

    public void display() {
        int age = 30;           //LOCAL VARIABLE
        String name = "Abhi";   //LOCAL VARIABLE
        System.out.println(age);
        System.out.println(name);

    }
    public static void main(String[] args) {
        LocalVariable obj = new LocalVariable();
        obj.display();
    }

}
