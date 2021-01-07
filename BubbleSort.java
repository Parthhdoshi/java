import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a raws of array ");
        int n = sc.nextInt();

        System.out.println("Enter a array to sort");
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
    
        int len = a.length;

        for(int i=0;i<len -1;i++){

            boolean sorted = true;
            for(int j=0;j<len-1-i;j++){
                if(a[j+1] < a[j]){
                    int temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                    sorted = false;
                    System.out.println("----- " + a[j]);
                }
            }   
            if(sorted) break;
        }

        for(int item: a){
            System.out.print(item +" ");
        }
        
        sc.close();

    }
}
