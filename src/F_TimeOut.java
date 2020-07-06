
// Exercise: A4 Create Time class

public class F_TimeOut {




    public static void main(String[] args) {

        //Example 1

        F_Time t1 = new F_Time("Vienna", 12,30,40);
        F_Time t2 = new F_Time("London", 13, 25, 40);


        F_Time st[] = new F_Time[2];

        st[0] = new F_Time("Vienna", 05,06,20);
        st[1] = new F_Time("Linz", 12,30,25);

        //Example 2

        t1.printTime();
        t2.printTime();

        System.out.println(" ");

        //Example3

        for(int i = 0; i <st.length; i++){
            st[i].printTime();
        }





    }

}
