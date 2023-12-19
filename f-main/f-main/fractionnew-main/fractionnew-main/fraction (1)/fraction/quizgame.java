
/**
 * Write a description of class quizgame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class quizgame
{
    private static int Correct = 0;
    private static int NumofQuestions = 0;
    public static void main(String[] args){

        //System.out.println("???");
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        while(quit == false){
            //System.out.println("???");
            Fraction first = new Fraction();
            Fraction second = new Fraction();
            String op = "";
            Fraction answer = new Fraction(1,1);
            
            int randomop = (int) (Math.random() * 4);
            System.out.println(randomop);
            if(randomop == 0){
                //System.out.println("A");
                op = "+";
                answer = Fraction.add(first, second);
                //System.out.println("!");
            }
            if(randomop == 1){
                //System.out.println("B");
                op = "-";
                answer = Fraction.subtract(first, second);
                //System.out.println("!");
            }
            if(randomop == 2){
                //System.out.println("C");
                op = "*";
                answer = Fraction.multiply(first, second);
                //System.out.println("!");
            }
            if(randomop == 3){
                //System.out.println("D");
                op = "/";
                answer = Fraction.divide(first, second);
                //System.out.println("!");
            }

            //System.out.println("???");

            System.out.print(first);
            System.out.print(op);
            System.out.print(second + " =");
            String user = scan.nextLine();
            if(user.equals("quit")) {
                ending();
                quit = true;
            }
            Fraction userans = new Fraction(user);

            if(answer.equals(answer, userans)) {
                System.out.println("Correct");
                Correct++;
            }
            else System.out.println("The answer was " + answer);
            NumofQuestions++;
        }
    }

    public static void ending(){
        double percentage = ((double)Correct/NumofQuestions)*100;
        System.out.println("Your win/loss ratio was " +Correct+"/"+NumofQuestions+", for a score of " +percentage+ " percent!");
        System.exit(0);
    }
}
