package abhishek.methods;

public class MethodParameterClass {
    int value=200;
    public void display1(int a) {
        System.out.println(a);
        System.out.println(this.value);  // 2) here by using 'this' keyword we access the variable of instance variable of this class
        System.out.println("I AM IN METHOD PARAMETER CLASS");

    }


    public void display(MethodWithParameters a) { // 1.1) HERE WE MENTIONED DATATYPE AS CLASS NAME IN PARAMETER LIST TO ACCESS VARIABLE AND METHOS OF CLASS MethodWithParameters
        a.display1(1000);
        a.display2();
        System.out.println("------------------------");
        System.out.println(a.age);
        MethodWithOutParameter.display2();

    }

    public void display1() {
        MethodWithParameters.display2();
        MethodWithParameters obj2=new MethodWithParameters();
        obj2.display2();

    }


    public static void main(String[] args) {
        MethodParameterClass obj=new MethodParameterClass();
        MethodWithParameters obj1=new MethodWithParameters();
        System.out.println(obj1.age);
        int value=300;
        obj.display1(value);
        obj1.display2();
        obj.display(obj1);  //1) HERE WE CREATED OBJECT OF MethodWithParameters AND PASSED IN THE PARAMETER

    }
}
