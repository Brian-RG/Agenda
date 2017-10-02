/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import javax.swing.*;

public class Principal {
    static String[] opciones={"Agregar contacto","Buscar contacto","Borrar contacto","Salir"};
    static int opcion;
    private static void imprimeMenu(){
        opcion=JOptionPane.showOptionDialog(null,"Elige una opción:","Bienvenido!",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[0]);
    }
    
    private static Contacto pideContacto(){
        
        String[] datos= {"Nombre:","Apellido:","Categoría:","Correo:","Teléfono:","Celular:","Dirección:","Nota:"};
        for(int i=0;i<datos.length;i++){
            datos[i]=JOptionPane.showInputDialog(null,"Ingresa el "+datos[i]);
            
        }
        Contacto c= new Contacto(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6],datos[7]);
        return c;
    }
    
    public static void main(String[] Args){
        Agenda a=new Agenda();
        boolean k=true;
        do{
            imprimeMenu();
            switch(opcion){
                case -1:
                    k=false;
                    break;
                case 0:
                    a.agregarContacto(pideContacto());
                    JOptionPane.showMessageDialog(null,"Contacto agregado satisfactoriamente");
                    break;
                case 1:
                    String d=JOptionPane.showInputDialog(null,"Ingresa dato a buscar: ");
                    a.buscarContacto(d);
                    break;
                case 2:
                    a.buscarContacto("");
                    try{
                    int o=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el numero del contacto a borrar"));
                    }
                    catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Error, dato mal ingresado","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 3:
                    k=false;
                    break;
                   
            }
        }        
        while(k==true);
    }
}
