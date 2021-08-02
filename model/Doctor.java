package model;

import java.util.ArrayList;
import java.util.Date;
import java.time.*;
import java.text.SimpleDateFormat; 
import java.text.ParseException; 

public class Doctor extends User{
  
  //Atributos
  private String speciality;

  //Método constructor
  public Doctor(String name, String email){
    super(name,email);
  }
  
  //Sobrecarga del método constructor Doctor
  public Doctor(String name, String email, String speciality ){
    super(name,email); 
  }
  
  //Comportamientos o Métodos
  //collección
  ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
  public void addAvailableAppointment(String date, String time){
     availableAppointments.add(new Doctor.AvailableAppointment(date, time));
  }

  public ArrayList<AvailableAppointment> getAvailableAppointments(){
    return availableAppointments;
  }

  //Getters and Setters
  //Speciality
  //Set
  public void setSpeciality(String speciality){
    this.speciality = speciality;
  }

  //Get
  public String getSpeciality(){
    return this.speciality;
  }

  //Sobrecarga del Método toString
  @Override
  public String toString(){
    return super.toString() + "\nSpeciality: " + speciality + "\nAvailable:" + availableAppointments;
  }

  //Implamentando el Método Abstracto de la clase User
  @Override
  public void showDataUser(){
    System.out.println("Empleado del Hospital: Cruz Roja");
    System.out.println("Departamento: Oncologia");
  }

  //Clase interna para gestionar las citas
  public static class AvailableAppointment{
    
    //AvaibleAppointment
    private int id;
    private Date date;
    private String time;
    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

    //constructor
    public AvailableAppointment(String date, String time){
      try{
        this.date = format.parse(date);
      }catch(ParseException e){
        e.printStackTrace();
      }
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
    
    public String getDate(String DATE){
      return format.format(date);
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

    //Sobrecarga del Método toString
    @Override
    public String toString(){
      return "Available Appoiments \nDate: "+date+"\nTime: "+ 
      time;
    }

  }

}