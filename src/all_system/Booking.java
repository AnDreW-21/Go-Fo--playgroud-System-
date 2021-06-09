package all_system;

public class Booking {
    public Playground playground;
    public String slot;
    public player Player ;
    Booking(Playground playground,String slot, player p){
        this.playground=playground;
        this.slot = slot;
        this.Player = p;
    }
}
