import java.util.ArrayList;
import java.util.Date;

public class Doctor{
  //Atributos
  static int id = 0;//Autoincrementado
  private String name;
  private String email;
  private String speciality;

  //Método constructor
  Doctor(){
    System.out.println("Construyendo el Objeto Doctor");
  }
  
  //Sobrecarga del método constructor Doctor
  Doctor(String name, String speciality ){
    System.out.println("El nombre del médico asignado es: " + name);
    id++;
    this.name = name;
    this.speciality = speciality; 
  }
  
  //Comportamientos o Métodos
  public void showName(){
    System.out.println(name);
  }

  public void showId(){
    System.out.println("Id Doctor: " + id);
  }

  //Getters and Setters
  //Id
  //Set
  public void setId(int id){
    this.id = id;
  }

  //Get
  public int getId(){
    return this.id;
  }

  //name
  //Set
  public void setName(String name){
    this.name = name;
  }

  //Get
  public String getName(){
    return this.name;
  }

  //Email
  //Set
  public void setEmail(String email){
    this.email = email;
  }

  //Get
  public String getEmail(){
    return this.email;
  }

  //Speciality
  //Set
  public void setSpeciality(String speciality){
    this.speciality = speciality;
  }

  //Get
  public String getSpeciality(){
    return this.speciality;
  }

  ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
  public void addAvailableAppointment(Date date, String time){
     availableAppointments.add(new Doctor.AvailableAppointment(date, time));
  }

  public ArrayList<AvailableAppointment> getAvailableAppointments(){
    return availableAppointments;
  }

  //Clase interna para gestionar las citas
  public static class AvailableAppointment{
    
    //AvaibleAppointment
    private int id;
    private Date date;
    private String time;

    //constructor
    public AvailableAppointment(Date date, String time){
      this.date = date;
      this.time = time;
    }

    //Getters and Setters
    //Id
    //Set
    public void setId(int id){
      this.id = id;
    }

    //Get
    public int getId(){
      return this.id;
    }

    //Date
    //Set
    public void setDate(){
      this.date = date;
    }

    //Get
    public Date getDate(){
      return this.date;
    }

    //Time
    //Set
    public void setTime(){
      this.time = time;
    }

    //Get
    public String getTime(){
      return this.time;
    }

  }

}