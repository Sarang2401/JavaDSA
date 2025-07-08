public class Main
{
  public static void main (String[]args)
  {
    int num1 = 144, num2 = 32;

    int hcf = getHCF (num1, num2);
      System.out.println ("The HCF: " + hcf);

    // LCM formula
    int lcm = (num1 * num2) / hcf;
      System.out.println ("The LCM: " + lcm);
  }

  static int getHCF (int num1, int num2)
  {

    // using repeated subtraction here
    while (num1 != num2)
      {
     if (num1 > num2)
        num1 -= num2;
     else
        num2 -= num1;
      }

    return num1;
  }
}