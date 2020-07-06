import java.util.Scanner;




public class F_BankAccount {

    String Account;
    int Money;
    int newMoney;
    int i = 0;
    int PlusOrMinus;


    F_BankAccount(String a, int m){
        Account = a;
        Money = m;

    }



    public void printAccount(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Write in the kind of change 1 for plus or 2 for minus");
        PlusOrMinus = scan.nextInt();

        //System.out.print(PlusOrMinus);

        if (PlusOrMinus == 1){

            System.out.println( "Write in the Amount: ");
            int amount = scan.nextInt();

            newMoney = Money + amount;

            System.out.println(Account + " " + Money + " + " + amount + " = " + newMoney);

        } else if(PlusOrMinus == 2){

            System.out.println( "Write in the Amount: ");
            int amount = scan.nextInt();

            newMoney = Money - amount;

                if(Money < 0){
                    System.out.println( Account + " " + Money + " -  " + amount + " = " + newMoney + " Your Account is negative");
                }else{
                    System.out.println(Account + " " + Money + " - " + amount + " = " + newMoney);
                }


        } else {
            System.out.println("try again");
        }
    }

    public void printagian(){
        System.out.println(Account + " your account balance is " + newMoney);
    }
}
