public class Calculator {

    double first;
    double second;

    public Calculator(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public void addition(){
        System.out.println("сложение " + (first + second));
    }

    public double subtraction(){
        return (first - second);
    }

    public void multiplication(){
        System.out.println("умножение " + (first * second));
    }

    public double division(){
        return (first / second);
    }
}
