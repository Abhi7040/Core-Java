package abhishek.constructor;

public class ConstructorWithParameter {

    float firstNumber;
    float secondNumber;
    float total;

    public ConstructorWithParameter(float firstNumber, float secondNumber) {
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
        total=this.firstNumber+this.secondNumber;

    }

    public static void main(String[] args) {
        ConstructorWithParameter obj=new ConstructorWithParameter(25,30.05f);
        System.out.println("Total of Two Numbers :" +obj.firstNumber+ " + " +obj.secondNumber+ " = " +obj.total);
    }
}
