package ui;

import ui.UIMenu.*;
import java.util.Scanner;


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


    }while(response != 0);
  }
}