package abhishek.methods;

public class MethodWithParameters {

    /*THREE WAY TO ACCESS STATIC METHOD IN INSTANCE METHOD
        1) DIRECT ACCESS
        2)BY USING OBJECT
        3) BY USING CLASS NAME(RECOMMENDED WAY)
         */

    /*THREE WAY ACCESS STATIC VARIABLE IN INSTANCE METHOD
    1) DIRECT ACCESS
    2) BY USING OBJECT
    3) BY USING CLASS NAME(RECOMMENDED WAY)
    */

    /*WAY TO ACCESS INSTANCE VARIABLE & INSTANCE METHOD IN STATIC METHOD
      ----> BY USING OBJECT REFERENCE
     */

    //MethodWithParameters obj=new MethodWithParameters();
    static int j=30;
    int age=20;
    //INSTANCE METHOD
    public void display(String str1, String str2) {
        MethodWithParameters.display2();
        MethodWithOutParameter obj2=new MethodWithOutParameter();
        obj2.display();
        MethodWithOutParameter.display2();
        MethodWithParameters obj1=new MethodWithParameters();
        obj1.display1(10);
        System.out.println(MethodWithParameters.j);
        System.out.println(j);
        System.out.println(MethodWithParameters.j);
        System.out.println("String1" +str1);
        System.out.println("String2" +str2);
    }

    //INSTANCE METHOD
    public void display1(int i) {
        System.out.println(i);
        System.out.println("Testers");

    }
    //STATIC METHOD
     public static void  display2() {
         System.out.println(j);    //STATIC VARIABLE WE CAN DIRECT ACCESS IN STATIC METHOD
         System.out.println("I AM IN DISPLAY2 STATIC METHOD");
     }

     //STATIC METHOD

    public static void display3(int a,int b) {
        int c=a+b;
        System.out.println("VALUE OF C" +c);

    }

    public static void main(String[] args) {
        MethodWithParameters obj=new MethodWithParameters();
        System.out.println(obj.age);
        obj.display("JAVA","PYTHON");
        obj.display1(20);
        MethodWithParameters.display2();  //while calling static method by using Class Name
        MethodWithParameters.display3(20,30);
    }
}
