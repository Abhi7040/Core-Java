package abhishek.constructor;

public class ConstructorCalling {
    float firstNumber;
    float secondNumber;
    float total;

    public ConstructorCalling(float firstNumber,float secondNumber) {
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
        total=this.firstNumber+this.secondNumber;
    }

    public ConstructorCalling() {
        this(25,30.07f);
    }

    public static void main(String[] args) {
        ConstructorCalling obj=new ConstructorCalling();
        System.out.println("Additition of two Numbers :"+obj.firstNumber+ " + " +obj.secondNumber+ " = " +obj.total);
    }
}


