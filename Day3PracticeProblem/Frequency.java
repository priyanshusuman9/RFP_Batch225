package Class1.src.com.RFP_Batch225.Day3PracticeProblem;

import java.util.Arrays;
public class Frequency
{
    public static void countFreq(int arr[], int n)
    {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count +" times ");
        }
    }

    public static void main(String []args)
    {
        int arr[] = new int[]{8, 8, 50, 44, 50, 8, 50, 50};
        int n = arr.length;
        countFreq(arr, n);
    }
}