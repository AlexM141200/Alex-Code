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
      MyApp1.run();  
    }
    
    public static void run(){
        System.out.println("Please enter the row which you would like to place the number(1-3)");
        row = Integer.parseInt(Scanner.nextLine());
        
        System.out.println("Please enter the column which you would like to place the number(1-3)");
        column = Integer.parseInt(Scanner.nextLine());
        
        System.out.println("Please enter the value which you would like to place the number(1-3)");
        value = Integer.parseInt(Scanner.nextLine());
        
         
    }
    
    
}
