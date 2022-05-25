package Logic;

public class MathOperation {

    private double firstValue;
    private double secondValue;

    public MathOperation(double firstValue, double secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public double getSum(){
        return firstValue + secondValue;
    }
    public double getDifference(){
        return firstValue - secondValue;
    }
    public double getMultiplication(){
        return firstValue * secondValue;
    }
    public double getDivision(){
        return  firstValue / secondValue;
    }
}
