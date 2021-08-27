package Datos;


public class DTratamiento {
    private String Id_Tratamiento;
    private String Paciente;
    private String Medico;
    private String Fecha;
    private String Hora;
    private String Diagnostico;
    private String Tratamiento;

    
    public void SetId_Tratamiento(String Id_Tratamiento){
        this.Id_Tratamiento=Id_Tratamiento;
    }
    
    public String GetId_Tratamiento(){
        return this.Id_Tratamiento;
    }
    
    public void SetPaciente(String Paciente){
        this.Paciente=Paciente;
    }

    public String GetPaciente(){
        return this.Paciente;
    }

    public void SetMedico(String Medico){
        this.Medico=Medico;
    }
	 
    public String GetMedico(){
        return this.Medico;
    } 
        public void SetFecha(String Fecha){
        this.Fecha=Fecha;
    }
    
    public String GetFecha(){
        return this.Fecha;
    }
    
    public void SetHora(String Hora){
        this.Hora=Hora;
    }

    public String GetHora(){
        return this.Hora;
    }

    public void SetDiagnostico(String Diagnostico){
        this.Diagnostico=Diagnostico;
    }
	 
    public String GetDiagnostico(){
        return this.Diagnostico;
    } 
    
    public void SetTratamiento(String Tratamiento){
        this.Tratamiento=Tratamiento;
    }
	 
    public String GetTratamiento(){
        return this.Tratamiento;
    } 
}
