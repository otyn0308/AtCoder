import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if(a>b && a>c){
      System.out.println(1);
      if(b>c){
        System.out.println(2);
        System.out.println(3);
      }else{
        System.out.println(3);
        System.out.println(2);
      }
    }else if(a>b || a>c){
      System.out.println(2);
      if(b>a){
        System.out.println(1);
        System.out.println(3);
      }else{
        System.out.println(3);
        System.out.println(1);
      }
    }else{
      System.out.println(3);
      if(b>c){
        System.out.println(1);
        System.out.println(2);
      }else{
        System.out.println(2);
        System.out.println(1);
      }
    }
  }
}
