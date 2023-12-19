
/**
 * Write a description of class fraction here.
 *
 * @author William Zheng
 * @version 1.0
 * @param describes individual paramaters of a method
 * @return describles what the method returns
 */
public class Fraction {

    private int numerator, denominator;
    //constructors
    
    public Fraction(){
        numerator = (int)(1+Math.random() * 10);
        denominator = (int)(1+Math.random() * 10);
    }

    public Fraction(int n, int d){
        numerator = n;
        denominator = d;
        denocheck();
    }

    public Fraction(String frac){
        int slash = frac.indexOf("/");
        if(slash > 0) {
            String numer = frac.substring(0,slash);
            String deno = frac.substring(slash+1);
            numerator = Integer.valueOf(numer);
            denominator = Integer.valueOf(deno);
            denocheck();
        }
    }

    public Fraction(Fraction myFraction){
        numerator = myFraction.numerator;
        denominator = myFraction.denominator;
    }
    //Accessor Methods
    /**
     * @return returns the numerator
     */
    public int getNum(){
        return numerator;
    }
    /**
     * @return returns the denominator
     */
    public int getDenom(){
        return denominator;
    }
    /**
     * @return returns the fraction as a string
     */
    public String toString(){
        return numerator+"/"+denominator;
       
    }
    /**
     * @return returns the fraction as a decimal
     */
    public double toDouble(){
        return (double) numerator/denominator;
    }
    
    //Mutator Methods
    /**
     * @return returns the given fraction to its lowest form
     */
    public void reduce(Fraction myFraction){
          int GCF = 0;
          int tempnum = Math.abs(numerator);
          int tempdeno = Math.abs(denominator);
          //System.out.println(denominator);
          //System.out.println(tempdeno);
        while(tempnum != tempdeno){
            //System.out.println(GCF);
            //System.out.println(tempnum);
            //System.out.println(tempdeno);
            if(tempnum>tempdeno) {
                tempnum-= tempdeno;
                GCF = tempnum;
            }
            if(tempdeno>tempnum) {
                tempdeno-= tempnum;
                GCF = tempdeno;
            }
        }
            numerator /= GCF;
            denominator /= GCF;
            
    }
    /**
     * @param the int num changes the numerator to num
     */
    public void setNum(int num){
        numerator = num;
    }
    /**
     * @param the int deno changes the denominator to deno
     */
    public void setDeno(int deno){
        denominator = deno;
        denocheck();
    }
    //Static Methods
    /**
     * @param myFraction1 is the first fraction being multiplied
     * @param myFraction2 is the second fraction being multiplied
     * @return returns the result of the two fractions being multipled together
     */
    public static Fraction multiply(Fraction myFraction1, Fraction myFraction2){
        int numerator1 = myFraction1.getNum();
        int denominator1 = myFraction1.getDenom();
        int numerator2 = myFraction2.getNum();
        int denominator2 = myFraction2.getDenom();
        
        int newnumerator = numerator1 * numerator2;
        int newdenominator = denominator1 * denominator2;
        Fraction multiply = new Fraction(newnumerator,newdenominator);
        multiply.reduce(multiply);
        return multiply;
    }
    /**
     * @param myFraction1 is the first fraction being dividied
     * @param myFraction2 is the second fraction being divided
     * @return returns the result of the first fraction being divided by the second fraction.
     */
    public static Fraction divide(Fraction myFraction1, Fraction myFraction2){
        int numerator1 = myFraction1.getNum();
        int denominator1 = myFraction1.getDenom();
        int numerator2 = myFraction2.getNum();
        int denominator2 = myFraction2.getDenom();
        
        int newnumerator = numerator1 * denominator2;
        int newdenominator = denominator1 * numerator2;
        Fraction divide = new Fraction(newnumerator,newdenominator);
        divide.reduce(divide);
        return divide;
    }
     /**
     * @param myFraction1 is the first fraction being added
     * @param myFraction2 is the second fraction being added
     * @return returns the result of adding the two fractions together
     */
    public static Fraction add(Fraction myFraction1, Fraction myFraction2){
        int numerator1 = myFraction1.getNum();
        int denominator1 = myFraction1.getDenom() ;
        int numerator2 = myFraction2.getNum();
        int denominator2 = myFraction2.getDenom();
        
        int newnumerator1 = numerator1 * denominator2;
        int newnumerator2 = numerator2 * denominator1;
        int newnumerator = newnumerator1 + newnumerator2;
        int newdenominator = denominator1 * denominator2;
        Fraction add = new Fraction(newnumerator,newdenominator);
        add.reduce(add);
        return add;
    }
    /**
     * @param myFraction1 is the first fraction being subtracted
     * @param myFraction2 is the second fraction being subtracted
     * @return returns the result of the first fraction minus the second fraction
     */
    public static Fraction subtract(Fraction myFraction1, Fraction myFraction2){
         int numerator1 = myFraction1.getNum();
        int denominator1 = myFraction1.getDenom() ;
        int numerator2 = myFraction2.getNum();
        int denominator2 = myFraction2.getDenom();
        
        int newnumerator1 = numerator1 * denominator2;
        int newnumerator2 = numerator2 * denominator1;
        int newnumerator = newnumerator1 - newnumerator2;
        int newdenominator = denominator1 * denominator2;
        Fraction subtract = new Fraction(newnumerator,newdenominator);
        subtract.reduce(subtract);
        return subtract;
    }
    //Helper Methods
     /**
     * @param takes in the first number that will be compared to the second nuumber
     * @param takes in the second number that will be compared to the first number
     * @return returns the greatest common factor between the first and second number
     */
    private int GCF(int first, int second){
        int remainder = 0;
        while(first != second) {
            if(first>second) {
                remainder = first - second;
                first = remainder;
            }
            else if(second>first) {
                remainder = second - first;
                second = remainder;
            }
        }
        return remainder;
    }
    public void denocheck(){
        if(denominator == 0) {
        denominator = 1;
        System.out.println("denominator cannot be 0");
      }
    }
    
    public boolean equals(Fraction answer, Fraction userans){
          int answern = answer.getNum();
          int answerd = answer.getDenom();
          int usern = userans.getNum();
          int userd = userans.getDenom();
        
          if(answern == usern && answerd == userd) return true;
          else return false;
          
     }
     
 }
 