class TicketBookingTester{
	public static void main(String[] args) {
		TicketBooking t1= new TicketBooking();
		TicketBooking t2= new TicketBooking();
		TicketBooking t3= new TicketBooking();
		
		t1.setBookingId(1);
		t1.setnoOfSeats(2);
		t1.setsource("Bangalore");
		t1.setdestination("mysore");
		t1.setdate("August 1");
		t1.settimings("09am");
		t1.setpnr(123);
		t1.setprice(690.0);
		t1.setseatClass("AC");
		t1.setbookingType("online");
		t1.settransportName("Bus");

		t2.setBookingId(2);
		t2.setnoOfSeats(4);
		t2.setsource("Mysore");
		t2.setdestination("Bangalore");
		t2.setdate("August 2");
		t2.settimings("09am");
		t2.setpnr(124);
		t2.setprice(690.0);
		t2.setseatClass("AC");
		t2.setbookingType("online");
		t2.settransportName("Train");

		t3.setBookingId(3);
		t3.setnoOfSeats(6);
		t3.setsource("Tumkur");
		t3.setdestination("Bangalore");
		t3.setdate("August 10");
		t3.settimings("09am");
		t3.setpnr(126);
		t3.setprice(560.0);
		t3.setseatClass("AC");
		t3.setbookingType("online");
		t3.settransportName("Flight");	

		System.out.println(t1.getBookingId());
		System.out.println(t1.getnoOfSeats());
		System.out.println(t1.getsource());
		System.out.println(t1.getdestination());
		System.out.println(t1.getdate());
		System.out.println(t1.gettimings());
		System.out.println(t1.getpnr());
		System.out.println(t1.getprice());
		System.out.println(t1.getseatClass());
		System.out.println(t1.getbookingType());
		System.out.println(t1.gettransportName());
        System.out.println();
		
        System.out.println(t2.getBookingId());
		System.out.println(t2.getnoOfSeats());
		System.out.println(t2.getsource());
		System.out.println(t2.getdestination());
		System.out.println(t2.getdate());
		System.out.println(t2.gettimings());
		System.out.println(t2.getpnr());
		System.out.println(t2.getprice());
		System.out.println(t2.getseatClass());
		System.out.println(t2.getbookingType());
		System.out.println(t2.gettransportName());
		System.out.println();

        System.out.println(t3.getBookingId());
		System.out.println(t3.getnoOfSeats());
		System.out.println(t3.getsource());
		System.out.println(t3.getdestination());
		System.out.println(t3.getdate());
		System.out.println(t3.gettimings());
		System.out.println(t3.getpnr());
		System.out.println(t3.getprice());
		System.out.println(t3.getseatClass());
		System.out.println(t3.getbookingType());
		System.out.println(t3.gettransportName());
	}
}