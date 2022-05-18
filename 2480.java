import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A, B, C, MAX, SAME,c1,c2,c3;
    A=sc.nextInt();
    B=sc.nextInt();
    C=sc.nextInt();
    if (A == B && B==C && C==A){
      c1=10000+A*1000;
      System.out.println(c1);
    }
    else if(A != B && B != C && C!=A){
      if (A >= B && A>= C){
          MAX = A;
      }
      else if (B >= A && B>= C){
          MAX = B;
      }
      else
          MAX = C;
      c2=MAX*100;
      System.out.println(c2);
    }
    else{
        if(A==B && B!=C){
            SAME=A;
        }
        else if(B==C && A!=B)
            SAME=B;
        else
            SAME=C;
        c3=1000+SAME*100;
        System.out.println(c3);
    }
    sc.close();
  }
}