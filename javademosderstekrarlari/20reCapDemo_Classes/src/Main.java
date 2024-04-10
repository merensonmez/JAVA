public class Main {
    public static void main(String[] args) {
        FourOperations fourOperations  = new FourOperations();

        int resultAdd = fourOperations.Add(2132,722);
        System.out.println("Result(Sum): "+resultAdd);

        int resultSubtract = fourOperations.Subtract(2132,722);
        System.out.println("Result(Difference): "+resultSubtract);

        int resultMultiply = fourOperations.Multiply(123,5);
        System.out.println("Result(Product): "+resultMultiply);

        int resultDivision = fourOperations.Division(148,4);
        System.out.println("Result(Quotient): "+resultDivision);
    }
}