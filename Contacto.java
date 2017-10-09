//Juan Carlos Quirino Carrasco - A01632369
//Brian Reyes Gálvez - A01633401
//Programacion orientada a objetos
//Proyecto Parcial
public class Contacto {
    private String nombre, apellidos, categoria, correo, telefono, celular, direccion, nota;

    public Contacto(String nom, String ape, String cat, String cor, String tel, String cel, String dir, String nota){
        this.nombre=nom;
        this.apellidos=ape;
        this.categoria=cat;
        this.correo=cor;
        this.telefono=tel;
        this.celular=cel;
        this.direccion=dir;
        this.nota=nota;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellidos;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public String getCorreo(){
        return this.correo;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public String getCelular(){
        return this.celular;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getNota(){
        return this.nota;
    }

    public String toString(){
        String r="";
        for(int i=0; i<8;i++){
            switch(i){
                case 0:
                    if(!this.nombre.equals("")){
                        r+="nombre: "+this.nombre+"\n";
                    }
                    break;
                case 1:
                    if(!this.apellidos.equals("")){
                        r+="apellidos: "+this.apellidos+"\n";
                    }
                    break;
                case 2:
                    if(!this.categoria.equals("")){
                        r+="categoría: "+this.categoria+"\n";
                    }
                    break;
                case 3:
                    if(!this.correo.equals("")){
                        r+="correo: "+this.correo+"\n";
                    }
                    break;
                case 4:
                    if(!this.telefono.equals("")){
                        r+="telefono: "+this.telefono+"\n";
                    }
                    break;
                case 5:
                    if(!this.celular.equals("")){
                        r+="celular: "+this.celular+"\n";
                    }
                    break;
                case 6:
                    if(!this.direccion.equals("")){
                        r+="Direccion: "+this.direccion+"\n";
                    }
                    break;
                case 7:
                    if(!this.nota.equals("")){
                        r+="Nota: "+this.nota+"\n";
                    }
                    break;


            }
        }

        return r;
    }

    public boolean contiene(String x){
        for(int i=0; i<8;i++){
            switch(i){
                case 0:
                    if(this.nombre.toLowerCase().contains(x.toLowerCase())){
                       return true;
                    }
                    break;
                case 1:
                    if(this.apellidos.toLowerCase().contains(x.toLowerCase())){
                       return true;
                    }
                    break;
                case 2:
                    if(this.categoria.toLowerCase().contains(x.toLowerCase())){
                        return true;
                    }
                    break;
                case 3:
                    if(this.correo.toLowerCase().contains(x.toLowerCase())){
                        return true;
                    }
                    break;
                case 4:
                    if(this.telefono.toLowerCase().contains(x.toLowerCase())){
                        return true;
                    }
                    break;
                case 5:
                    if(this.celular.toLowerCase().contains(x.toLowerCase())){
                        return true;
                    }
                    break;
                case 6:
                    if(this.direccion.toLowerCase().contains(x.toLowerCase())){
                        return true;
                    }
                    break;
                case 7:
                    if(this.nota.toLowerCase().contains(x.toLowerCase())){
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    }

}
