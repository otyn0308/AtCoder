import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = a+b;
    if(n < 10){
      System.out.println(n);
    }else if(n >= 10){
      System.out.println("error");
    }
  }
}
