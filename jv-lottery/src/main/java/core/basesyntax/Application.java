package core.basesyntax;

public class Application {
    private static int number_of_repeat = 3;
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        for (int i = 0; i < number_of_repeat; i++) {
            System.out.println(lottery.getRandomBall());
        }
    }
}
