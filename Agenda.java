import java.util.*;
public class Agenda {
  private Contacto[] contactos;
  private int numContactos;

  public Agenda () {
    this(10);
  }
  public Agenda (int size) {
    this.contactos = new Contacto[size];
    this.numContactos = 0;
  }
  public void agregarContacto (Contacto newContacto) {
    //Al mismo array le hace una copia de si mismo y se la pasa con 1 mas de largo
    if (this.contactos.length == this.numContactos) {
      this.contactos = Arrays.copyOf(this.contactos, this.contactos.length + 1);
    }
    //Por default agrega el contacto al final si no es mas alfa que los demas
    int maxIndex = this.numContactos;
    //Recorre el arreglo de contactos de adelante hacia atras
    found:
    for (int i = 0; i < this.numContactos; i++){
      //Convierte el apellido a verificar en minusculas
      String actualLower = this.contactos[i].getApellido().toLowerCase().replaceAll(" ","");
      String nuevoLower = newContacto.getApellido().toLowerCase().replaceAll(" ","");
      //Se va a comparar nombres si apellidos son iguales
      if (actualLower.equals(nuevoLower)) {
        actualLower = this.contactos[i].getNombre().toLowerCase().replaceAll(" ","");
        nuevoLower = newContacto.getNombre().toLowerCase().replaceAll(" ","");
      }

      //Sirve para evitar un indexOutOfBounds recorriendo solo n veces
      //El numero de caracteres que tiene el string con menos
      int menor = actualLower.length() <= nuevoLower.length() ? actualLower.length() : nuevoLower.length();
      //No ocupo documentar esto, luego me acuerdo como funciona
      if (actualLower.substring(0,menor).equals(nuevoLower.substring(0,menor))) {
        maxIndex = actualLower.length() > nuevoLower.length() ? i : maxIndex;
        if (maxIndex == i) {break found;} else {continue;}
      }

      //Compara uno por uno cada caracter a la par del apellido
      for (int j = 0; j < menor; j++) {
        //Resta los chars para obtener una diferencia en numero
        //Si es positivo la resta de chars entonces se obtiene cual va primero
        if (actualLower.charAt(j) - nuevoLower.charAt(j) > 0) {
          maxIndex = i;
          break found;
        } else { if (actualLower.charAt(j) - nuevoLower.charAt(j) < 0) { break; } }
      }
    }
    //Recorrer e insertar
    Contacto tmp;
    for (int i = maxIndex; i < this.numContactos + 1; i++){
      tmp = this.contactos[i];
      this.contactos[i] = newContacto;
      newContacto = tmp;
    }
    this.numContactos++;
  }
  //
  public boolean removerContacto (int x) {
    if (x >= this.numContactos || x < 0 || this.numContactos == 0){
      return false;
    }
    if (this.contactos[x] == null) {
      return false;
    }

    for (int index = x; index < this.contactos.length - 1; index++){
      this.contactos[index] = this.contactos[index + 1];
    }
    this.contactos = Arrays.copyOf(this.contactos, this.contactos.length - 1);
    this.numContactos--;
    return true;
  }
  public void buscarContacto (String myString) {
    for (int i = 0; i < this.numContactos; i++) {
      if (myString.equals("")) {System.out.println(this.contactos[i]); }
      else {
        if (this.contactos[i].contiene(myString)) {
          System.out.println(this.contactos[i]);
        }
      }
    }
  }
  public static void main(String[] args){

  }
}
