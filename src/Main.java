public class Main {
    public static void main(String[] args) {
        System.out.println("This is the Git checkpoint task 1.1");
        CheckTest test = new CheckTest("This will be printed when called with the print method in the \"CheckTest\" class");

        test.print();

        Calculate sum = new Calculate(4, 5);
        System.out.println(sum.numbersAdded());
    }
}