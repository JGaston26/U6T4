public class Main {
    public static void main(String[] args) {
        // TEST constructor & getter methods
        System.out.println("--- TEST CONSTRUCTOR ---");
        Fibonacci fib0 = new Fibonacci(2);
        int[] seq0 = fib0.getSequence();
        System.out.println(ArrayPrinter.printableString(seq0));

        Fibonacci fib1 = new Fibonacci(6);
        int[] seq1 = fib1.getSequence();
        System.out.println(ArrayPrinter.printableString(seq1));

        Fibonacci fib2 = new Fibonacci(15);
        int[] seq2 = fib2.getSequence();
        System.out.println(ArrayPrinter.printableString(seq2));

        // TEST getIndexOf method
        System.out.println("--- TEST getIndexOf ---");
        System.out.println(fib2.getIndexOf(1));
        System.out.println(fib2.getIndexOf(13));
        System.out.println(fib2.getIndexOf(144));
        System.out.println(fib2.getIndexOf(987));
        System.out.println(fib2.getIndexOf(100));
        System.out.println(fib2.getIndexOf(600));

        // TEST extendBy method
        System.out.println("--- TEST extendBy ---");
        fib0.extendBy(3);
        System.out.println(ArrayPrinter.printableString(fib0.getSequence()));
        fib1.extendBy(5);
        System.out.println(ArrayPrinter.printableString(fib1.getSequence()));
        fib2.extendBy(2);
        System.out.println(ArrayPrinter.printableString(fib2.getSequence()));
        fib2.extendBy(3);
        System.out.println(ArrayPrinter.printableString(fib2.getSequence()));

        // TEST fibonacciString method
        System.out.println("--- TEST fibonacciString ---");
        System.out.println(fib0.fibonacciString());
        System.out.println(fib1.fibonacciString());
        System.out.println(fib2.fibonacciString());

        Fibonacci fibonaccis[] = {fib0,fib1,fib2};
        for(Fibonacci j : fibonaccis){
            System.out.println(j.getSequence().length);
        }
    }
}
