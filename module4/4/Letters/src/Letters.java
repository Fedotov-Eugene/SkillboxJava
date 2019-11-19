public class Letters {
    public static void main(String[] args) {
        String alphabet = "abcdefgehijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < alphabet.length(); i++){
            char ch = alphabet.charAt(i);
            System.out.printf("'%c': %4d %n", ch, (int) ch);
        }
    }
}
