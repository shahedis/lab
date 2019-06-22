public class Seat {
    private int  number;
    private String type;
    private Passanger user;
    private Boolean status =false;

    public Seat(int number,String type,Passanger user){
        this.user = user;
        this.number = number;
        this.type = type;
    }
    public void seatreserve(){
        status = true;

    }
    public int getNumber(){
        return number;
    }
    public String getType(){
        return type;
    }
    public Passanger getUser(){
        return user;
    }
    public void setUser(Passanger user){
        this.user = user;
    }

}



