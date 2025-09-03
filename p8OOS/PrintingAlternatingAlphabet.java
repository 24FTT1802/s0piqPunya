public class PrintingAlternatingAlphabet {
    public static void main(String[] args) {
        
        String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < 26; i++){
            System.out.print(alpha[i] + " ");
            System.out.print(alpha[25-i] + " ");
        }
    }
}
