package Datos;


public class DEspecialidad {
    private String Id_Especialidad;
    private String Descripcion;

    
    public void setId_Especialidad(String Id_Especialidad){
        this.Id_Especialidad=Id_Especialidad;
    }
    
    public String getId_Especialidad(){
        return this.Id_Especialidad;
    }
    
    public void setDescripcion(String Descripcion){
        this.Descripcion=Descripcion;
    }

    public String getDescripcion(){
        return this.Descripcion;
    }
}
