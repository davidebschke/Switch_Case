public class Main {

    public static void main(String[] args) {


    }

    public static String allAlerts(int actuallyPeople) {

        String normal ="Keine Regeln";
        String redNews = "Keine Person darf rein";
        String yellowNews = "Max. 30 Personen";
        String greenNews = "Max. 60 Personen";
        switch (actuallyPeople) {

            case 0:
                return redNews;

            case 30:
                return yellowNews;

            case 60:
                return greenNews;

        }


        return normal;
    }


}



