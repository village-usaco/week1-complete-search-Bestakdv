package usaco;

public class MilkPail
{

  public int pails(int X, int Y, int M)
  {
    int max = 0;
    if(max > X && max > Y)
      return max;

    int amount = M % X;
    if(amount != M)
    {
      
      for(int i=0; i<amount;i++)
      {
        max+=X;
      }
    }
    int otherMax = max;
    int otherAmount = M % Y;
    if(otherAmount != M)
    {

    
      for(int i=0; i<otherAmount; i++)
      {
        max+=Y;
      }
    }
    return max;
  }
  public static void main(String[] args)
  {
    pails(17,25,77);
  }
}
