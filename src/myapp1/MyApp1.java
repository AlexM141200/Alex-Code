package myapp1;


import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class MyApp1 {
    
    private static Scanner Scanner;
    private static int row;
    private static int column;
    private static int value;

   
    public static void main(String[] args) {
        
         int[][] magicSquare = {{0,0,0}, {0,0,0}, {0,0,0}};
         int row = 0;
         int column = 0;
         int value = 0;
         Scanner userInput = new Scanner(System.in);
         boolean stop = false;
         
         //Main loop required
         
         do{
             
             printSquare(magicSquare);
        
        System.out.println("Please enter the row which you would like to place the number(1-3)");
        row = userInput.nextInt();
        
        System.out.println("Please enter the column which you would like to place the number(1-3)");
        column = userInput.nextInt();
        
        System.out.println("Please enter the value which you would like to place the number(1-3)");
        value = userInput.nextInt();
        
        magicSquare[row][column] = value;
        
        stop = checkSquare(magicSquare);
        
        }
         while (!stop);
         
         printSquare(magicSquare);
    }
    
      public static void printSquare(int[][] theSquare) {
          
          for (int row =0; row<3; row++);
          {
              for (int col=0;col<3; col++);
              {
                  System.out.println(theSquare[row][column] + " ");
                  {
                      System.out.println();
                  }
              }
          }
      } 
}
