import java.util.Scanner;
public class Rotate2D {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Row ");
    int row= sc.nextInt();
    System.out.println("Enter a Column ");
    int col= sc.nextInt();
    int arr[][] = new int[row][col];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println(" 2D Array");
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("After Rotating 2D");
    for(int i=0;i<row;i++){
        for(int j=2;j>=0;j--){
            System.out.print(arr[j][i]+" ");
        }
        System.out.println();
    }
    sc.close();
    }
}
