public class Passanger {
    private String firstname;
    private String lastname;
    private int ID;
    private Ticket ticket;
    public Passanger(int ID,String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        this.ID = ID;
        ticket = null;
    }
    public int getID(){
        return  ID;
    }
    public  String getFirstname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setTicket(Ticket ticket){
        this.ticket = ticket;
    }
    public Ticket getTicket(){
        return ticket;
    }

}