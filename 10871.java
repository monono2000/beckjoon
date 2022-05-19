import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String n = br.readLine();
    StringTokenizer num = new StringTokenizer(n);
    int a =Integer.parseInt(num.nextToken());
    int b = Integer.parseInt(num.nextToken());
    String s = br.readLine();
     StringTokenizer st = new StringTokenizer(s);
    for (int i = 0; i < a; i++) {
      int number =Integer.parseInt(st.nextToken());
      if (number < b)
        bw.write(number+" ");
    }
    bw.write("\n");
    br.close();

    bw.flush();
    bw.close();

  }
}
