// Exercise.java
public class Exercise {
    public static int countVowels(String str){
        int count = 0;
        String vowels = "aeiouAEIOU";
 
        for(int i = 0; i < str.length(); i++){
            if(vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
}
