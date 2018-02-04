import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String result = S.replaceAll("2017", "2018");
    System.out.println(result);
  }
}

