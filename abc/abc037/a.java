import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a < b){
      System.out.println(c / a);
    }else{
      System.out.println(c / b);
    }
  }
}
