import java.util.Scanner;
public class a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a % 100 == 0 && a != 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
