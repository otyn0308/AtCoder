import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    for(int i = 0; i<3; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      ans += a/10*b;
    }
    System.out.println(ans);
  }
}
