package model;

import model.Doctor;

import java.util.*;

public class Patient extends User{
  //Atributos
  private String birthday;
  private double weight;
  private double height;
  private String blood;

  private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
  private ArrayList<AppointmentNurse> appointmentNurses =
  new ArrayList<>();

  //Getters y Setters
  //AppointmentDoctor
  //Set
  public void addAppointmentDoctors(Doctor doctor, Date date, String time){
    AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
    appointmentDoctor.schedule(date,time);
    appointmentDoctors.add(appointmentDoctor);
  }

  //Get
  public ArrayList<AppointmentDoctor> getAppointmentDoctors(){
    return appointmentDoctors;
  }

  //AppointmentNurse
  //Set
  public void setAppointmentNurse(ArrayList<AppointmentNurse> appointmentNurses){
    this.appointmentNurses 0 appointmentNurses;
  }

  public Patient(String name, String email){
    super(name, email);
  }

  //Implementando el Método Abstracto de la Clase user
  @Override
  public void showDataUser(){
    System.out.println("Paciente");
    System.out.println("Historial Completo Desde el Nacimiento");
  }

  //Getter and Setters
  //Birhtday
  //set
  public void setBirthday(String birthday){
    this.birthday = birthday;
  }

  //get
  public String getBirthDay(){
    return this.birthday;
  }

  //Weight
  //set
  public void setWeight(double weight){
    this.weight = weight;
  }

  //get
  public String getWeight(){
    return this.weight + " kg";
  }

  //Height
  //set
  public void setHeight(double height){
    this.height = height;
  }

  //get
  public String getHeight(){
    return this.height + "metros";
  }

  //Blood
  //set
  public void setBlood(String blood){
    this.blood = blood;
  }

  //get
  public String getBlood(){
    return this.blood;
  }

  //Sobreescribiendo el Método toString
  @Override
  public String toString(){
    return super.toString() + "\nAge: "+birthday+ "\nWeight: " +getWeight()+ "\nHeight: "+getHeight()+ "\nBlood: "+ blood;
  }

}