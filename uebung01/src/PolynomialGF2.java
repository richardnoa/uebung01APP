import java.util.Arrays;
public class PolynomialGF2 {

    private boolean[] polynomArray;
    final boolean[] ZERO = null;
    final boolean[] ONE = {true};


    /**
     * @return true if objekt is zero polynom
     * */
    public static boolean isZero(PolynomialGF2 x){
        if(x.equals(new PolynomialGF2("0")))
            return true;
        return false;
    }
    /**
     * @return true if objekt is one polynom
     * */
    public static boolean isONE(PolynomialGF2 x){
        if(x.equals(new PolynomialGF2()))
            return true;
        return false;
    }


    public PolynomialGF2(){
        polynomArray = ONE;
    }

    public PolynomialGF2(String koeffizienten){
        int length = String.valueOf(koeffizienten).length();
        int koeffizientenInt = Integer.parseInt(koeffizienten);
        polynomArray = new boolean[length];
        if(koeffizientenInt == 0)
            polynomArray = ZERO;
        else if (koeffizientenInt == 1)
            polynomArray = ONE;
        else{
            for(int k = 0; k < length; k++) {
                if (koeffizientenInt % 10 == 1)
                    polynomArray[k] = true;
                else
                    polynomArray[k] = false;
                koeffizientenInt = koeffizientenInt/10;
            }
        }
    }


    /**
     * @return polynom array
     * */
    public boolean[] toArray(){
        return this.polynomArray;
    }



    @Override
    public String toString(){
        String outputSting = "";
        for(int i = polynomArray.length-1; i >= 0; i++){
            if (polynomArray[i] == true){
                outputSting += "x^" + i ;
            }
        }
        return Arrays.toString(polynomArray);
    }

}
