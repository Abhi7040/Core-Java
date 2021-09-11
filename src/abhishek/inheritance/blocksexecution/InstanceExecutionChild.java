package abhishek.inheritance.blocksexecution;
/*
    Run From Child Class :-
   -It will Execute First 1)StaticBlock Parent and 2) StaticBlockChild
   -Then Execute 3)InstanceBlock Parent and 4) Constructor Parent
   -Then Execute 5) InstanceBlock Child 6)Constructor Child
 */
public class InstanceExecutionChild extends InstanceExecutionParent {
    {
        System.out.println("I am in Child-InstanceBlock");
    }
    public InstanceExecutionChild() {
        System.out.println("I am in Child-Constructor");
    }
    public static void main(String[] args) {
        InstanceExecutionChild obj=new InstanceExecutionChild();
    }
}
