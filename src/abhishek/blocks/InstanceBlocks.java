public class InstanceBlocks {

    /*
    STATIC BLOCKS :
    1) STATIC BLOCK EXECUTE ONLY ONCE DURING .CLASS FILE AND IT WILL EXECUTE FIRST BEFORE INSTANCE BLOCK AND CONSTRUCTOR
    2) STATIC BLOCK DON'T NEED TO CREATE OBJECT TO EXECUTE

    INSTANCE BLOCKS :
    1) INSTANCE BLOCK IS EXECUTE WHENEVER OBJECT IS CREATED AND IT WILL EXECUTE BEFORE CONSTRUCTOR BUT AFTER STATIC BLOCK
     */
int i;
String name;

    {
        System.out.println("I am in Instance Blocks");
        getInfo();

    }

    {
        System.out.println("I AM IN INSTANCE BLOCK 2");
    }

    public InstanceBlocks() {
        this(10,"abc");  //CONSTRUCTOR CALLING (WHENEVER CALLLING THE CONSTRUCTOR ALWAYS WRITE FIRST STATEMENT IN CONSTRUCTOR THEN WRITE OTHER STATEMENTS AND OPERATIONS
        System.out.println("I AM IN INSTANCEBLOCKS CONSTRUCTOR");
    }
    public InstanceBlocks(int i,String name) {
        this.i=i;
        this.name=name;
        System.out.println(this.i);
        System.out.println(this.name);
    }

    static {
        System.out.println("I AM IN STATIC BLOCK");
        getData();
    }

    public static void getData() {
        System.out.println("I AM IN STATIC METHOD");
    }
    public void getInfo() {
        System.out.println("I AM IN INSTANCE METHOD");

    }

    static {
        System.out.println("I AM IN STATIC BLOCK 2");
    }


    public static void main(String[] args) {

        InstanceBlocks obj=new InstanceBlocks(10,"Abhi");
        InstanceBlocks obj1=new InstanceBlocks();
    }
}
