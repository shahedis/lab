import java.util.ArrayList;

public class Airplane {
    private String type;
    private Seat [] seats;
    public Airplane(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void reserve(int number){
        for (Seat seat : seats){
            if(seat.getNumber()==number)
                seat.seatreserve();
        }
    }
    public Seat[] getSeat(){
        return seats;
    }




}
