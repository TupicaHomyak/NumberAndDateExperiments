import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        System.out.println(
                MoneyCalculator.calculateCassetteCount(1999)
        );
        System.out.println(
                MoneyCalculator.calculateCassetteCount(2000)
        );
        System.out.println(
                MoneyCalculator.calculateCassetteCount(2001)
        );
        System.out.println(getPeriodFromJavaBirthday());

    }
    public static String getPeriodFromJavaBirthday() {
        LocalDate birthday = LocalDate.of(1995, 5, 23);
        Period period = birthday.until(LocalDate.now());
        return period.getYears() + " years, " +
                period.getMonths() + " months, " +
                period.getDays() + " days";

    }
}