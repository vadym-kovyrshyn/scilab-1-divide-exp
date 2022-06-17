import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class SciLab {
    private static final int SCALE = 181;

    public static void main(String[] args) {
        BigDecimal result = BigDecimal.valueOf(0.0);
        BigInteger a = BigInteger.valueOf(-1);
        BigDecimal fact = BigDecimal.valueOf(1);
        for (long i = 0; i <= 110; i++) {
            a = a.multiply(BigInteger.valueOf(-1));
            if (i > 1) {
                fact = fact.multiply(BigDecimal.valueOf(i));
            }
            result = result.add(new BigDecimal(a).divide(fact, SCALE, RoundingMode.UP));
        }
        System.out.println(result);
        BigDecimal e = new BigDecimal("2.71828182845904523536028747135266249775724709369995957496696762772407663035354759457138217852516642742746639193200305992181741359662904357290033429526059563073813232862794349076323382988075319525101901");
        System.out.println(BigDecimal.ONE.divide(e, SCALE, RoundingMode.UP));
    }
}
