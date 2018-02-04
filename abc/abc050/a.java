import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int m = sc.nextInt();
    if(s.equals("+")){
      System.out.println(n + m);
    }else{
      System.out.println(n - m);
    }
  }
}
