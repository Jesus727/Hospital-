package Datos;


public class DFuncionario {
    private String Id_Funcionario;
    private String Nombre;
    private String Direccion;
    private int Fono;
    private String Especialidad;
    private String Departamento;
    
    public void SetId_Funcionario(String Id_Funcionario){
        this.Id_Funcionario=Id_Funcionario;
    }
    
    public String GetId_Funcionario(){
        return this.Id_Funcionario;
    }
    
    public void SetNombre(String Nombre){
        this.Nombre=Nombre;
    }

    public String GetNombre(){
        return this.Nombre;
    }

    public void SetDireccion(String Direccion){
        this.Direccion=Direccion;
    }
	 
    public String GetDireccion(){
        return this.Direccion;
    } 
    public void SetFono(int Fono){
        this.Fono=Fono;
    }
	 
    public int GetFono(){
        return this.Fono;
    }  
    public void SetEspecialidad(String Especialidad){
        this.Especialidad=Especialidad;
    }

    public String GetEspecialidad(){
        return this.Especialidad;
    }

    public void SetDepartamento(String Departamento){
        this.Departamento=Departamento;
    }
	 
    public String GetDepartamento(){
        return this.Departamento;
    } 
}
