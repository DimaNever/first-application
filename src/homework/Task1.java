package homework;

public class Task1 {
    public static void main(String[] args) {
        for (int minutes = 0; minutes <= 59; minutes++) {
            if (minutes <= 14) {
                System.out.println("Minute number " + minutes + " is the first quarter of an hour");
            } else if (minutes <= 29) {
                System.out.println("Minute number " + minutes + " is the second quarter of an hour");
            } else if (minutes <= 44) {
                System.out.println("Minute number " + minutes + " is the third quarter of an hour");
            } else {
                System.out.println("Minute number " + minutes + " is the fourth quarter of an hour");
            }
        }
    }
}
