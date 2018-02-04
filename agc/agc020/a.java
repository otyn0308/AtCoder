import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    if ((B - A) % 2 == 0){
      System.out.println("Alice");
    } else if ((B - A) % 2 == 1){
      System.out.println("Borys");
    } else {
      System.out.println("Draw");
    }
  }
}
