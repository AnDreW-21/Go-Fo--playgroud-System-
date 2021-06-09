package all_system;

public class player {
    private String name;
    private String address;
    private String phone;
    private String passWord;
    private boolean inATeam;
    static private int id;
    private int balance;
    Booking []Booking;

    public player(){
        this.name = " ";
        this.address = " ";
        this.phone = " ";
        this.passWord = " ";
        this.balance=0;
        this.inATeam = false;
        id+=1;
    }
    public player(String name, String address, String phone, String passWord,int balance) {
        this.name = name;
        this.address = address;
        this.inATeam = false;
        this.phone = phone;
        this.passWord = passWord;
        this.balance=balance;
        id+=1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println("Name: "+this.name +" phone: "+this.phone);
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean getInATeam(){ return this.inATeam;}
    public void setInATeam(boolean val){  this.inATeam = val;}
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassWord() {
        return passWord;
    }
    void addMoney(int balance){
        this.balance+=balance;
    }
    void Pay(int pay){
        balance-=pay;
    }
}
