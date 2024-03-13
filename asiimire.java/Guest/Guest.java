package Guest;

public class Guest {
    public static String guestId;
    public static String guestname;
    public static int days;
    Guest(String guestId , String guestname ,Double days2){
        this.guestId=guestId;
        this.guestname=guestname;
        this.days=days2;
    }
    public Guest(String guestId2, String guestname2, Double days2) {
        //TODO Auto-generated constructor stub
    }
    public void printDetails(){
        System.out.println("the guest name is: " +this.guestId);
        System.out.println("the guest name is: " +this.guestname);
       System.out.println("the number of days worked are: "+this.days);
    }
}
