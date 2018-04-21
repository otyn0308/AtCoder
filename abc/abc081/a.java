import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int count = 0;
    for(char c :s.toCharArray()){
      if(c == '1')
        count++;
    }
    System.out.println(count);
  }
}
