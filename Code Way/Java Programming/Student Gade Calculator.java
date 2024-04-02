import java.util.*;

class StudentGrade{
  
  public static void main (String[] args) {
    
    int marks[] = {9, 9, 9, 8, 9, 92};
    int outof = 600;
    int total = 0;
    
    for (int i=0; i<6;i++){
      marks[i].nextInt();
    }
    
    
    for (int i=0; i<6; i++){
      total+=marks[i];
    }
     
    System.out.println();
    
    System.out.println("Total Marks = " + total);
    System.out.println("Outof Marks = " + outof);
    
    double percentage = (total / 6);
    
    System.out.println("Percentage = " + percentage + "%");
    
    if(percentage <= 100 && percentage >= 85){
       System.out.println("Oh Nice! You get A+ Grade");
    }else if(percentage > 75){
      System.out.println("Good! A Grade");
    }else if(percentage >= 60){
      System.out.println("C Grade");
    }else if(percentage >= 35){
      System.out.println("D Grade");
    }else if(percentage <=34){
      System.out.println("Your Fail");
    }else{
      System.out.println("Your out of range");
    }
    
  }
  
}