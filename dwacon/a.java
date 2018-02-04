import java.util.Scanner;
public class Main{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int S =sc.nextInt();
      int a = S / 1000;
      int b = (S / 100) - a * 10;
      int c = S / 10 -(a * 100)-(b * 10);
      int d = S-(a * 1000)-(b * 100)-(c * 10);
      if (a == c && b == d){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
  }
}
