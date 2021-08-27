package Datos;


public class DGastos {
    private String Id_Gastos;
    private String Paciente;
    private String Fecha;
    private String Item;
    private int Cant;
    
    public void SetId_Gastos(String Id_Gastos){
        this.Id_Gastos=Id_Gastos;
    }
    
    public String GetId_Gastos(){
        return this.Id_Gastos;
    }
    
    public void SetPaciente(String Paciente){
        this.Paciente=Paciente;
    }

    public String GetPaciente(){
        return this.Paciente;
    }

    public void SetFecha(String Fecha){
        this.Fecha=Fecha;
    }
	 
    public String GetFecha(){
        return this.Fecha;
    } 
    public void SetItem(String Item){
        this.Item=Item;
    }
	 
    public String GetItem(){
        return this.Item;
    } 
    public void SetCant(int Cant){
        this.Cant=Cant;
    }
	 
    public int GetCant(){
        return this.Cant;
    }  
}
