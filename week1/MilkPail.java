package usaco;

import java.io.*;

public class MilkPail
{

  public int pails(int X, int Y, int M)
  {
    int max = 0;
    if(M > X && M > Y)
      return max;

    int amount = M % X;
    if(amount != M)
    {
      for(int i = 0; i < amount; i++)
      {
        max += X;
      }
    }
    int otherMax = max;
    int otherAmount = M % Y;
    if(otherAmount != M)
    {
      for(int i = 0; i < otherAmount; i++)
      {
        max += Y;
      }
    }
    return max;
  }

  public static void main(String[] args) throws IOException
  {
    BufferedReader br = new BufferedReader(new FileReader("milkpail.in"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("milkpail.out"));

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
