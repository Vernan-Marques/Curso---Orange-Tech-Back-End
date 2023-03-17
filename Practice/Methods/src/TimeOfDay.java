/*
 From the time of day, enter the appropriate message: Good morning, Good afternoon and Good night.
 */

public class TimeOfDay {
    public static void getTime(int time) {
        switch (time) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                goodMorningMessage();
                break;

            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:

                goodAfternoonMenssage();
                break;

            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 00:
            case 1:
            case 2:
            case 3:
            case 4:

                goodNightMenssage();
                break;
        }
    }

    public static void goodMorningMessage() {
        System.out.println("Good Morning!");
    }
    public static void goodAfternoonMenssage() {
        System.out.println("Good Afternoon!");
    }
    public static void goodNightMenssage() {
        System.out.println("Good Night!");
    }
}
