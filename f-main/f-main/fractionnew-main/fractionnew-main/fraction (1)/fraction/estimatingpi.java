
public class estimatingpi
{       
    public static void main(String[] args) {
    
        Fraction MILU = new Fraction(355, 113);
        double EPSILON = Math.abs(Math.PI - MILU.toDouble());

        Fraction approximation = new Fraction(10, 32);  

        while (Math.abs(Math.PI - approximation.toDouble()) > EPSILON) {
            if (approximation.toDouble() < Math.PI) {
                approximation.setNum(approximation.getNum()+1);
            } else {
                approximation.setDeno(approximation.getDenom()+1);
            }
            System.out.println(approximation);
        }

        System.out.println("The next closest fraction to PI is: " + approximation.getNum()+ "/" + approximation.getDenom());
    }
}
