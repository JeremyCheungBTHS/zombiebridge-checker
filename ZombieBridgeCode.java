import java.util.Scanner;
public class ZombieBridgeCode
{
 private int professor = 10;
 private int you = 1;
 private int assistant = 2; 
 private int janitor = 5; 
 public static void main(String[] args)
 {
   Scanner scan = new Scanner(System.in);
   System.out.println("Hi. This is the Zombie Bridge Riddle Helper"); 
   System.out.println("You (Y) - 1 min"); 
   System.out.println("Assistant (A) - 2 min"); 
   System.out.println("Janitor (J) - 5 min"); 
   System.out.println("Professor (P) - 10 min"); 
   System.out.println("Who are the first two to cross? (Two Characters)"); 
 }
}
