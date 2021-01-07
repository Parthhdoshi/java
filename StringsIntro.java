public class StringsIntro {
    public static void main(String[] args) {
        String name = "F";
        String name2 = "      a  ,   c   ,  f   ,   g   ,r,e,d,g";
        String all[] = name2.split(",");
        System.out.println(name.charAt(0)); // this function is returning char value at specific poosition 
        System.out.println(name.length()); // This function is returing length of string  
        System.out.println(name.substring(0)); // This function eleminate first N(6) number or char 
        System.out.println(name.contains("Parth"));
        System.out.println(name.equals(name2)); // This functions check the values of objects 
        System.out.println(name.isEmpty());
        System.out.println(name.concat("Parth"));
        System.out.println(name.replace('F', 'D'));
        for (String car : all) {
            System.out.println(car);
        }
        System.out.println(name2.indexOf('c'));
        System.out.println(name.toLowerCase());
        System.out.println(name2.toUpperCase());
        System.out.println(name2.trim());

        
    }
}
