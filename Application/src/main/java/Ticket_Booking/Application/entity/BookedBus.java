package Ticket_Booking.Application.entity;

public class BookedBus {
    String busName;
    int bookedNo;

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }

    public int getBookedNo() {
        return bookedNo;
    }

    public void setBookedNo(int bookedNo) {
        this.bookedNo = bookedNo;
    }
}
