import java.util.Scanner;
public class YourFateRunner {
    public static void main(String[] args) {
        int daysSurvived = 0;
        Scanner mamaOHOHOHHHHH = new Scanner(System.in);
        System.out.println("Welcome to Survive Mom Simulator. Input a character name: ");
        String name = mamaOHOHOHHHHH.nextLine();
        SurviveMom s = new SurviveMom(name);;

        System.out.println("You can choose to select an age to be at, but keep in mind this might make the game more difficult  \nThe older you are the more angry mom is gonna be that you still live with her\n do you wish to do so? y/n");
        String decideAnAge = mamaOHOHOHHHHH.nextLine();

        if(decideAnAge.equals("y") || decideAnAge.equals("Y")){
            System.out.println("input age: ");
            int age = mamaOHOHOHHHHH.nextInt();
            s = new SurviveMom(name, age);
        }

        while(!s.gameEnder()){
            System.out.println("Input a number to signify which day of the week you want to play(1 is mon, 7 is sun): ");
            int day = mamaOHOHOHHHHH.nextInt();
            System.out.println(s.weekdayOrWeekend(day));

            System.out.println("You are sleeping like a baby on crack, ready to wake up? press 1 to continue");
            int wakeUpOrNah = mamaOHOHOHHHHH.nextInt();
            while(wakeUpOrNah != 1){
                System.out.println("Bro, that ain't the number 1 @-@");
                wakeUpOrNah = mamaOHOHOHHHHH.nextInt();
            }
            System.out.println(s.rollForTime(s.sleepUntil()));


            System.out.println("Now, this is a multiple choice question. \n your dream occupation when you reach adult hood is \n");
            System.out.println(" 1. Doctor \n 2. lawyer \n 3. coder \n 4. scientist \n 5. actor \n 6. streamer \n 7. Freeloader");
            int num = mamaOHOHOHHHHH.nextInt();
            System.out.println(s.yourFutureOccupation(num));

            if(!s.weekdayOrWeekend()){
                System.out.println("Since you are home and is currently doing nothing, mother wants to know if you are willing to help her with chores. y/n");
                String wannaDoIt = mamaOHOHOHHHHH.nextLine();
                while(wannaDoIt != "y" || wannaDoIt != "n"){
                    System.out.println("READ THE DIRECTION ABOVE IT IS EITHER LOWER CASE y OR LOWER CASE n. MY LITERAL GRANDMA DID THIS NO PROBLEM.");
                    wannaDoIt = mamaOHOHOHHHHH.nextLine();
                }
                System.out.println(s.choresAndStudy(wannaDoIt) );
            }
            daysSurvived++;
            System.out.println( name + " has survived" + daysSurvived + " days");
        }

    }
}
