
public class Darsh1_10 {
    public static StringBuffer encrypt(String text, int s) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) //checks if the current char in the entered string is in uppercase or not.
            {
                char ch = (char) (((int) text.charAt(i) + s - 65) % 26 + 65);//if yes then it increases its ascii value by s numbers so the char changes
                result.append(ch);
            } 
            else 
            {
                char ch = (char) (((int) text.charAt(i) + s - 97) % 26 + 97);//it increases its ascii value by s numbers so the char changes
                result.append(ch);
            }
        }
        return result;
    }
    
}
