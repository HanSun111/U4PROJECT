import java.util.Scanner;
public class YourFateRunner {
    public static void main(String[] args) {
        Scanner mamaOHOHOHHHHH = new Scanner(System.in);
        System.out.println("Welcome to Survive Mom Simulator. Input a character name: ");
        String name = mamaOHOHOHHHHH.nextLine();
        SurviveMom s = new SurviveMom(name);

        while(!s.gameEnder()){
            System.out.println("Input a number to signify which day of the week you want to play(1 is mon, 7 is sun): ");
            int day = mamaOHOHOHHHHH.nextInt();

            System.out.println("You are sleeping like a baby on crack, ready to wake up?")
        }


        System.out.println();
    }
}
