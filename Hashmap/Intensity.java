import java.util.HashMap;
import java.util.Scanner;
public class Intensity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap <Integer , Integer> hash = new HashMap<>();
        for (int num : arr) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        // Displaying results
        System.out.println("Element Intensities:");
        for (int key : hash.keySet()) {
            System.out.println("Element: " + key + " -> Intensity: " + hash.get(key));
        }
    }
}
