package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public static void printDays(int year, int month) {
        if (year > 0 && month > 0 && month < 13){
            if (month == 4 || month == 6 || month == 9 || month == 11){
                System.out.println(30);
            }
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                System.out.println(31);
            }
            if (month == 2){
                if (year % 4 == 0){
                    if (year % 100 == 0){
                        if (year % 400 == 0){
                            System.out.println(29); //leap
                        } else {
                            System.out.println(28); // not leap
                        }
                    } else {
                        System.out.println(29); // leap
                    }
                } else {
                    System.out.println(28); // not leap
                }
            }
        } else {
            System.out.println("invalid date");
        }
    }

    public static void main(String[] args){
        printDays(2021, 20);
    }
}
