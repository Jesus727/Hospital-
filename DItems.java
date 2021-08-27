package Datos;


public class DItems {
    private String Id_Items;
    private String Nombre;
    private int Stock;
    private int ValorUnit;
    
    public void SetId_Items(String Id_Items){
        this.Id_Items=Id_Items;
    }
    
    public String GetId_Items(){
        return this.Id_Items;
    }
    
    public void SetNombre(String Nombre){
        this.Nombre=Nombre;
    }

    public String GetNombre(){
        return this.Nombre;
    }

    public void SetStock(int Stock){
        this.Stock=Stock;
    }
	 
    public int GetStock(){
        return this.Stock;
    } 
    public void SetValorUnit(int ValorUnit){
        this.ValorUnit=ValorUnit;
    }
	 
    public int GetValorUnit(){
        return this.ValorUnit;
    } 
}
