public class TicketOffice {

    private String Station;
    private String Arrival;
    private String Departure;
    private String FSeats;
    private String Seats;
    private String Days;
    private String Number;

    public TicketOffice(String Station, String Arrival, String Departure, String FSeats, String Seats,
                     String Days, String Number){

        this.Station = Station;
        this.Arrival = Arrival;
        this.Departure = Departure;
        this.FSeats = FSeats;
        this.Seats = Seats;
        this.Days = Days;
        this.Number = Number;
    }

    @Override

    public String toString() {
        return "Station: " + Station + "\n" +
                "Arrival: " + Arrival + "\n" +
                "Time of Departure: " + Departure + "\n" +
                "Free seats: " + FSeats + "\n" +
                "All Seats: " + Seats + "\n" + "Days: " + Days + "\n" +
                "Unique Number: " + Number;
    }
}
