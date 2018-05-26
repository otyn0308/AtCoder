import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int[] array = {a+b,a-b,a*b};
    Arrays.sort(array);
    int value = array[2];
    System.out.println(value);
  }
}
