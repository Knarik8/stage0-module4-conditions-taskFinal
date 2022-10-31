package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public static void tellTheSeason(int monthNumber) {
        if (monthNumber < 13 & monthNumber > 0){
            if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2){
                System.out.println("Winter");
            }
            if (monthNumber == 3 || monthNumber == 4 || monthNumber == 5){
                System.out.println("Spring");
            }
            if (monthNumber == 6 || monthNumber == 7 || monthNumber == 8){
                System.out.println("Summer");
            }
            if (monthNumber == 9 || monthNumber == 10 || monthNumber == 11){
                System.out.println("Autumn");
            }
        } else {
            System.out.println("Wrong month number");
        }
    }
    public static void main(String[] args){
        tellTheSeason(8);
    }
}
