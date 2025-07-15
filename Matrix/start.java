import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int numbers[][] = new int[3][3];
        
        for(int i =0; i < rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter find:");
        int find = sc.nextInt();
        for(int i =0; i < rows; i++){
            for(int j=0; j<cols; j++){
                if (numbers[i][j] == find){
                    System.out.println(find);
                }
            }
        }
    }
}