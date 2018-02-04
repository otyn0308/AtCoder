import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    double b = sc.nextInt();
    double c = sc.nextInt();
    double d = sc.nextInt();
    double T = b/a;
    double A = d/c;
    if(T == A){
      System.out.println("DRAW");
    }else if (T < A){
      System.out.println("AOKI");
    }else{
      System.out.println("TAKAHASHI");
    }
  }
}
