import java.util.ArrayList;

public class System {
    ArrayList<Flight> flight = new ArrayList<Flight>();
    public void addfilght(Flight flight){
        this.flight.add(flight);
    }
    public void removeflight(Flight flight){
        this.flight.remove(flight);
    }
}
