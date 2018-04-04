import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = s.toCharArray();
    if((c[0] == c[1] && c[1] == c[2]) || c[1] == c[2] && c[2] == c[3]){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
