package com.xiaozhi.test.Time;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.logging.SimpleFormatter;

/**
 * Created by 小智 on 2017/10/29 0029.
 */
public class Time {
    public static void main(String[] args) {
//        final Clock clock = Clock.systemUTC();
//        System.out.println(clock.instant());
//        System.out.println(clock.millis());
//        System.out.println(clock.getZone());
//
//        final LocalDate date = LocalDate.now();
//        final LocalDate dateFromClock = LocalDate.now(clock);
//
//        System.out.println(date);
//        System.out.println(dateFromClock);
//
//// Get the local date and local time
//        final LocalTime time = LocalTime.now();
//        final LocalTime timeFromClock = LocalTime.now(clock);
//
//        System.out.println(time);
//        System.out.println(timeFromClock);
//
//
//        // Get the zoned date/time
//        final ZonedDateTime zonedDatetime = ZonedDateTime.now();
//        final ZonedDateTime zonedDatetimeFromClock = ZonedDateTime.now(clock);
//        final ZonedDateTime zonedDatetimeFromZone = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
//
//        System.out.println(zonedDatetime);
//        System.out.println(zonedDatetimeFromClock);
//        System.out.println(zonedDatetimeFromZone);
//
//
//        // Get duration between two dates
//        final LocalDateTime from = LocalDateTime.of(2014, Month.APRIL, 16, 0, 0, 0);
//        final LocalDateTime to = LocalDateTime.of(2015, Month.APRIL, 16, 23, 59, 59);
//
//        final Duration duration = Duration.between(from, to);
//        System.out.println("Duration in days: " + duration.toDays());
//        System.out.println("Duration in hours: " + duration.toHours());  .format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))

        String a =
                new SimpleDateFormat("yyyy-MM-dd").format(new Date(1510815338L));
        System.out.println(a);
    }
}
