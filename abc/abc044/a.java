import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(k<n){
      System.out.println(k*x + (n-k)*y);
    }else{
      System.out.println(n*x);
    }
  }
}
