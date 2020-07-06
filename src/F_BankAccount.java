import java.util.Scanner;




public class F_BankAccount {

    String Account;
    int Money;
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

            System.out.print( "Write in the Amount: ");
            int amount = scan.nextInt();

            Money = Money + amount;
            System.out.print(Account + "   " + Money);

        } else if(PlusOrMinus == 2){

            System.out.print( "Write in the Amount: ");
            int amount = scan.nextInt();

            Money = Money - amount;

                if(Money < 0){
                    System.out.print(  Account + " Your Account is negative with:  " + Money);
                }else{
                    System.out.print(Account + "   " + Money);
                }


        } else {
            System.out.print("try again");
        }
    }
}
