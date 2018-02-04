import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String s = a+b;
    int n = Integer.parseInt(s);
    double m = Math.sqrt(n);
    if(m*m == n){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
