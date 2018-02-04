import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int s = sc.nextInt();
    int t = sc.nextInt();
    int w = sc.nextInt();
    int count = 0;
    if(s<=w && w<=t)
      count++;
    for(int i=1; i<n; i++){
      w += sc.nextInt();
      if(s<=w && w<=t)
        count++;
    }
    System.out.println(count);
  }
}
