package Datos;


public class DOcupacion {
    private String Id_Ocupacion;
    private String Paciente;
    private String FechaOcup;
    private String FechaDesocup;
    private String Cama;
    
    public void SetId_Ocupacion(String Id_Ocupacion){
        this.Id_Ocupacion=Id_Ocupacion;
    }
    
    public String GetId_Ocupacion(){
        return this.Id_Ocupacion;
    }
    
    public void SetPaciente(String Paciente){
        this.Paciente=Paciente;
    }

    public String GetPaciente(){
        return this.Paciente;
    }

    public void SetFechaOcup(String FechaOcup){
        this.FechaOcup=FechaOcup;
    }
	 
    public String GetFechaOcup(){
        return this.FechaOcup;
    } 
    public void SetFechaDesocup(String FechaDesocup){
        this.FechaDesocup=FechaDesocup;
    }

    public String GetFechaDesocup(){
        return this.FechaDesocup;
    }

    public void SetCama(String Cama){
        this.Cama=Cama;
    }
	 
    public String GetCama(){
        return this.Cama;
}

}
