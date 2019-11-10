public class Main {
    public static void main(String[] args) {
        int moneyAmount = 18;

        int cappuccinoPrice = 180;
        int lattePrice = 120;
        int espressoPrice = 80;
        int waterPrice = 20;

        boolean canBuyAnything = false;

        boolean moneyEnoughForCappucino = moneyAmount >= cappuccinoPrice;
        boolean moneyEnoughForLatte = moneyAmount >= lattePrice;
        boolean moneyEnoughForEspresso = moneyAmount >= espressoPrice;
        boolean moneyEnoughForWater = moneyAmount >= waterPrice;

        if (moneyEnoughForCappucino){
            System.out.println("Вы можите купить капучино");
            canBuyAnything = true;
        }

        if (moneyEnoughForLatte){
            System.out.println("Вы можите купить латте");
             canBuyAnything = true;
        }

        if (moneyEnoughForEspresso){
            System.out.println("Вы можите купить эспрессо");
             canBuyAnything = true;
        }

        if (moneyEnoughForWater){
            System.out.println("Вы можите купить воду");
             canBuyAnything = true;
        }
        System.out.println(canBuyAnything ? "Выберите напиток:" : "Недостаточно средств!" + "\n" + "Но Вы можите бесплатно сходить в туалет!!!" );
    }
}
