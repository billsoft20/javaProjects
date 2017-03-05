
package arraysquare;
//Author: G Mejia
//Date:3/5/17
//10 element of int
//uses a loop to initialize each element to value of index squared
//uses another loop to print contents of the array one integer per line

public class ArraySquare {

    public static void main(String[] args) {
      //Declaring 10 element array of type int
      int []numbers = new int[10];
      
      for(int i =0;i<numbers.length;i++)
      {
          numbers[i] = i * i;
      }
      for(int i=0;i<numbers.length;i++)
      {
          System.out.println(numbers[i]);
      }
    }
    
}
