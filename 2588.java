import java.util.Scanner;

class 2588 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A, B;
    A=sc.nextInt();
    B=sc.nextInt();
    int a, b, c;
    a=A*(B%10);
    b=A*((B/10)%10);
    c=A*(B/100);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(a+b*10+c*100);
    sc.close();
  }
}