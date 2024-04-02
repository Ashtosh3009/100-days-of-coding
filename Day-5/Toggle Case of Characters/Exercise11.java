public class Exercise {
    public static String toggleCase(String s){
        StringBuilder toggledString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                toggledString.append(Character.toUpperCase(c));
            } else {
                toggledString.append(Character.toLowerCase(c));
            }
        }
        return toggledString.toString();
    }
}
