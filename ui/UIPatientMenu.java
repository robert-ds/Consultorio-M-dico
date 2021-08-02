package ui;

import ui.UIMenu.*;
import ui.UIDoctorMenu.*;
import model.Doctor;

import java.util.*;


public class UIPatientMenu{

  public static void showPatientMenu(){
    int response = 0;

    do{
      System.out.println("\n");
      System.out.println("Patient");
      System.out.println("Welcome: " + UIMenu.patientLogget);
      System.out.println("1. Book an appointment");
      System.out.println("1. My Appointments");
      System.out.println("0. logout");

      Scanner sc = new Scanner();
      response = Integer.valueOf(sc.nextLine());

      switch(response){
        
        case 1:
          break;

        case 2:
          break;

        case 0:
        UIMenu.showMenu();
          break;
      }

    }while(response != 0)
  }

  private static void showBookAppointmentMenu(){
    int response = 0;

    do{
      System.out.println(":: Book an Appointment");
      System.out.println(":: Select date: ");

      //Numeración de la lista de fechas
      //indice de la fecha que selecionada
      Map<Integer, Map<Integer, Doctor>> doctor = new TreeMap<>();

      int k = 0;

      for(int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++){
        ArrayList<Doctor.AvaibleAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

        Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

        for(int j = 0; j < availableAppointments.size(); j++){
          k++;
          System.out.println(k + ". " + availableAppointments.get(j).getDate());
          doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
          doctors.put(Integer.valueOf(k, doctorAppointments));
        }
      }

      Scanner sc = new Scanner(),
      int responseDateSelectec = Integer.valueOf(sc.nextLine());


    }while(response != 0);
  }
}