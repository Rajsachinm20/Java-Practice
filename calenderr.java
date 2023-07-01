import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
public class calenderr {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.getCalendarType());

        LocalDateTime dt =LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy --E");


        String myDate=dt.format(df);
        System.out.println(myDate);

    }
}
