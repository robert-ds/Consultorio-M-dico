public class Patient extends User{
  //Atributos
  private String birthday;
  private double weight;
  private double height;
  private String blood;

  Patient(String name, String email){
    super(name, email);
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