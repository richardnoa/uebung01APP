/**
 * @author Richard Noack
 * */

public class Complex implements Cloneable{

    static double zero, one, i;

    private double realPart , imaginaryPart;

    /**
     * ################# help methods #################
     * */
    /**
     * parsing real and imaginary part to integer without losing decimal points
     * @param real double
     * @param imaginary double
     *
     * @return integer
     * */
    static public int getHashComplex(double real, double imaginary) {
        String aString = String.valueOf(real);
        String bString = String.valueOf(imaginary);
        aString = aString.replace(".","");
        bString = bString.replace(".","");
        int aNum = Integer.valueOf(aString);
        int bNum = Integer.valueOf(bString);
        return aNum + (9 * bNum + 1);
    }
    /**
     * help method calculate the absolut between two values
     * |x|= sqrt(a^2+b^2)
     * @param a double
     * @param b double
     * @return double
     * */
    //calculate absolute between two values
    static double absolute (double a, double b){
        return  Math.sqrt(Math.pow(a,2.0) * Math.pow(b,2.0));
    }

    /**
     * ################# class methods #################
     * */
    /**
     * static equals method
     * @param one Complex number
     * @param two Complex number
     * @return boolean
     * */
    static boolean equalsStatic(Complex one, Complex two){
        Complex o = one;
        Complex t = two;
        if(o.getRealPart() != t.getRealPart()){
            return false;
        }
        if(o.getImaginaryPart() != t.getImaginaryPart()){
            return false;
        }
        return true;
    }
    /**
     * static hashCode is the same for objects with the same real and imaginary part
     * @param obj Complex
     * @return int hashCode
     * */
    static int hashCode(Complex obj){
        double real = obj.getRealPart();
        double imagenary = obj.getImaginaryPart();
        return getHashComplex(real,imagenary);
    }

    /**
     * calculate the absolute value of an complex number
     * @param obj Complex
     * @return double absolute
     * */
    //calculate the absolute value of an complex number
    static double abs (Complex obj){
        double a = obj.getRealPart();
        double b = obj.getImaginaryPart();
        return Complex.absolute(a,b);
    }
    /**
     * adding two complex numbers
     * x+y = (a+c)+i(b+d)
     * @param one Complex
     * @param two Complex
     * @return Complex
     *
     * */
    static Complex add (Complex one, Complex two){
        double oneReal = one.getRealPart();
        double oneImaginary = one.getImaginaryPart();
        double twoReal = two.getRealPart();
        double twoImaginary = two.getImaginaryPart();
        Complex sum = new Complex((oneReal+twoReal),(oneImaginary+twoImaginary));
        return sum;
    }
    /**
     * multiply two complex numbers
     * xy = (ac − bd) + i(ad + bc)
     * @param one Complex
     * @param two Complex
     * @return Complex
     * */

    static Complex mult(Complex one, Complex two){
        double oneReal = one.getRealPart();
        double oneImaginary = one.getImaginaryPart();
        double twoReal = two.getRealPart();
        double twoImaginary = two.getImaginaryPart();
        Complex prod = new Complex((oneReal*twoReal - oneImaginary*twoImaginary),(oneReal*twoImaginary+oneImaginary*twoReal));
        return prod;
    }

    /**
     * ################# object methods #################
     * */

    /**
     * class constructor default and copy constructor
     * */
    public Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    /**
     * class constructor
     * @param realPart double
     * @param imaginaryPart double
     * */
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    /**
     * class constructor witch makes a copy from an object
     * @param copy Complex
     * */
    public Complex(Complex copy) {
        this.realPart = copy.realPart;
        this.imaginaryPart = copy.imaginaryPart;
    }

    /**
     * addition on complex object
     * x+y =  (a+c)+i(b+d)
     * @param obj Complex
     * @return Complex
     *
     * */
    public Complex add(Complex obj){
        this.setRealPart(this.getRealPart()+obj.getRealPart());
        this.setImaginaryPart(this.getImaginaryPart()+obj.getImaginaryPart());
        return this;
    }
    /**
     * multiplication on complex object
     * xy = (ac − bd) + i(ad + bc)
     * @param obj Complex
     * @return Complex
     * */
    public Complex mult(Complex obj){

        double a = this.getRealPart();
        double b = this.getImaginaryPart();
        double c = obj.getRealPart();
        double d = obj.getImaginaryPart();

        this.setRealPart(a*c-b*d);
        this.setImaginaryPart(a*d+b*c);
        return this;
    }

    /**
     * calculate the absolute value from object
     * @return double absolute
     * */
    public double abs(){
        double a = this.getRealPart();
        double b = this.getImaginaryPart();
        return Complex.absolute(a,b);
    }

    /**
     * getter & setter
     * */
    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    /**
     * overrides
     * */
    @Override
    public int hashCode() {
        double real = this.getRealPart();
        double imaginary = this.getImaginaryPart();
        return getHashComplex(real,imaginary);
    }
    /**
     * true if number a and number b are equal in real and imaginary part
     * @param obj Object
     * @return boolean
     * */
    @Override
    public boolean equals(Object obj) {
        Complex o = (Complex) obj;
        if(this.getRealPart() != o.getRealPart()){
            return false;
        }
        if(this.getImaginaryPart() != o.getImaginaryPart()){
            return false;
        }
        return true;
    }
    /**
     * implements Cloneabel
     * */
    @Override
    public Complex clone() {
        Complex clon = null;
        try {
            clon = (Complex)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clon;
    }
    /***/
    @Override
    public String toString() {
        return "Complex{" +
                "realPart=" + realPart +
                ", imaginaryPart=" + imaginaryPart +
                '}';
    }
}
