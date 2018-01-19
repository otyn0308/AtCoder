import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int d = sc.nextInt();
    if (a==d){
      System.out.println((a+1)*d);
    }else if (a<d){
      System.out.println((a+1)*d);
    }else if (d<a){
      System.out.println((d+1)*a);
    }
  }
}
