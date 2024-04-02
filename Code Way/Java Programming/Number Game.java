import java.util.Scanner;
import java.lang.Math;

class NumberGame{
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    int num = (int) (Math.random() * 100);
    int guess;
  
    System.out.println("Number : " + num);
  
    System.out.println("Guess number");
     
    for (int i=1; i<=3; i++){
      guess = in.nextInt();
      if(guess == num){
          
         switch(i){
             case 1:System.out.println("You get 10 Points");break;
             case 2:System.out.println("You get 7 Points");break;
             case 3:System.out.println("You get 5 Points");break;
         }
        System.out.println("Number Match | Perfect Guess");
        break;
      }else if(guess > num){
        System.out.println("You guess too large");
      }else{
        System.out.println("You guess too less");
      }
    }
    
    
    
  
  }
  
}