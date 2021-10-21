import java.util.Scanner;
public class a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num < 10){
      System.out.println("000" + num);
    }else if(num >= 10 && num < 100){
      System.out.println("00" + num);
    }else if(num >= 100 && num < 1000){
      System.out.println("0" + num);
    }else{
      System.out.println(num);
    }
  }
}
