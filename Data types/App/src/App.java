public class App {
    public static void main(String[] args) throws Exception {
        
        /* Data types in Java :
         * int
         * boolean
         * char Unicode 65536 character disponible
         * short -32768 à 32767
         * long
         * float
         * double
         * byte -128 à 127
         */

         byte range = 127;
         boolean state = true;
         char letter = 'A';
         final short number = 32767;
         float price = 12.3f;
         double precision = 12.4456783;
         System.out.printf("%d,%b,%c,%d,%f%n,%f", range, state, letter, number, price, precision);
   }
}
