/**
 * SurviveMom class represents the mechanics of the game design with rageMeter, wakeUpTime
 * and day. The use of name and age represents the player.
 */
public class SurviveMom {
    private String name;
    private int age;
    private int day;
    private double wakeUpTime;
    private int rageMeter = 0;

    /**
     *constructor for the class, creates a player based on the name given
     * @param name sets the private string name to the name input from the runner.
     */
    public SurviveMom(String name){
        this.name = name;
    }

    /**
     *another constructor for the class, creates a player based on name and age.
     * @param name sets the private string name to the name input from the runner.
     * @param age sets an age as well as name if the player chooses to do so in runner.
     */
    public SurviveMom(String name, int age) {
        this.name = name;
        this.age = age;
        if (age > 15) {
            rageMeter += (age - 15);
        }
    }

        /**
         * String method for the class, returns dialogue based on the input parameter
         * @param oneToSeven sets the private int day to the parameter
         * @return returns a String
         */
    public String weekdayOrWeekend(int oneToSeven){
        day = oneToSeven;
        if(oneToSeven >=1 && oneToSeven<=5){
            return "Taking it eazy I see";
        }
        else
            rageMeter += 5;
         return "Hardcore " + name + ", staying home during a weekend. " + getRageMeter();

        }


    /**
     *a boolean method for the SurviveMom class, returns t or f depending on the private int day
     * @return true or false
     */
    public boolean weekdayOrWeekend(){
        if(day <= 5){
            return true;
        } return false;
    }

    /**
     * String method for the SurviveMom class
     * @return returns dialogue based on the private int rageMeter with every 20 ragemeter getting new dialogue.
     */
    public String getRageMeter() {
        String dialogue = "";
        if(rageMeter <= 20 ){
            dialogue += "Mom's in a pretty good mood right now, don't mess it up " + name;
        }
        if(rageMeter <= 40 && rageMeter > 20){
            dialogue += "Mom is getting a bit cranky... GET ON HER GOOD SIDE " + name + "!!!";
        }
        if(rageMeter <= 60 && rageMeter > 40){
            dialogue += "Mom is wondering why she ever wanted a child, you're walking on thin ice pal";
        }
        if(rageMeter <= 80 && rageMeter > 60){
            dialogue += "Oh? what is this? a human being without the will to live? " + name + " has decided to dig their own grave.";
        }
        if(rageMeter <= 99 && rageMeter > 80){
            dialogue += name + ", stop. you're at death's door.";
        }
        if(rageMeter >= 100){
            return "\n/YYYYYYYYYYYYY\\             |\n|    R.I.P    |\n|             |\n|    DON'T    |\n|     PISS    |\n|    OFF      |\n|     MOM!    |\nTTTTTTTTTTTTTTT";
        }
        return "\nMom's rage is at: " + rageMeter + "%\n" + dialogue.toString();
    }

    /**
     *String method for SurviveMom class that gives dialogue based on int parameter input
     * @param pick in representing each occupation
     * @return dialogue base on pick
     */
    public String yourFutureOccupation(int pick){
        String dialogue = "";

        if(pick >= 5){
            rageMeter = rageMeter + (10 * (pick - 4));
            dialogue += "you have picked a dead end existence. " + getRageMeter();
            return dialogue;
        }
        dialogue += "you have picked a good job, mom's anger meter did not go up.";
        return dialogue;
    }

    /**
     * boolean method to determine when to end the game based on the rageMeter value
     * @return returns true or false based on the rageMeter.
     */
    public boolean gameEnder(){
        if(rageMeter > 100 ){
            return true;
        } return false;
    }

    /**
     * double method to roll for random time to wake up base on the decisions of weekdayOrWeekend
     * @return returns the value of the time the player wakes up.
     */
    public double sleepUntil(){
        if(weekdayOrWeekend()){
            wakeUpTime = 6 + Math.random() * 5;
            return wakeUpTime;
        }
        else wakeUpTime = 6 + Math.random() * 7;
        return  wakeUpTime;
    }

    /**
     *String method for the class that round the time to the nearest hour if the random has decimals over 0.59
     * @param time sets the time of which the character wakes up.
     * @return dialogue given 4 different situations.
     */
    public String rollForTime(double time) {
        double wakeUp = time;

        String school = String.valueOf(wakeUp);
        String noSchool = String.valueOf(wakeUp);
        String timeForWeekday = "";
        String timeForWeekend = "";

        if (weekdayOrWeekend()) {
            if (wakeUp >= 8) {
                rageMeter = rageMeter + (int) ((wakeUp - 8) * 8);
            }
            if ((wakeUp % ((int) wakeUp)) > 0.59 ) {
                wakeUp = (int) wakeUp;
                int changeToColon = school.indexOf(".");
                timeForWeekday = school.substring(0, changeToColon) + ":00";
            }
            else if ((wakeUp % ((int) wakeUp) < 0.59)) {
                int changeToColon = school.indexOf(".");
                timeForWeekday = school.substring(0, changeToColon) + ":" + noSchool.substring(changeToColon + 1, changeToColon + 3);
            }
            return "you woke up at " + timeForWeekday + getRageMeter();
        }

        else if (!weekdayOrWeekend()) {
            if (wakeUp >= 10) {
                rageMeter = rageMeter + (int) ((wakeUp - 10) * 10);
            }
            if (wakeUp % ((int) wakeUp) > 0.59) {
                wakeUp = (int) wakeUp;
                int changeToColon = school.indexOf(".");
                timeForWeekend = noSchool.substring(0, changeToColon) + ":00";
            }
            else if ((wakeUp % ((int) wakeUp) < 0.59)) {
                int changeToColon = school.indexOf(".");
                timeForWeekend = noSchool.substring(0, changeToColon) + ":" + noSchool.substring(changeToColon + 1, changeToColon + 3);
            }
            return "you woke up at " + timeForWeekend + getRageMeter();
        }
        return "This wasn't suppose to happen.";
    }

    /**
     * boolean class for the class
     * @param yOrN a string parameter that takes in a value and assess if it is "y"
     * @return true or flse based on if the parameter is equal to "y"
     */
    public boolean yOrN(String yOrN){
        if(yOrN.equals("y")){
            return true;
        } else return false;
}

    /**
     * String method for SurviveMom class that gives you a choice to do chores
     * @param doItBro String parameter that use the previous method to assess if the person wants to do chores or not
     * @return returns string base on boolean value assessed.
     */
    public String chores(String doItBro) {
        if (yOrN(doItBro)) {
            rageMeter = rageMeter - (int) (Math.random() * 15) + 1;
            return "Mom is pleased her lazy child is finally doing something she can tell to her relatives with some sort of pride \nshe decided to be a little less mad at you. \n" + getRageMeter();
        } else
            rageMeter = rageMeter + (int) (Math.random() * 5) + 1;
            return "Welp, mom expected that out of you, and she's not mad, just disappointed. \nJK. she's a bit pissed. " + getRageMeter();
        }

    /** void method for the class that sets rage to a random num.
     * sets rage meter to a random number, in case someone's feeling ballsy.
     */
    public void YOLO(){
        rageMeter = (int)(Math.random() * 100);
        }


    }