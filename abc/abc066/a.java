import java.util.Arrays;
import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int[] min = {a,b,c};
    Arrays.sort(min);
    System.out.println(min[0] + min[1]);
  }
}
