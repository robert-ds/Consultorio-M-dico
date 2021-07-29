import static ui.UIMenu.*;
import java.util.Date;

public class Main{

  public static void main(String[] args){
    //showMenu();

    Doctor myDoctor = new Doctor("Juana Perez", "Pediatría");
    myDoctor.addAvailableAppointment(new Date(), "4:00 pm");
    myDoctor.addAvailableAppointment(new Date(), "10:00 am");
    myDoctor.addAvailableAppointment(new Date(), "1:00 pm");

    System.out.println(myDoctor.getAvailableAppointments());

    for(Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()){

      System.out.println(aA.getDate() + " " + aA.getTime());

    }

   /*  Patient patient = new Patient("Alejandra", "ale@gmail.om");

    patient.setWeight(55);
    System.out.println(patient.getWeight());

    patient.setPhoneNumber("87654321");
    System.out.println(patient.getPhoneNumber()); */


  }
  
}