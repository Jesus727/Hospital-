package Datos;


public class DCama {
    
    private String Id_Cama;
    private String TipoCama;
    private String Estado;
    private int Pieza;
    
    public void SetId_Cama(String Id_Cama){
        this.Id_Cama=Id_Cama;
    }
    
    public String GetId_Cama(){
        return this.Id_Cama;
    }
    
    public void SetTipoCama(String TipoCama){
        this.TipoCama=TipoCama;
    }

    public String GetTipoCama(){
        return this.TipoCama;
    }

    public void SetEstado(String Estado){
        this.Estado=Estado;
    }
	 
    public String GetEstado(){
        return this.Estado;
    } 
    public void SetPieza(int Pieza){
        this.Pieza=Pieza;
    }
	 
    public int GetPieza(){
        return this.Pieza;
    } 
}
