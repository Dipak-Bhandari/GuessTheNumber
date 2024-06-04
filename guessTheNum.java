import java.util.Scanner;
import java.util.SortedMap;

public class guessTheNum {
    public static void main(String[] args) {

        // initialize the min and max of a dice
        int min = 1;
        int max = 6;
        // initialize random number generator with Math.random() method
        int random_num = (int)Math.floor(Math.random()*(max-min+1)+min);
        // initialize lives
        int lives =3;
        System.out.println("You have "+lives+" lives");
        // initialize user input to take guess from user
        Scanner sc = new Scanner(System.in);
        // initialize points
        int points =0;

        while (lives!= 0){
            System.out.println("Enter your guess : ");
            int guess_Num= sc.nextInt();

            if(guess_Num==random_num){
                System.out.println("Well Done!!");
                points++;
                System.out.println("your score : "+points);
            }else{
                System.out.println("Bummer Try Again!!");
                lives-=1;
                System.out.println("you got "+lives+" chances.");
            }

        }

        }

}
