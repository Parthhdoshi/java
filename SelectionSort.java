import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        // In this Selection sort we find smallest number and we swap with first position

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a raws of array ");
        int n = sc.nextInt();

        System.out.println("Enter a array to sort");
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        int len = a.length;

        for(int i=0;i<len-1;i++){
            int minIndex = i;
            for(int j=i;j<len;j++){
                if(a[j] < a[minIndex]){
                    minIndex = j;
                }
            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        for(int e:a)
        System.out.print(e+" ");

        sc.close();
    }
}
