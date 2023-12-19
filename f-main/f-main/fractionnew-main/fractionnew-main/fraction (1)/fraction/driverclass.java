
/**
 * Write a description of class driverclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class driverclass
{
    public static void main(String[] args){
        Fraction fraction1 = new Fraction(252,105);
        Fraction fraction2 = new Fraction("1/2");
        fraction1.reduce(fraction1);
        System.out.println(fraction1);
       // System.out.println(fraction2);
       // System.out.println(fraction1);
        //System.out.println(fraction1.getNum());
        //System.out.println(fraction1.toString());
       // System.out.println(fraction1.toDouble());
       // fraction1.reduce();
       // System.out.println(fraction1);
        Fraction half = new Fraction(5,10);
        Fraction third = new Fraction (6,20);
        Fraction m = Fraction.add(half, third);
        //System.out.println(m);
    }
}
