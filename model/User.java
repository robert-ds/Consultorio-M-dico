package model;

//Clase Padre con Atributos, para la clase Doctor y patient
public class User{

  static int id = 0;//Autoincrementado
  public String name;
  public String email;
  public String address;
  public String phoneNumber;

  public User(String name, String email){
    this.name = name;
    this.email = email;
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

  //Name
  //Set
  public void setName(){
    this.name = name;
  }

  //Get
  public String getName(){
    return this.name;
  }

  //Email
  //Set
  public void setEmail(){
    this.email = email;
  }

  //Get
  public String getEmail(){
    return this.email;
  }

  //Address
  //Set
  public void setAddress(){
    this.address = address;
  }

  //Get
  public String getAddress(){
    return this.address;
  }

  //PhoneNumber
  //Set
  public void setPhoneNumber(){
    if(phoneNumber.length() > 8){
      System.out.println("El Numero de Telefono no debe ser mayor a 8 digitos");
    }else if(phoneNumber.length() == 8){
      this.phoneNumber = phoneNumber;
    }
  }

  //Get
  public String getPhoneNumber(){
    return this.phoneNumber;
  }

  //Sobreescribiendo el metodo toString
  @Override
  public String toString(){
    return "User: " +name+ ", Email: "+email+ "\nAddress: " +address+ " Phone: "+phoneNumber;
  }



}