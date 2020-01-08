public class Reverse {
    public static void main(String[] args) {

        String word1 = "kayak";
        boolean answer = reverse(word1);
        if(answer)
            System.out.println(word1 + " is Palindrome");
        else
            System.out.println(word1 + " not Polindrom");

    }

    private static boolean reverse(String text) {
    int end = text.length()-1;
    int start = 0;
    while(end>start){
        char forwardChar = text.charAt(start++);
        char backChar = text.charAt(end--);
        if(forwardChar!=backChar){
            return false;
        }
    }
    return true;
    }
}
