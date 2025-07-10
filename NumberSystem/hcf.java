class Main
{
  public static void main (String[]args)
  {
    int num1 = 36, num2 = 60, hcf;

      hcf = getHCF (num1, num2);
      System.out.println ("The HCF: " + hcf);
  }

  static int getHCF (int num1, int num2)
  {

    if (num1 == 0)
      return num2;


    if (num2 == 0)
      return num1;

    // base case
    if (num1 == num2)
      return num1;

    // num1 is greater
    if (num1 > num2)
      return getHCF (num1 - num2, num2);

    return getHCF (num1, num2 - num1);
  }
}


//it uses the approach of repetitive subtraction 