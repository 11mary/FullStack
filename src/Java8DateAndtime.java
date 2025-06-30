import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class Java8DateAndtime {
    public static void main(String[] args) {
      //  LocalDate d=LocalDate.now();
      //  LocalDate d=LocalDate.of(2025,10,17);
       // System.out.println(d);
      //  LocalTime t=LocalTime.now();
      //  System.out.println(t);
       LocalTime t=LocalTime.now(ZoneId.of("Asia/Seoul"));
       System.out.println(t);
        for(String i:ZoneId.getAvailableZoneIds())
        {
            System.out.println(i);
        }


    }
}
