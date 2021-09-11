package abhishek.methods;

public class MethodWithReturnType {

    int a=30;
    int b=40;

    public int display(int a,int b) {
        int c=this.a+b;
        System.out.println(c);
        c=c+b;
        return c;
    }

    public MethodWithParameters display1(MethodWithParameters a) {
        //System.out.println(a.age);
        //a.display1(20);
        //MethodWithParameters.display2();
        return a;

    }
    public static void main(String[] args) {
        MethodWithReturnType obj=new MethodWithReturnType();
        MethodWithParameters obj1=new MethodWithParameters();
        //System.out.println(obj.display(10,20));
        System.out.println("-----------------");
        MethodWithParameters a=obj.display1(obj1);
        System.out.println(a.age + " " +MethodWithParameters.j );
        String total=(obj.display1(obj1).age +""+ MethodWithParameters.j);
        System.out.println(total);
        total=total+10;

        System.out.println(total);



    }
}
