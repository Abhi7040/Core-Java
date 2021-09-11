package abhishek.methods;

public class MethodWithObjectAsParameter {


    public void display(MethodWithOutParameter a,MethodWithParameters b) {
        System.out.println("hi");
        System.out.println(a.i);
        b.display1(10);
    }

        public void display1(MethodWithParameters a ) {
            MethodWithParameters.display2();
            System.out.println(MethodWithParameters.j);
        }



    public static void main(String[] args) {
        MethodWithObjectAsParameter obj1=new MethodWithObjectAsParameter();
        MethodWithOutParameter obj=new MethodWithOutParameter();
        MethodWithParameters obj2=new MethodWithParameters();
        obj1.display(obj,obj2);
        obj1.display1(obj2);

    }


}
