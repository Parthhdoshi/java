public class Reverse_word {
    public static void main(String[] args) {
        String words = "I love java, the      coffee";
        String words_array[] = words.split(" ");
        for (String car : words_array) {
            
            System.out.println(car);
        }
        
        for(int i=words_array.length-1;i>=0;i--){
            words_array[i].trim();
            System.out.print(words_array[i]+" ");
        }

    }
}
