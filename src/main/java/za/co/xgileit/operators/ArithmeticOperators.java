package za.co.xgileit.operators;
//    Arithmetic operators are used to perform common mathematical operations.
public class ArithmeticOperators {

    public ArithmeticOperators() {
    }

    public int addition(int number1,int number2)
    {
        return number1 + number2;
    }

    public int subtraction(int number1,int number2)
    {
        return number1 - number2;
    }

    public int multiplication(int number1,int number2)
    {
        return number1 * number2;
    }

    public double division(int number1,int number2)
    {
        return number1 / number2;
    }

    public double modulus(int number1,int number2)
    {
        return number1 % number2;
    }

    public double increment(int number)
    {
        return ++number;
    }

    public double decrement(int number)
    {
        return --number;
    }
}
