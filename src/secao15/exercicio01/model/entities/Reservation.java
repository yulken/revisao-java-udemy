package secao15.exercicio01.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import secao15.exercicio01.model.exception.DomainException;

public class Reservation {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Integer roomNumber;
    private Date checkin;
    private Date checkout;

    public Reservation(Integer roomNumber, Date checkin, Date checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return this.checkin;
    }

    public Date getCheckout() {
        return this.checkout;
    }


    public Integer duration(){
        long diff = (getCheckout().getTime() - getCheckin().getTime());
        return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkin, Date checkout){        
        if (checkout.before(checkin)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        if (checkout.before(new Date()) || checkin.before(new Date())){
            throw new DomainException("Reservation dates for update must be future dates");
        }
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reservation: Room " + getRoomNumber());
        sb.append(", check-in: " + sdf.format(getCheckin()));
        sb.append(", check-out: " + sdf.format(getCheckout()));
        sb.append(", " + duration() + " nights");

        return sb.toString();
    }
}