import java.util.*;
public class b {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char S[] = sc.next().toCharArray();
    char T[] = sc.next().toCharArray();
    if(Arrays.equals(S, T)){
      System.out.println("Yes");
      return;
    }
    for(int i = 0; i < S.length - 1; i++){
      swap(S, i);
      if(Arrays.equals(S, T)){
        System.out.println("Yes");
        return;
      }
      swap(S, i);
    }
    System.out.println("No");
    return;
  }
  public static void swap(char[] S, int i){
    char a = S[i];
    S[i] = S[i+1];
    S[i+1] = a;
  }
}
