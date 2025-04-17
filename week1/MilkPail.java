import java.io.*;

public class MilkPail
{

  public int pails(int X, int Y, int M)
  {
    int max = 0;
    for(int i=0; i<= M / X; i++) 
    {
      for (int j=0; j<= M / Y; j++)
      {
        int count = i * X + j * Y;
        if (count <= M)
        {
          max = Math.max(max, count);
        }
      }
    }
    return max;
  }

  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new FileReader("pails.in"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("pails.out"));

    String[] tokens = br.readLine().split(" ");
    int X = Integer.parseInt(tokens[0]);
    int Y = Integer.parseInt(tokens[1]);
    int M = Integer.parseInt(tokens[2]);

    MilkPail test = new MilkPail();
    int result = test.pails(X, Y, M);

    bw.write(result + "\n");
    bw.close();
    br.close();
  }
}
