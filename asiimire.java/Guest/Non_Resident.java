package Guest;

class Non_Resident extends Guest{
    public int entrancefee;
     public Non_Resident(String guestId, String guestname, int entrancefee){
         super(guestId, guestname, );
         this.entrancefee=entrancefee;
     }
     public void printDetails(){
         super.printDetails();
         System.out.println("the entrance fee is:"+this.entrancefee);
     }
}
    

