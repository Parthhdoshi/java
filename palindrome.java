import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        cs.close(); 
        int temp = n;
        int ReverseNumber = 0;
        while(temp>0){
            int LastNumber = temp % 10;
            ReverseNumber = ReverseNumber * 10 + LastNumber;  
            temp /= 10;       
        }
        if (ReverseNumber == n){
            System.out.println(n + " is palindrome");
        }
        else{
            System.out.println(n + " is not palindrone");
        }
    }
}