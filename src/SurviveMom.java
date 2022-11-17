public class SurviveMom {
    private String name;
    private int day;
    private int rageMeter = 0;

    public SurviveMom(String name){
        this.name = name;
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

    public String getRageMeter() {
        String dialogue = "";
        if(rageMeter <= 20 ){
            dialogue += "Mom's in a pretty good mood right now, don't mess it up " + name;
        }
        if(rageMeter <= 40 && rageMeter > 20){
            dialogue += "Mom is getting a bit cranky... GET ON HER GOOD SIDE " + name + "!!!";
        }
        if(rageMeter <= 60 && rageMeter > 40){
            dialogue += "Mom is wondering why she ever wanted a child, you're walking on thin ice " + name;
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

        return "Mom's rage is at: " + rageMeter + "%\n" + dialogue;
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

    /**
     *
     * @param ready
     * @return
     */
    public String rollForTime(String ready) {
        double weekday = 6 + Math.random() * 5;
        double weekend = 6 + Math.random() * 7;

        String school = String.valueOf(weekday);
        String noSchool = String.valueOf(weekday);
        String timeForWeekday = "";
        String timeForWeekend = "";

        while (ready.equals("N") || ready.equals("n") || ready.equals("no") || ready.equals("No")) {
            return "Welp, I'll wait... I've got all the time in the world";
        }
        if (weekdayOrWeekend()) {
            if (weekday >= 8) {
                rageMeter = rageMeter + (int) ((weekday - 8) * 8);
            }
            if ((weekday % ((int) weekday)) > 0.59 ) {
                weekday = (int) weekday;
                int changeToColon = school.indexOf(".");
                timeForWeekday = school.substring(0, changeToColon) + ":00";
            }
            else if ((weekday % ((int) weekday) < 0.59)) {
                int changeToColon = school.indexOf(".");
                timeForWeekday = school.substring(0, changeToColon) + ":" + noSchool.substring(changeToColon + 1, changeToColon + 3);
            }
            return "you woke up at " + timeForWeekday + getRageMeter();
        }

        else if (!weekdayOrWeekend()) {
            if (weekend >= 10) {
                rageMeter = rageMeter + (int) ((weekend - 10) * 10);
            }
            if (weekend % ((int) weekend) > 0.59) {
                weekend = (int) weekend;
                int changeToColon = school.indexOf(".");
                timeForWeekend = noSchool.substring(0, changeToColon) + ":00";
            }
            else if ((weekend % ((int) weekend) < 0.59)) {
                int changeToColon = school.indexOf(".");
                timeForWeekend = noSchool.substring(0, changeToColon) + ":" + noSchool.substring(changeToColon + 1, changeToColon + 3);
            }
            return "you woke up at " + timeForWeekend + getRageMeter();
        }
        return "This wasn't suppose to happen.";
    }

}