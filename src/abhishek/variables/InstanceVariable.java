import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class InstanceVariable {

    int age = 30;           //INSTANCE VARIABLE
    String name = "Abhi";   //INSTANCE VARIABLE

    //INSTANCE METHOD
    public void display() {
      //INSTANCE AREA
      //DIRECT ACCESS
    System.out.println(age);
    System.out.println(name);

}
    //STATIC METHOD
    public static void main(String[] args) {
        //STATIC AREA
        InstanceVariable obj = new InstanceVariable();
        obj.display();

        //IN STATIC METHOD CALLING INSTANCE VARIABLE BY USING OBJECT REFERENCE
        System.out.println(obj.age);
        System.out.println(obj.name);
    }


}
