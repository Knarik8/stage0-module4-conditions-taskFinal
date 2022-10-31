package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public static void printCompletelyDivided(int dividend, int divider) {
        int result = (dividend / divider) * divider;
        if (result == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }

    public static void main(String[] args){
        printCompletelyDivided(15, 4);
    }
}
