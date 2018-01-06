import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();
    int s = sc.nextInt();
    int t = sc.nextInt();
    int normal = a * s + b * t;
    int discount = 0;
    if(s + t >= k){
      discount = (s + t) * c;
    }
    System.out.println(normal - discount);
  }
}
