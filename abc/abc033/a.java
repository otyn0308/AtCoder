import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int a = n / 1000;
      int b = n / 100 -(a * 10);
      int c = n / 10 -(a * 100)-(b * 10);
      int d = n -(a * 1000)-(b * 100)-(c * 10);
      if(a==b && b==c && c==d){
        System.out.println("SAME");
      }else{
        System.out.println("DIFFERENT");
      }
  }
}
