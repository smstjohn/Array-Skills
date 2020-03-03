public class TestArrayPrint {

   public static void main(String[] args) {
      
      // Test data to avoid writing Scanner stuff
      int[] data = {0,1,2,3,4,5,6,7,8,9,10,11};
      int start = 10;
      int stop = 5;   
      
      try {
      
         int direction = (stop - start) / Math.abs(stop - start);
         // Condition is a bit scary but this works
         // If we wanted to include the last number we could do i != (stop+direction)
         // If we wanted to lazily avoid out of bounds errors we could do i != stop && (i >= 0 && i < data.length)
         for( int i = start ; i != stop ; i += direction ) {
            System.out.print( data[i] + " " );
          }
      
         System.out.println("\nDirection: " + ((direction > 0) ? "Forward" : "Backward"));
         
         
      } catch(ArithmeticException e) {
      
         System.out.println("Numbers were the same. Do nothing.");
      
      }

   }
      
}