package Class1.src.com.RFP_Batch225.Day3PracticeProblem;



public  class ascending
{
    static void printOrder(int[] a, int n)
    {
        int temp;
        for(int i=0;i < n-1;i++)
        {
            for(int j = 0;j < n/2; j++) { if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
            }

            for(int j = n/2;j < n-1; j++)
            {
                if(a[j] < a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

        for(int i = 0; i < n; i++)
            System.out.print(a[i] + " ");

    }
    public static void main(String[] args)
    {
        int[] arr = {6, 7, 8, 8, 84, 43, 34, 23};
        int n = arr.length;
        printOrder(arr, n);
    }
}