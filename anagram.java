public class anagram{
    public static void main(String[] args){
       String a = "cat";
       String b = "ayt";
       boolean is_anagram = false;
        boolean visited[] = new boolean[b.length()];

       if(a.length() == b.length()){

            for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
                for(int j=0;j<a.length();j++){
                    if(b.charAt(j) == c && !visited[j]) {
                        visited[j] = true;
                        is_anagram = true;
                        break;
                    }
                }
                if(!is_anagram){
                    break;
                }
        }
        if (is_anagram) {
            System.out.println(" This is a anagram ");
        }else{
            System.out.println(" This is not an anagram ");
        }
    }
        }
}
