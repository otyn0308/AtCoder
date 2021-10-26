import java.util.*;
public class b {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    String a = sc.next();
    String b = sc.next();
    Long ak = Long.parseLong(a, k);
    Long bk = Long.parseLong(b, k);
    System.out.println(ak * bk);
  }
}
