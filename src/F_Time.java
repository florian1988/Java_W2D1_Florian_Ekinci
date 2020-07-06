import java. util.*;

public class F_Time {

    String City;
    int Hours;
    int Minutes;
    int Seconds;
    int[] please;

    F_Time( String C, int H, int M, int S){
        this.City = C;
        this.Hours = H;
        this.Minutes = M;
        this.Seconds = S;

    }

    /*public void array(){
        please = new int[]{Hours, Minutes, Seconds};

        for(int i = 0; i < please.length; i++)
        System.out.print(please[i]);
    }


     */



    public void printTime(){
        System.out.println( "The Time in " + this.City + " is " + this.Hours + " hours, " + this.Minutes + " minutes and " + this.Seconds + " seconds.");

    }










}
