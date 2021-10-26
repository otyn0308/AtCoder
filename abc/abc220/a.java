import java.util.Scanner;
public class a {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int ans = b / c * c;
    if(ans >= a){
      System.out.println(ans);
    }else{
      System.out.println("-1");
    }
  }
}
