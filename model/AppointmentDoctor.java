package model;

import model.Doctor;
import model.Patient;

import java.util.Date;

public class AppointmentDoctor implements ISchedulable{
  private int id;
  private Patient patient;
  private Doctor doctor;
  private Date date;
  private String time;

  public AppointmentDoctor(Patient patient, Doctor doctor){
    this.patient = patient;
    this.doctor = doctor;
  }

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

  //Doctor
  //Set
  public void setDoctor(Doctor doctor){
    this.doctor = doctor;
  }

  //Get
  public Doctor getDoctor(){
    return this.doctor;
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
  public void setTime(){
    public this.time = time;
  }

  //Get
  public String getTime(){
    return this.time + "horas";
  }

  //Implementado Metodo de la interfaz ISchedulable
  @Override
  public void schedule(Date date, String time){
    this.date = date;
    this.time = time;
  }
}