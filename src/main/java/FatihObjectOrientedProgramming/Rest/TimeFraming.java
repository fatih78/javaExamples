package FatihObjectOrientedProgramming.Rest;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;

import java.util.logging.Logger;


public class TimeFraming {
    private static final Logger LOGGER = Logger.getLogger(TimeFraming.class.getName());


    public boolean officeHours() {;
        if (isOfficeHours(LocalDateTime.now(ZoneId.of("Europe/Amsterdam")))) {
            LOGGER.info("TestCase is within Office Hours!");
            return true;
        } else {
            LOGGER.info("TestCase is NOT within Office Hours!");
            return false;
        }
    }

    private boolean isOfficeHours(LocalDateTime date) {
        return date.getDayOfWeek() != DayOfWeek.SATURDAY &&
                date.getDayOfWeek() != DayOfWeek.SUNDAY &&
                date.getHour() >= 9 &&
                date.getHour() <= 17;
    }

}
