public class TicketOffice {
    public boolean station(String station) {
        String idPattern = "[a-zA-Z]+";
        if (station.matches(idPattern))
            return true;
        return false;
    }

    public boolean arrival(String arrival) {
        String typePattern = "\\d{2}\\.\\d{2}";
        if (arrival.matches(typePattern))
            return true;
        return false;

    }

    public boolean departure(String dep) {
        String typePattern = "\\d{2}\\.\\d{2}";
        if (dep.matches(typePattern)) {
            return true;
        }
        return false;
    }

    public boolean fseats(String character) {
        String reasonPattern = "\\d";
        if (character.matches(reasonPattern))
            return true;
        return false;
    }

    public boolean trainNb(String salary) {
        String reasonPattern = "[A-Z\\d]{5}";
        if (salary.matches(reasonPattern))
            return true;
        return false;
    }

    public boolean day(String day) {
        String idPattern = "[a-zA-Z]+";
        if (day.matches(idPattern))
            return true;
        return false;
    }
}
