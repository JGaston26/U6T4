public class Fibonacci {
    // instance variable
    private int[] sequence;

    /** Constructor: sets sequence instance variable to an array containing the
     first seqLen numbers in a Fibonacci sequence.
     A Fibonacci sequence is formed by summing the
     previous two numbers to generate the next number,
     e.g. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...
     All Fibonacci sequences start out with 0 and 1 as the first two numbers.

     PRECONDITION: seqLen >= 2
     */
    public Fibonacci(int seqLen) {
        sequence = new int[seqLen];
        sequence[0] = 0;
        sequence[1] = 1;
        for(int i = 1; i < seqLen-1; i++){
            sequence[i+1] = sequence[i] + sequence[i-1];
        }
    }

    /** Getter method: returns a reference to the sequence array
     */
    public int[] getSequence() {
       return sequence;
    }

    /** Returns the index in the array where a particular value, searchVal, is
     located in sequence; if not found, returns -1.  If searchVal == 1, return
     first index where 1 is found (since this value appears twice in Fibonacci
     sequences longer than 2 numbers)
     */
    public int getIndexOf(int searchVal) {
        for(int i = 0; i < sequence.length -1; i++){
            if(sequence[i] == searchVal){
                return i;
            }
        }
        return -1;
    }

    /** Creates a temp array that contains the original sequence array with
     howManyMore numbers Fibonacci values added on to the end,
     then assigns sequence to that new array.

     For example, if sequence == {0, 1, 1, 2, 3, 5} and this method is called
     with howManyMore == 3, sequence would be assigned to a new array with
     the next 2 Fibonacci numbers: {0, 1, 1, 2, 3, 5, 8, 13, 21}
     */
    public void extendBy(int howManyMore) {
        int origLen = sequence.length;
        int newSeq[] = new int[origLen + howManyMore];
        newSeq[0] = 0;
        newSeq[1] = 1;
        for(int i = 1; i < newSeq.length-1; i++){
            newSeq[i+1] = newSeq[i] + newSeq[i-1];
        }
        sequence = newSeq;
    }

    /** Returns a string that represents the sequence array nicely formatted, for
     *  example, if sequence == [2, 3, 7], this method should return the String
     *  "[2, 3, 7]"
     *  USE THE ARRAYPRINTER UTILITY CLASS IN YOUR SOLUTION TO THIS METHOD
     */
    public String fibonacciString() {
        return ArrayPrinter.printableString(sequence);
    }

}
