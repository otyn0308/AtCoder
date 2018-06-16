import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(a==b){
      System.out.println("Yay!");
    }else if((a+b < 16)&&(Math.abs(a-b)==1)){
      System.out.println("Yay!");
    }else if((a+b < 15)&&(Math.abs(a-b)==2)){
      System.out.println("Yay!");
    }else{
      System.out.println(":(");
    }
  }
}
