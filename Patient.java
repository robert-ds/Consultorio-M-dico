public class Patient{
  //Atributos
  int id;
  private String name;
  private String email;
  private String address;
  private String phoneNumber;
  private String birthday;
  private double weight;
  private double height;
  private String blood;

  Patient(String name, String email){
    this.name = name;
    this.email = email;
    this.weight = 54.6;
  }

  //Getter and Setters

  //Id
  //set
  public void setId(int id){
    this.id = id;
  }

  //get
  public int getId(){
    return this.id;
  }

  //Email
  //set
  public void setEmail(String email){
    this.email = email;
  }

  //get
  public String getEmail(){
    return this.email;
  }

  //Address
  //set
  public void setAddress(String address){
    this.address = address;
  }

  //get
  public String getEmail(){
    return this.email;
  }

  //PhoneNumber
  //set
  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }

  //get
  public String getPhoneNumber(){
    return this.phoneNumber;
  }

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
  public double getHeight(){
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

}