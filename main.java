public class main {

    public static void main(String[] args) {


        Fraction fract1= new Fraction(5,0);
        assert fract1.getDenominator()!=0: "Error ,La valeur du donominator = 0 : ";

        System.out.println(fract1.toString());
        System.out.println("All tests passed!");
    }
}