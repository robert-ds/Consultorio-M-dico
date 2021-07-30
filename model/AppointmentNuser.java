package model;

import java.util.Date;

public class AppointmentNuser implements ISchedulable{

  private int id;
  private Patient patient;
  private Nurse nurse;
  private Date date;
  private String time;

  //Getters y Setters
  //Id
  //Set
  public void setId(int id){
    this.id = id;
  }

  //Get
  public int getId(){
    return this.id;
  }

  //Patient
  //Set
  public void setPatient(Patient patient){
    this.patient = patient;
  }

  //Get
  public Patient getPatient(){
    return this.patient;
  }

  //Nurse
  //Set
  public void setNurse(Nurse nurse){
    this.nurse = nurse;
  }

  //Get
  public Nurse getNurse(){
    return this.nurse;
  }

  //Date
  //Set
  public void setDate(Date date){
    this.date = date;
  }

  //Get
  public Date getDate(){
    return this.date;
  }

  //Time
  //Set
  public void setTime(String time){
    this.time = time;
  }

  //Get
  public String getTime(){
    return this.time;
  }

  //Implementado Metodo de la interfaz ISchedulable
  @Override
  public void schedule(Date date, String time){

  }
}