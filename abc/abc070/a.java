import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    if(a.substring(0,1).equals(a.substring(2,3))){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
