import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm");
        LocalDateTime currentDateTime = LocalDateTime.now();
        String formattedDate = currentDateTime.format(fmt);
        String timeZone = "GMT";

        System.out.println("Today is: " + formattedDate + " " + timeZone);

    }
}
