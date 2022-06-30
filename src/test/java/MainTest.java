import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void alertRed() {


        //given

        int actuallyPeople = 0;

        //when

        String actual = Main.allAlerts(actuallyPeople);

        //then

        String expected = "Keine Person darf rein";
        Assertions.assertEquals(expected, actual);


    }

    @Test
    void alertYellow() {
        //given

        int actuallyPeople = 30;

        //when

        String actual = Main.allAlerts(actuallyPeople);

        //then

        String expected = "Max. 30 Personen";
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void alertGreen() {
        //given

        int actuallyPeople = 60;

        //when

        String actual = Main.allAlerts(actuallyPeople);

        //then

        String expected = "Max. 60 Personen";
        Assertions.assertEquals(expected, actual);


    }
}
