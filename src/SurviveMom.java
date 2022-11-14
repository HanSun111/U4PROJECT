import java.util.ArrayList;

public class SurviveMom {
    private String name;
    private int day;
    private int rageMeter = 0;

    public SurviveMom(String name){
        this.name = name;
    }

    public String weekdayOrWeekend(int oneToSeven){
        if(oneToSeven >=1 && oneToSeven<=5){
            return "Taking it eazy I see";
        }
        else if(oneToSeven >5 && oneToSeven<=7){
            rageMeter += 5;
            return "Hardcore man, staying home during a weekend. " + getRageMeter();
        }
        else return "Last time I counted, there was only seven days in a week.";
    }
    ArrayList list = new ArrayList<Double>();
    public String getRageMeter() {
        String dialogue = "";
        if(rageMeter <= 20 ){
            dialogue += "Mom's in a pretty good mood right now, don't mess it up";
        }
        if(rageMeter <= 40 && rageMeter > 20){
            dialogue += "Mom is getting a bit cranky... GET ON HER GOOD SIDE";
        }
        if(rageMeter <= 60 && rageMeter > 40){
            dialogue += "Mom is wondering why she ever wanted a child, you're walking on thin ice pal";
        }
        if(rageMeter <= 80 && rageMeter > 60){
            dialogue += "Mom feels benevolent today, you can now choose how you get beat up. ";
        }
        if(rageMeter <= 99 && rageMeter > 80){
            dialogue += "Dude, stop. you're at death's door.";
        }
        if(rageMeter >= 100){
            dialogue += "/YYYYYYYYYYYYY\\             |\n|    R.I.P    |\n|             |\n|    DON'T    |\n|     PISS    |\n|    OFF      |\n|     MOM!    |\nTTTTTTTTTTTTTTT";
        }

        return "Mom's rage is at: " + rageMeter + "%\n" + dialogue;
    }

    public boolean gameEnder(){
        if(rageMeter > 100 ){
            return true;
        } return false;
    }


    public String rollForTime(String ready){
        double weekday = 6 + Math.random() * 5;
        double weekend = 6 + Math.random() * 7;
        String school = String.valueOf(weekday);
        String noSchool = String.valueOf(weekday);
        while(ready.equals("N")){
            return "Welp, I'll wait... I've got all the time in the world";
        }
        if(weekday % ((int)weekday) > 0.59 && weekday <= 8){
            weekday = (int)weekday;
            int changeToColon = school.indexOf(".");
            String timeForWeekday = school.substring(0, changeToColon) + ":00";
        }
        else if(weekday <= 8 && (weekday % ((int)weekday) > 0.59)){
            int changeToColon = school.indexOf(".");
            String timeForWeekday = school.substring(0, changeToColon) + ":" + noSchool.substring(changeToColon + 1, changeToColon + 3);
        }

        if(weekend % ((int)weekend) > 0.59 && weekend <= 8){
            weekend = (int)weekend;
            int changeToColon = school.indexOf(".");
            String timeForWeekend = noSchool.substring(0, changeToColon) + ":00";
        }
        else if(weekend <= 8 && (weekend % ((int)weekend) < 0.59)){
            int changeToColon = school.indexOf(".");
            String timeForWeekday = noSchool.substring(0, changeToColon) + ":" + noSchool.substring(changeToColon + 1, changeToColon + 3);
        }
    }

}