public class Noofvowels {

public static void main(String arg[]) {
        String s = “Lalit”;
        int count = 0;
        for(int i=0;i<s.length();i++) {
            char c= s.charAt(i);

            c=Character.toUpperCase(c);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                count++;
        }
}
    System.out.println(count);
}
}