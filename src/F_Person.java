public class F_Person {

    String firstname;
    String lastname;

    int age;
    String job;
    String gender;

    public void getFullName(){

        if (gender == "m") {
            System.out.println("His full name is " + firstname + " " + lastname + ".");
            System.out.println("His age is" + age + " and his job is" + job + ".");
        } else {
            System.out.println("Her full name is " + firstname + " " + lastname + ".");
            System.out.println("Her age is" + age + " and her job is" + job + ".");
        }
    }

    public void getFullNameTwo(){
        if (gender == "m") {
            System.out.println("His full name is " + firstname + " " + lastname.toUpperCase() + ".");
            System.out.println("His age is" + age + " and his job is" + job + ".");
        } else {
            System.out.println("Her full name is " + firstname + " " + lastname.toUpperCase() + ".");
            System.out.println("Her age is" + age + " and her job is" + job + ".");
        }
    }

}
