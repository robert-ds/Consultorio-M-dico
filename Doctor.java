public class Doctor{
  //Atributos
  static int id = 0;//Autoincrementado
  String name;
  String email;
  String speciality;

  //Método constructor
  Doctor(){
    System.out.println("Construyendo el Objeto Doctor");
  }
  
  //Sobrecarga del método constructor Doctor
  Doctor(String name, String speciality ){
    System.out.println("El nombre del médico asignado es: " + name);
    id++;
    this.name = name;
    this.speciality = speciality; 
  }

  //Comportamientos o Métodos
  public void showName(){
    System.out.println(name);
  }

  public void showId(){
    System.out.println("Id Doctor: " + id);
  }
  
}