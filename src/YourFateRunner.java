import java.util.Scanner;
public class YourFateRunner {
    public static void main(String[] args) {
        int daysSurvived = 0;
        Scanner mamaOHOHOHHHHH = new Scanner(System.in);
        System.out.println("Welcome to Survive Mom Simulator. Input a character name: ");
        String name = mamaOHOHOHHHHH.nextLine();
        SurviveMom s = new SurviveMom(name);

        while(!s.gameEnder()){
            System.out.println("Input a number to signify which day of the week you want to play(1 is mon, 7 is sun): ");
            int day = mamaOHOHOHHHHH.nextInt();
            System.out.println(s.weekdayOrWeekend(day));
            System.out.println("You are sleeping like a baby on crack, ready to wake up? (y/n)");
            String areYouReadyKids = mamaOHOHOHHHHH.nextLine();
            System.out.println(s.rollForTime(areYouReadyKids));
            while(areYouReadyKids.equals("n")){
                String areYouReadyKid = mamaOHOHOHHHHH.nextLine();
                System.out.println(s.rollForTime(areYouReadyKid));
            }

            System.out.println("Now, this is a multiple choice question. \n your dream occupation when you reach adult hood is \n");
            System.out.println(" 1. Doctor \n 2. lawyer \n 3. coder \n 4. scientist \n 5. actor \n 6. streamer \n 7. Freeloader");
            int num = mamaOHOHOHHHHH.nextInt();
            System.out.println(s.yourFutureOccupation(num));
            // to be implemented minigames throughout the day with mom.



            daysSurvived++;
        }


        System.out.println("you survived " + daysSurvived + "days");
    }
}
