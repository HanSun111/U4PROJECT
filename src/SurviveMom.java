public class SurviveMom {
    private String name;
    private int age;
    private int day;
    private double wakeUpTime;
    private int rageMeter = 0;
    public SurviveMom(String name){
        this.name = name;
    }

    public SurviveMom(String name, int age) {
        this.name = name;
        this.age = age;
        if (age > 15) {
            rageMeter += (age - 15);
        }
    }

        /**
         *
         * @param oneToSeven
         * @return
         */
    public String weekdayOrWeekend(int oneToSeven){
        day = oneToSeven;
        if(oneToSeven >=1 && oneToSeven<=5){
            return "Taking it eazy I see";
        }
        else if(oneToSeven >5 && oneToSeven<=7){
            rageMeter += 5;
            return "Hardcore" + name + ", staying home during a weekend. " + getRageMeter();
        }
        else return "Last time I counted, there was only seven days in a week.";
    }

    /**
     *
     * @return
     */
    public boolean weekdayOrWeekend(){
        if(day <= 5){
            return true;
        } return false;
    }

    public void rageMaxed(){

    }
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
            dialogue += "Mom feels benevolent today, you can now choose how you get beat up. ";
        }
        if(rageMeter <= 99 && rageMeter > 80){
            dialogue += name + ", stop. you're at death's door.";
        }
        if(rageMeter >= 100){
            dialogue += "/YYYYYYYYYYYYY\\             |\n|    R.I.P    |\n|             |\n|    DON'T    |\n|     PISS    |\n|    OFF      |\n|     MOM!    |\nTTTTTTTTTTTTTTT";
        }

        return "\nMom's rage is at: " + rageMeter + "%\n" + dialogue;
    }

// add a print statement in runner class that introduces some jobs. Here's a list ==> freeloader, coder, lawyer, doctor, actor, pro gamer, streamer, designer etc

    /**
     *
     * @param pick
     * @return
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

    public boolean gameEnder(){
        if(rageMeter > 100 ){
            return true;
        } return false;
    }

    public double sleepUntil(){
        if(weekdayOrWeekend()){
            wakeUpTime = 6 + Math.random() * 5;
            return wakeUpTime;
        }
        else wakeUpTime = 6 + Math.random() * 7;
        return  wakeUpTime;
    }

    /**
     *
     * @param
     * @return
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

    public String choresAndStudy(String doItBro){
        if(doItBro.equals("y")){
            rageMeter= rageMeter - (int)(Math.random() * 15) + 1;
            return "Mom is pleased her lazy child is finally doing something she can tell to her relatives with some sort of pride \nshe decided to be a little less mad at you. \n" + getRageMeter();
        } else
            rageMeter = rageMeter + (int)(Math.random() * 5) + 1;
            return "Welp, mom expected that out of you, and she's not mad, just disappointed. \nJK. she's a bit pissed. " + getRageMeter();
    }

}