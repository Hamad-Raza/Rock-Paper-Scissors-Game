
import java.util.*; import java.util.Random;

public class Main{

public static void checkN( int n){ if (n==0){ String f = "Rock"; System.out.println(f+" is your choice"); } else if (n==1){ String p= "Paper"; System.out.println(p+" is your choice"); } else { String s= "Scissors"; System.out.println(s+ " is your choice"); } return ; }

public static void checkR( int r ){ if (r==0){ String f = "Rock"; System.out.println(f+" is the computer's choice"); } else if (r==1){ String p= "Paper"; System.out.println(p+" is the computer's choice"); } else { String s= "Scissors"; System.out.println(s+ " is the computer's choice"); } return ; }

public static void checkWinner( int n,int r ){ int c1 =0; int c2=0; if (r==n){ System.out.println("Tied "); } else if ((n==0 && r==1)||(n==1 && r==2)||(n==2 && r==0)){ System.out.println("computer wins "); c1++; } else if ((n==0 && r==2)||(n==1 && r==0)||(n==2 && r==1)){ System.out.println("you won"); c2++; }

}

public static void main (String args[]){

Scanner sc = new Scanner(System.in);
Random random= new Random ();
int c1=0;
int c2=0;
for (int i=0;i<3;i++){


System.out.println(" ----- Welcome to Rock Paper Scissors Game---- \n\n 'Created by $HR' \n\n 0 for rock \n 1 for paper \n 2 for scissors\n 4 for exit");
System.out.println("\n ENTER OPTION \n");


int n = sc.nextInt();
if (n>4){
  System.out.println(" plz enter a valid number ");
}
else if (n==4){
  System.out.println("thank you for playing with us ");
  break;
}
else{
checkN(n);
int r = random.nextInt(3);
checkR(r);
checkWinner(n, r);
}
} System.out.println("game over "); if (c1>c2){ System.out.println("computer is the winner overrall"); } else if (c2>c1){ System.out.println("you are the winner overall"); }

else{
   System.out.println("tied ");
}
} }
