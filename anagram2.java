public class anagram2 {
    public static void main(String[] args) {
        String a = "abc#1123";
        String b = "a#1132bc^";

        int al[] = new int[256];
        // slightly optimization is done by removing 2nd array 
        // int bl[] = new int[256];

        Boolean is_anagram = true;

    
        for(char c: a.toCharArray()){
            int index = (int)c;
            // adding +1 value to array al[]
            al[index]++;
        }

        for(char c: b.toCharArray()){
            int index = (int)c;
            // removing 1 to aaray al[]
            al[index]--;   
        }

        for(int i=0;i<256;i++){
            if(al[i] != 0){
            // compareing whole array with 0 
            // if we not found 0 then its not anagram 
              is_anagram = false;  
              break;
            }
        }

        if (is_anagram){
            System.out.println(" This is a anagram ");
        }
        else{
            System.out.println(" This is not an anagram ");
        }
    }
}
