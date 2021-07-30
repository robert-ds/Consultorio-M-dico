package model;

public class Nuser extends User{
  
  private String speciality;

  //Constructor
  public Nurse(String name, String email){
    super(name, email);
  }

  //Getters y Setters
  //Speciality
  //Set
  public void setSpeciality(String speciality){
    this.speciality = speciality;
  }

  //Get
  public String getSpeciality(){
    return this.speciality;
  }

}