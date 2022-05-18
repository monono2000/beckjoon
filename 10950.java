import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A;
    A=sc.nextInt();
   for(int i=0; i<A ; i++){
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       System.out.println(n1+n2);
   }
    sc.close();
  }
}