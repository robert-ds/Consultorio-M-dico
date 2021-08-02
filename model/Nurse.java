package model;

public class Nurse extends User{
  
  private String speciality;

  //Constructor
  public Nurse(String name, String email){
    super(name, email);
  }

  //Implementando el Metodo Abstracto de la Clase User
  @Override
  public void showDataUser(){
    System.out.println("Empleado del Hospital: Cruz Verde");
    System.out.println("Departamentos: Nutriología, Cardilogía, Pediatría");
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