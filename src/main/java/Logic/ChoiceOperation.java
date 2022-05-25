package Logic;

public class ChoiceOperation {

    private int userChoice;
    private double firstValue;
    private double secondValue;
    private MathOperation mathOperation;

    public ChoiceOperation(int userChoice, double firstValue, double secondValue){
        this.userChoice = userChoice;
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        mathOperation = new MathOperation(firstValue, secondValue);
    }

    public double getResult(){
        double result = 0;
        switch (userChoice){
            case 1: result = mathOperation.getSum(); break;
            case 2: result = mathOperation.getDifference(); break;
            case 3: result = mathOperation.getMultiplication(); break;
            case 4: result = mathOperation.getDivision(); break;
        }

        return result;
    }

}
