import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Welcome to the Astrology Program\n\t1.Western Astrology\n\t2.Chinese Astrology\n\tPress 1 for Western or 2 for Chinese\n\tYour Choice Please? : ");
        int num = x.nextInt();
        switch (num){
            case 1:
                System.out.println("\tStarting Western Astrology ..");
                System.out.print("\tEnter Day and Month of Birth e.g for 5th Oct [5 10]: ");
                int day =x.nextInt();
                int month = x.nextInt();
                if(day<= 0 || day>31 )
                    System.out.println("\tError! That's not even a day!!");
                else if (month<=0||month>12)
                    System.out.println("\tError! That's not even a month!!");
                else if(month==2&&day>29)
                    System.out.println("\tError Again! February doesn't have this day!!");
                else if (((day >= 20 && month == 1) || (day <= 18 && month == 2)))
                    System.out.println("\tYour Zodiac is : Aquarius");
                else if (((day >= 19 && month == 2) || (day <= 20 && month == 3)))
                    System.out.println("\tYour Zodiac is : Pisces");
                else if (((day >= 21 && month == 3) || (day <= 19 && month == 4)))
                    System.out.println("\tYour Zodiac is : Aries");
                else if (((day >= 20 && month == 4) || (day <= 20 && month == 5)))
                    System.out.println("\tYour Zodiac is : Taurus");
                else if (((day >= 21 && month == 5) || (day <= 20 && month == 6)))
                    System.out.println("\tYour Zodiac is : Gemini");
                else if (((day >= 21 && month == 6) || (day <= 22 && month == 7)))
                    System.out.println("\tYour Zodiac is : Cancer");
                else if (((day >= 23 && month == 7) || (day <= 22 && month == 8)))
                    System.out.println("\tYour Zodiac is : Leo");
                else if (((day >= 23 && month == 8) || (day <= 22 && month == 9)))
                    System.out.println("\tYour Zodiac is : Virgo");
                else if (((day >= 23 && month == 9) || (day <= 22 && month == 10)))
                    System.out.println("\tYour Zodiac is : Libra");
                else if (((day >= 23 && month == 10) || (day <= 21 && month == 11)))
                    System.out.println("\tYour Zodiac is : Scorpio");
                else if (((day >= 22 && month == 11) || (day <= 21 && month == 12)))
                    System.out.println("\tYour Zodiac is : Sagitarius");
                else
                    System.out.println("\tYour Zodiac is : Capricorn");
                break;
            case 2:
                System.out.println("\tStarting Chinese Astrology ..");
                System.out.print("\tEnter Year of Birth: ");
                int year =x.nextInt();
                switch (year){
                    case 0:
                        System.out.println("\tYour Zodiac is : Monkey");
                        break;
                    case 1:
                        System.out.println("\tYour Zodiac is : Rooster");
                        break;
                    case 2:
                        System.out.println("\tYour Zodiac is : Dog");
                        break;
                    case 3:
                        System.out.println("\tYour Zodiac is : Pig");
                        break;
                    case 4:
                        System.out.println("\tYour Zodiac is : Rat");
                        break;
                    case 5:
                        System.out.println("\tYour Zodiac is : Ox");
                        break;
                    case 6:
                        System.out.println("\tYour Zodiac is : Tiger");
                        break;
                    case 7:
                        System.out.println("\tYour Zodiac is : Rabbit");
                        break;
                    case 8:
                        System.out.println("\tYour Zodiac is : Dragon");
                        break;
                    case 9:
                        System.out.println("\tYour Zodiac is : Snake");
                        break;
                    case 10:
                        System.out.println("\tYour Zodiac is : Horse");
                        break;
                    case 11:
                        System.out.println("\tYour Zodiac is : Goat");
                        break;
                }
                break;
            default:
                System.out.println("\tError!, Press [1] or [2] ONLY!!");
        }
        System.out.println("Hope you Enjoyed :)");
        System.out.print("Thanks for using my Program ..");
    }
}