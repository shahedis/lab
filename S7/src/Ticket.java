public class Ticket {
    private double price;
    private double weight;
    private Boolean food;
    private Flight flight;

    public Ticket(double price,double weight,Flight flight,boolean food){
        this.flight = flight;
        this.food = food;
        this.price = price;
        this.weight = weight;
    }
    public double getPrice(){
        return price;
    }
    public double getWeight(){
        return weight;
    }
    public void setFood(){
        food = true;
    }
    public boolean getFood(){
        return food;
    }
    public Flight getFlight(){
        return flight;
    }



}
