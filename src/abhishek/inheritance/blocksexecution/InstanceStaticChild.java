package abhishek.inheritance.blocksexecution;

public class InstanceStaticChild extends InstanceStaticParent {
    static {
        System.out.println("I am in Child-StaticBlock");
    }
    {
        System.out.println("I am in Child-InstanceBlock");
    }
    public InstanceStaticChild() {
        System.out.println("I am in Child-Constructor");
    }

    public static void main(String[] args) {
        InstanceStaticChild obj= new InstanceStaticChild();
    }
}
