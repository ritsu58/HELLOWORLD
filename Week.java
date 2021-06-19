import java.time.*;

public class Week {
    public static void main(String[] args) {
		LocalDateTime time = LocalDateTime.now();
		time = time.plusYears(3);
		DayOfWeek week = DayOfWeek.from(time);
		System.out.println(week);
	}
}
