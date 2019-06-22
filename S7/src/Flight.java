public class Flight {

    private int ID;
    private Date date;
    private String destination;
    private String source;
    private Airplane plane;
    private String company;
    public Flight(int ID,Date date,String destination,String source,Airplane plane,String company){
        this.ID = ID;
        this.date=date;
        this.destination = destination;
        this.source = source;
        this.plane = plane;
        this.company = company;
    }
    public int getID(){
        return ID;
    }
    public String getDestination(){
        return destination;
    }
    public String getSource(){
        return source;
    }
    public Airplane getPlane(){
        return plane;
    }
    public String getCompany(){
        return company;
    }
    public Date getDate(){
        return date;
    }






}
