import java.util.Scanner;
import java.util.Random;

public class ArraySkills {


   public static void main(String[] args) {
   
      // ***********************
      // For each item below you must code the solution. You may not use any of the
      //  methods found in the Arrays class or the Collections classes
      //
   
      String[] myData;
   
      // 1. Instantiate the given array to hold 10 Strings.
      
      myData = new String[10];
      
      // 2. Add your name to the Array at index 0 and a friend's name to the Array at index 4
      
      myData[0] = ("Stephanie");
      myData[4] = ("Crystal");
      
      // 3. Move your friend's name to index 0 in the array and "delete" their name from index 4
      
      myData[0] = myData[4];
      myData[4] = null;
      
      
      // 4. Fill up all of the remaining indexes in the array with more names
      
      myData[1] = ("Owen");
      myData[2] = ("Mary Beth");
      myData[3] = ("Andrew");
      myData[4] = ("Vicki");
      myData[5] = ("Rey");
      myData[6] = ("Nick");
      myData[7] = ("Akira");
      myData[8] = ("Leela");
      myData[9] = ("Rebecca");
            
      // 5. Swap the values at index 5 and index 1
      String temp = myData[1]; //temporary placeholder for index 1
      myData[1] = myData[5];  
      myData[5] = temp;
      
      // 6. Print the array from beginning to end.
      System.out.println("The array from the first index to the last index is: ");
      
      for (int i = 0; i < myData.length; i++) //for loop to loop through array to print 
      System.out.println(myData[i]);
      
      // 7. Shuffle the array of strings
      
      Random rand = new Random();
      for (int i = 0; i < myData.length; i++) {
         int position = rand.nextInt(myData.length);
         String temp2 = myData[i];
         myData[i] = myData[position];
         myData[position] = temp2;
      } 
      
      // 8. Find and print the longest and shortest Strings in the array
         int minLength = 0;//
         int maxLength = 0;
         String shortest = new String();
         String longest = new String();
         
      for (int i = 0; i < myData.length; i++) {
         //if minLength is null then minLength equals myData[i].length
         if(minLength == 0){
            minLength = myData[i].length();
         }
         else if (myData[i].length() < minLength) {
            shortest = myData[i];
            minLength = myData[i].length();
         }
         
         if (myData[i].length() > maxLength) {
            longest = myData[i];
            maxLength = myData[i].length();
         }
         
      }
      
      System.out.println();
      System.out.println("The array with the shortest string contains: " + shortest);
      System.out.println("The array with the longest string contains: " + longest);
      
      // 9. Add up the total number of characters in all of the strings in the array and print the answer
      int numCharacters = 0;
      
      for (int i = 0; i < myData.length; i++) {
         numCharacters += myData[i].length();
      }
      
      System.out.println();
      System.out.println("The number of characters of all arrays is: " + numCharacters);
      
   
      // 10. Prompt the user for a String and then perform a linear search of the array
      //  to see if that string is or is not in the array. Print if it is or is not found.
      
      Scanner keyboard = new Scanner(System.in);
      System.out.println("\nEnter a name and I'll let you know if this is in the array.");
      String userName = keyboard.nextLine(); //stores elements entered by user
      boolean found = false;
      
      for (int i = 0; i < myData.length; i++) {
         if (userName == myData[i])
            found = true;
         
      }
      
      if (found) {
         System.out.println("This name was found in the array." );
      } else {
         System.out.println("This name was not found in the array.");
      }
      
      // 11. Remove the item at index 4 of the array by shifting everything after it one spot to the left.
      // This means your array should have one empty index at the end after the shift (delete the duplicate item at the end).
      
      int removeIndex = 4;
      
      //if i equals myData.length delete item
      for (int i = removeIndex; i < myData.length; i++) {
         if (i == myData.length - 1){
            myData[i] = null;
         } else {
            myData[i] = myData[i + 1]; // Replace current index with one after
         }
      }
      
      
      // 12. Create a new array that is twice as big as the current array and copy all of the items to the new array.
      // When complete, swap references so our old array gets garbage collected and the new array is pointed to by your array variable myData.
      String [] myNewArray = new String [20];
      
      for (int i = 0; i < myData.length; i++) {
         myNewArray[i] = myData[i];
      }
      
      myData = myNewArray;
      
      // 13. Prompt the user to enter 2 numbers within the range of the array's length. If the first is larger than the second print backwards from that index to the first.
      // If the second is larger than the first, print forward in the array from the first index to the second.
      
      
      keyboard = new Scanner(System.in);
      System.out.println("Enter Number 1.");
      int num1 = keyboard.nextInt(); 
      
      while (num1 > myData.length){
         System.out.println("This number is too high, please enter a number lower than " + myData.length);
         num1 = keyboard.nextInt();
      } 
         
      System.out.println("Enter Number 2.");
      int num2 = keyboard.nextInt(); 
      
      while (num2 > myData.length){
         System.out.println("This number is too high, please enter a number lower than " + myData.length);
         num2 = keyboard.nextInt();
      } 
      
      if (num1 > num2) {      
         for (int i = num1; i >= num2; i--) {
            System.out.println(myData[i]);
         }
      } else if (num1 < num2) {      
         for (int i = num1; i <= num2; i++) {
            System.out.println(myData[i]);
         }
      }
   }

}