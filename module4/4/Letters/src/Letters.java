public class Letters {
    public static void main(String[] args) {
        String alphabet = "abcdefgehijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //System.out.println(alphabet.length());
        for (int i = 0; i < alphabet.length(); i++){
            char ch = alphabet.charAt(i);
            System.out.println("Код буквы " + ch + ": " + (int) ch);
        }
    }
}
