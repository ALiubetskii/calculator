public class Test {

    public static void main (String[] args) {
        Calculator calculator = new Calculator (15, 2.5);
        calculator.addition();
        System.out.println("вычитание " + (calculator.subtraction()));
        calculator.multiplication();
        System.out.println("деление " + (calculator.division()));
    }
}
