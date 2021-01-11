package opps;

public class Return_max_number {
    public static void main(String[] args) {
        int First_number = 22;
        int Second_number = 33;

        int result = max_off(First_number,Second_number);
        System.out.println(result);

    }
    // New method
    static int max_off(int a, int b){
          if(a>b)
          return a;
          else
          return b; 
    }


    static void sayHi(){
        System.out.println("Hello");
        System.out.println("Hello world");
    }


    static void swap(int a, int b){
        int temp = 0;
        a = b;
        b = temp;
    }

}

