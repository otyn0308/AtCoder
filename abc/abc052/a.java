import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int n = a*b;
    int m = c*d;
    if(n == m){
      System.out.println(n);
    }else if(n > m){
      System.out.println(n);
    }else{
      System.out.println(m);
    }
  }
}
