import java.time.LocalDate;
import java.time.Period;

public class AgeCalc {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(2005, 5, 1);
        LocalDate now = LocalDate.now();
        Period age = Period.between(dob, now);
        System.out.println("Age: " + age.getYears() + " years");
    }
}