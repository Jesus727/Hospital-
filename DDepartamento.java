package Datos;


public class DDepartamento {
    private String Id_Departamento;
    private String Descripcion;

    
    public void setId_Departamento(String Id_Departamento){
        this.Id_Departamento=Id_Departamento;
    }
    
    public String getId_Departamento(){
        return this.Id_Departamento;
    }
    
    public void setDescripcion(String Descripcion){
        this.Descripcion=Descripcion;
    }

    public String getDescripcion(){
        return this.Descripcion;
    }

}
