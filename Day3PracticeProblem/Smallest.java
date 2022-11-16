package Class1.src.com.RFP_Batch225.Day3PracticeProblem;

    import java.util.Scanner;

    public class Smallest
    {
        public static void main(String args[])
        {

            int arr[] = {3, 7, 3, 89, 1, 7};

            int min = arr[0];

            for(int i=0; i<arr.length; i++) { if(min > arr[i])
            {
                min = arr[i];
            }

            }

            System.out.print(min);
        }
    }

