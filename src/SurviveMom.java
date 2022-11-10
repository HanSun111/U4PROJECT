public class SurviveMom {
    private String name;
    private int day;
    private int rageMeter = 0;

    public SurviveMom(String name){
        this.name = name;
    }

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
            dialogue = "";
        }

        return "Mom's rage is at: " + rageMeter + "%\n" + dialogue;
    }

/*

/=============\
|             |
|    R.I.P    |
|             |
|    DON'T    |
|     PISS    |
|    OFF      |
|     MOM!    |
----------------
 */


}