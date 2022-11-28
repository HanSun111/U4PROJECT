import java.util.Scanner;
public class YourFateRunner {
    public static void main(String[] args) {
        int daysSurvived = 1;
        Scanner mamaOHOHOHHHHH = new Scanner(System.in);
        System.out.println("Welcome to Survive Mom Simulator. Input a character name: ");
        String name = mamaOHOHOHHHHH.nextLine();
        SurviveMom s = new SurviveMom(name);

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
            while(day < 1 || day > 7){
                System.out.println("ONE TO SEVEN IDIOT. THIS IS WHY MOM IS ALWAYS PISSED");
                day = mamaOHOHOHHHHH.nextInt();
            }
            System.out.println(s.weekdayOrWeekend(day));

            System.out.println("You are sleeping like a baby on crack, ready to wake up? press 1 to continue");
            int wakeUpOrNah = mamaOHOHOHHHHH.nextInt();
            while(wakeUpOrNah != 1){
                System.out.println("A jokester are we, just press 1 my guy, or just stay here forever. It's a simple spell but quite unbreakable.");
                wakeUpOrNah = mamaOHOHOHHHHH.nextInt();
            }
            System.out.println(s.rollForTime(s.sleepUntil()));


            System.out.println("Now, this is a multiple choice question. \n your dream occupation when you reach adult hood is \n");
            System.out.println(" 1. Doctor \n 2. lawyer \n 3. coder \n 4. scientist \n 5. actor \n 6. streamer \n 7. Freeloader");
            int num = mamaOHOHOHHHHH.nextInt();
            while(num < 1 || num > 7){
                System.out.println("just for that, I'm adding a point to the rage. Just follow the script");
                num = mamaOHOHOHHHHH.nextInt();
            }
            System.out.println(s.yourFutureOccupation(num));

            if(!s.weekdayOrWeekend()){
                System.out.println("Since you are home and is currently doing nothing, mother wants to know if you are willing to help her with chores. y for yes, anything else for no");
                String doIt = mamaOHOHOHHHHH.next();
                s.yOrN(doIt);
                System.out.println(s.chores(doIt));
            }

            if(s.weekdayOrWeekend()){
                System.out.println("You arrived home at 8 pm cause you were doing some light skin activity with your friend group, mom tells you to eat and go to bed, and so you do, end of " + daysSurvived);
            } else {
                System.out.println("You did A LOT of stuff today... from sleeping, to resting to contemplating your pathetic life\n Mom has fed you and it is the end of the " + daysSurvived + " day");
            }
            System.out.println("proceed with next day? type anything except for the letter n to continue");
            String endOfADay = mamaOHOHOHHHHH.nextLine();
            while(endOfADay.equals("n")){
                System.out.println("welp, I'll wait.");
            }

            System.out.println( name + " has survived " + daysSurvived + " days");
            if(daysSurvived % 5 == 0){
                System.out.println("You've made it pretty far along, eh young player. \nWanna be a baller and let computer RNG decide your fate? \nWanna go hard or go home? \n this is your chance. if you agree to this, it will reset the rage to a random number from 0 to 99. \n so, what would it be, wanna be a baller. \n type in full cap HELL YEAH to roll, and anything else to be boring and move on. ");
                String youABallerBro = mamaOHOHOHHHHH.nextLine();
                if(youABallerBro.equals("HELL YEAH")){
                    s.YOLO();
                    s.getRageMeter();
                }
            }
            daysSurvived++;
        }
        s.getRageMeter();
    }
}
