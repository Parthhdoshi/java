import java.util.Scanner;

public class arrayprob1 {
    public static void main(String[] args) {
        System.out.println("How many students you have in class");
        
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        int sum = 0;
        String[] stuName = new String[n];
        // for(int i=0;i<n;i++){
        //     System.out.println("Enter a " + i+1 + " st student name");
        //     stuName[i] = cs.next();
        // }

        int[] Marks = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter a "+ i+1 +" st student name");
            stuName[i] = cs.next();
            System.out.println("Enter a "+ i+1 +" st student Marks");
            Marks[i] = cs.nextInt();
        }

        for(int i=0;i<n;i++){

            System.out.println(stuName[i] + ' ' +Marks[i]);
            sum = sum+Marks[i]; 
            int avg = sum/n;
            System.out.println(avg);
            cs.close();
        }

    }
}
