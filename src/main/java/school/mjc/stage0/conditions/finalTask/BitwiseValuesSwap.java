package school.mjc.stage0.conditions.finalTask;

public class BitwiseValuesSwap {
    public static void swap(int first, int second) {
        first = first ^ second; //7
        second = first ^ second; // 4
        first = first ^ second; // 3
        System.out.println(first);
        System.out.println(second);
    }
    public static void main(String[] args){
        swap(4, 3);
    }
}
