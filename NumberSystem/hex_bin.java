class Main
{
  public static void main (String[]args)
  {

    String hex = "C9";  
    String digits = "0123456789ABCDEF";  
             hex = hex.toUpperCase();  
             int val = 0;  
             for (int i = 0; i < hex.length(); i++)  
             {  
                 char c = hex.charAt(i);  
                 int d = digits.indexOf(c);  
                 val = 16*val + d;  
             } 
             System.out.println(val);
  }  

}