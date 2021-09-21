import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExamples {
    public static void main(String[] args) {
        String string = "100.58";
        System.out.println("String: " + string);

        BigDecimal valorBigDecimal = new BigDecimal(string);
        System.out.println("String -> BigDecimal: " + valorBigDecimal);

        System.out.println("-----------------------------------------");

        Double valorDouble = 59.9d;
        System.out.println("Double: " + valorDouble);

        BigDecimal valorBigDecimal2 = new BigDecimal(valorDouble);
        System.out.println("Double -> BigDecimal: " + valorBigDecimal2);

        
        System.out.println("BigDecimal(" + valorBigDecimal + ") subtract BigDecimal(" + valorBigDecimal2 + "): " + valorBigDecimal.subtract(valorBigDecimal2));
        System.out.println("BigDecimal(" + valorBigDecimal + ") add BigDecimal(" + valorBigDecimal2 + "): " + valorBigDecimal.add(valorBigDecimal2));
        System.out.println("BigDecimal(" + valorBigDecimal + ") divide BigDecimal(" + valorBigDecimal2 + ") RoundingMode.UP: " + valorBigDecimal.divide(valorBigDecimal2, RoundingMode.UP));
        System.out.println("BigDecimal(" + valorBigDecimal + ") divide BigDecimal(" + valorBigDecimal2 + ") RoundingMode.CEILING: " + valorBigDecimal.divide(valorBigDecimal2, RoundingMode.CEILING));
        System.out.println("BigDecimal(" + valorBigDecimal + ") divide BigDecimal(" + valorBigDecimal2 + ") RoundingMode.DOWN: " + valorBigDecimal.divide(valorBigDecimal2, RoundingMode.DOWN));
        System.out.println("BigDecimal(" + valorBigDecimal + ") divide BigDecimal(" + valorBigDecimal2 + ") RoundingMode.FLOOR: " + valorBigDecimal.divide(valorBigDecimal2, RoundingMode.FLOOR));
        System.out.println("BigDecimal(" + valorBigDecimal + ") divide BigDecimal(" + valorBigDecimal2 + ") RoundingMode.HALF_DOWN: " + valorBigDecimal.divide(valorBigDecimal2, RoundingMode.HALF_DOWN));
        System.out.println("BigDecimal(" + valorBigDecimal + ") divide BigDecimal(" + valorBigDecimal2 + ") RoundingMode.HALF_EVEN: " + valorBigDecimal.divide(valorBigDecimal2, RoundingMode.HALF_EVEN));
        System.out.println("BigDecimal(" + valorBigDecimal + ") divide BigDecimal(" + valorBigDecimal2 + ") RoundingMode.HALF_EVEN: " + valorBigDecimal.divide(valorBigDecimal2, RoundingMode.HALF_UP));
        System.out.println("BigDecimal(" + valorBigDecimal + ") multiply BigDecimal(" + valorBigDecimal2 + "): " + valorBigDecimal.multiply(valorBigDecimal2));
        System.out.println("BigDecimal(" + valorBigDecimal + ") pow BigDecimal(2): " + valorBigDecimal.pow(2));

        System.out.println("BigDecimal(" + valorBigDecimal + ") compareTo BigDecimal(" + valorBigDecimal2 + "): " + valorBigDecimal.compareTo(valorBigDecimal2));
    }
}
