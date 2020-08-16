package secao15.exercicio01.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import secao15.exercicio01.model.entities.Reservation;
import secao15.exercicio01.model.exception.DomainException;

public class Program {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Reservation r1 = new Reservation(8021, sdf.parse("23/09/2021"), sdf.parse("26/09/2021"));
            System.out.println(r1);
            
            //r1.updateDates(sdf.parse("29/09/2021"), sdf.parse("24/09/2021"));
            //->Error in reservation: Check-out date must be after check-in date

            //r1.updateDates(sdf.parse("29/09/2019"), sdf.parse("29/09/2019"));
            //->Error in reservation: Reservation dates for update must be future dates

            r1.updateDates(sdf.parse("24/09/2021"), sdf.parse("29/09/2021"));
            System.out.println(r1);

        }
        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected Error");
        }

    }
}