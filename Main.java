import static ui.UIMenu.*;

public class Main{

  public static void main(String[] args){
    //showMenu();

    Doctor myDoctor = new Doctor("Juana Perez", "Pediatría");
    System.out.println(myDoctor.name);
    System.out.println(myDoctor.speciality);

    Patient patient = new Patient("Alejandra", "ale@gmail.om");


  }
  
}