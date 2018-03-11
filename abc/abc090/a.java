import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String a2 = a.substring(0,1);
    String b = sc.next();
    String b2 = b.substring(1,2);
    String c = sc.next();
    String c2 = c.substring(2,3);
    System.out.println(a2 + b2 + c2);
  }
}
