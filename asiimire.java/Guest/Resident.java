package Guest;

class Resident extends Guest{
    public  double roomfeesperday;
    private final int municipalfeeperday=30;
    public Resident(String guestId, String guestname, double roomfeesperday) {
        super(guestId, guestname,  days);
        double roomfeesperday2 = roomfeesperday;
        this.roomfeesperday= roomfeesperday2 ;
    }
    public void printDetails(){
        super.printDetails();
       // int days;
        System.out.println("the room fee per day is: " +this.roomfeesperday);
        System.out.println("the total amount due is :"+(this.roomfeesperday+30*this.days));
    }
    
}
