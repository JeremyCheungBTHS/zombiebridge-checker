import java.util.Scanner;
public class ZombieBridge
{
 private int you = 1;
 private int assistant = 2; 
 private int janitor = 5; 
 private int professor = 10;
 private int timeLeft; 
 private ArrayList<String> charsAtBegin;
 private ArrayList<String> charsAtEnd;
 public ZombieBridge(int time)
 {
   timeLeft = time; 
   charsAtBegin = new ArrayList<String>(); 
   charsAtBegin.add("Y");
   charsAtBegin.add("A");
   charsAtBegin.add("J");
   charsAtBegin.add("P");
   charsAtEnd = new ArrayList<String>(); 
 }
 public int getTimeLeft()
 {
  return timeLeft; 
 }
 public int subtractTimeLeft(int num)
 {
   timeLeft -= num; 
 }
 public void go(String[] chars)
 {
  int x = 0;
  for (String y: chars)
  {
   if (y.equals("Y"))
   {
     x += 1; 
   }
   else if (y.equals("A"))
   {
    x += 2;
   }
   else if (y.equals("J"))
   {
    x += 5;
   }
   else if (y.equals("P"))
   {
    x += 10;
   }
  }
  subtractTimeLeft(x); 
  if (this.getTimeLeft() < 0)
  {
   System.out.println("You ran out of time"); 
  }
 }
 public void back(String char)
 {
  int x = 0; 
  if (y.equals("Y"))
  {
    x += 1; 
  }
  else if (y.equals("A"))
  {
   x += 2;
  }
  else if (y.equals("J"))
  {
   x += 5;
  }
  else if (y.equals("P"))
  {
   x += 10;
  }
  subtractTimeLeft(x); 
  if (this.getTimeLeft() < 0)
  {
   System.out.println("You ran out of time"); 
  }
 }
 public static void main(String[] args)
 {
   ZombieBridge x = new ZombieBridge(17); 
   String[] charctersSent = {"", ""}; 
   String characterSentBack; 
   Scanner scan = new Scanner(System.in);
   System.out.println("Hi. This is the Zombie Bridge Riddle Helper"); 
   System.out.println("You (Y) - 1 min"); 
   System.out.println("Assistant (A) - 2 min"); 
   System.out.println("Janitor (J) - 5 min"); 
   System.out.println("Professor (P) - 10 min"); 
   System.out.print("Who are the first two to cross? (Two Characters) "); 
   charactersSent[0] = scan.nextString().substring(0,1);
   charactersSent[1] = scan.nextString().substring(1);
   x.go(charactersSent);
   System.out.println("You have " + timeLeft + " minutes remaining."); 
   while(x.getTimeLeft() >= 0)
   {
    System.out.print("Who do you send back? "); 
    characterSentBack = scan.nextString(); 
    x.back(characterSentBack);
    System.out.println("You have " + timeLeft + " minutes remaining."); 
    if (x.getTimeLeft() < 0)
    {
      break; 
    }
    System.out.print("Who do you send next? "); 
    charactersSent[0] = scan.nextString().substring(0,1);
    charactersSent[1] = scan.nextString().substring(1);
    x.go(charactersSent); 
    System.out.println("You have " + timeLeft + " minutes remaining."); 
   }
   if (x.getTimeLeft() < 0)
   {
    System.out.println("You Failed!");
   }
   else
   {
    System.out.println("Congratulations! You got everybody out safely!");
   }
 }
}
