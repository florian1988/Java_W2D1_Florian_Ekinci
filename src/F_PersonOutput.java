public class F_PersonOutput {

    public static void main(String[] args) {
        F_Person p1 = new F_Person();
        F_Person p2 = new F_Person();

        p1.name = "Frank";
        p1.age = 30;
        p1.job = "manager";
        p1.gender = "m";

        p2.name = "Maria";
        p2.age = 33;
        p2.job = "consultant";
        p2.gender = "f";



        System.out.println( "The Person is " + p1.name + " his age is " + p1.age + " and he workes as a " + p1.job + ".");
        System.out.print( "The Person is " + p2.name + " her age is " + p2.age + " and she workes as a " + p2.job + ".");


    }



}
