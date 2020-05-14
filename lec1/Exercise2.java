public class Exercise2 {
    /** Returns the maximum value from m. */
    /** Not accounting for edge cases like lists of length 1 or smaller**/
    public static int max(int[] m) {
        int length = m.length;
        int i = 1;
        int biggest = m[0];
        while(i < length) {
           if(m[i] > biggest) {
              biggest = m[i];
           }
           i+=1;
        }
        return biggest;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};      
       System.out.println(max(numbers));
    }
}
