import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      for(int b= 0; b<=i; b++)
        bw.write("*");
      bw.write("\n");
    }
    br.close();

    bw.flush();
    bw.close();

  }
}
