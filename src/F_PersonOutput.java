public class F_PersonOutput {

    //Exercise A1 Create a class Person
    //Exercise A2 (Intermediate)


    public static void main(String[] args) {
        F_Person p1 = new F_Person();
        F_Person p2 = new F_Person();

        p1.firstname = "Frank";
        p1.lastname = "Franklin";
        p1.age = 30;
        p1.job = "manager";
        p1.gender = "m";

        p2.firstname = "Maria";
        p2.lastname = "Mangar";
        p2.age = 33;
        p2.job = "consultant";
        p2.gender = "f";



        System.out.println( "The Person is " + p1.firstname + " his age is " + p1.age + " and he workes as a " + p1.job + ".");
        System.out.println( "The Person is " + p2.firstname + " her age is " + p2.age + " and she workes as a " + p2.job + ".");
        System.out.println(" ");

        p1.getFullName();
        p2.getFullName();

        System.out.println(" ");

        p1.getFullNameTwo();
        p2.getFullNameTwo();

    }



}
