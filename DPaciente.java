package Datos;


public class DPaciente {
    private String Id_Paciente;
    private String Nombre;
    private String Direccion;
    private int Fono;
    private String Isapre;
    private String Fecha_Ing;
    private String Fecha_Alta;
    private String Cama;
    private String Alta;
    
    public void SetId_Paciente(String Id_Paciente){
        this.Id_Paciente=Id_Paciente;
    }
    
    public String GetId_Paciente(){
        return this.Id_Paciente;
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
    public void SetIsapre(String Isapre){
        this.Isapre=Isapre;
    }
    
    public String GetIsapre(){
        return this.Isapre;
    }
    
    public void SetFecha_Ing(String Fecha_Ing){
        this.Fecha_Ing=Fecha_Ing;
    }

    public String GetFecha_Ing(){
        return this.Fecha_Ing;
    }

    public void SetFecha_Alta(String Fecha_Alta){
        this.Fecha_Alta=Fecha_Alta;
    }
	 
    public String GetFecha_Alta(){
        return this.Fecha_Alta;
    }
    public void SetCama(String Cama){
        this.Cama=Cama;
    }
	 
    public String GetCama(){
        return this.Cama;
    }
    public void SetAlta(String Alta){
        this.Alta=Alta;
    }
	 
    public String GetAlta(){
        return this.Alta;
    } 
}
