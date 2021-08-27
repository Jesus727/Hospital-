package Funciones;

import Conectar.Conectar;


public class FIngresar {
    Conectar bd = new Conectar();
    
    //-----------------Insertar--------------------------------------
    public void CrearUsuario(String user , String clave , String tipo){
        bd.DBConectar();
        bd.DBIngresar("insert into Login (Login,Clave,Tipo) VALUES ('" + user + "','" + clave + "','" + tipo + "')");
        bd.DBDesconectar();  
    }
    public void CrearDepartamento(String id , String nombre){
        bd.DBConectar();
        bd.DBIngresar("insert into Departamento (Id_Departamento,Descripcion) VALUES ('" + id + "','" + nombre + "')");
        bd.DBDesconectar();  
    }
    public void CrearEspecialidad(String id , String nombre){
        bd.DBConectar();
        bd.DBIngresar("insert into Especialidad (Id_Especialidad,Descripcion) VALUES ('" + id + "','" + nombre + "')");
        bd.DBDesconectar();  
    }
    public void CrearIsapre(String id , String nombre){
        bd.DBConectar();
        bd.DBIngresar("insert into Isapre (Id_Isapre,Nombre) VALUES ('" + id + "','" + nombre + "')");
        bd.DBDesconectar();  
    }
    public void CrearMedico(String id , String nom , String Dir , int Fono , String Esp , String Dep){
        bd.DBConectar();
        bd.DBIngresar("insert into Funcionario (Id_Funcionario,Nombre,Direccion,Fono,Especialidad,Departamento) VALUES ('" + id + "','" + nom + "','" + Dir+ "','" + Fono + "','" + Esp + "','" + Dep + "')");
        bd.DBDesconectar();  
    }
    public void CrearCama(String id , String tipo , String estado , int pieza){
        bd.DBConectar();
        bd.DBIngresar("insert into Cama (Id_Cama,TipoCama,Estado,Pieza) VALUES ('" + id + "','" + tipo + "','" + estado + "','" + pieza + "')");
        bd.DBDesconectar();  
    }
    public void CrearItems(String id , String nom , int stock , int valor){
        bd.DBConectar();
        bd.DBIngresar("insert into Items (Id_Items,Nombre,Stock,ValorUnit) VALUES ('" + id + "','" + nom + "','" + stock + "','" + valor + "')");
        bd.DBDesconectar();  
    }
  public void CrearPaciente(String id , String nom , String Dir , int Fono , String isapre , String fecha, String Cama,String Alta){
        bd.DBConectar();
        bd.DBIngresar("insert into Paciente (Id_Paciente,Nombre,Direccion,Fono,Isapre,Fecha_Ing,Cama,Alta) VALUES ('" + id + "','" + nom + "','" + Dir+ "','" + Fono + "','" + isapre + "','" + fecha + "','"+ Cama +"','"+Alta+"')");
        bd.DBDesconectar();  
    }
  public void OcuparCama(String id , String Paciente , String Fecha, String Cama){
        bd.DBConectar();
        bd.DBIngresar("insert into Ocupacion (Id_Ocupacion,Paciente,FechaOcup,Cama) VALUES ('" + id + "','" + Paciente + "','" + Fecha + "','"+ Cama +"')");
        bd.DBDesconectar();  
    }
  public void CrearTratamiento(String id , String Paciente , String Medico, String Fecha , String Hora, String Diag , String Trata){
        bd.DBConectar();
        bd.DBIngresar("insert into Tratamiento (Id_Tratamiento,Paciente,Medico,Fecha,Hora,Diagnostico,Tratamiento) VALUES ('" + id + "','" + Paciente + "','" + Medico + "','"+ Fecha +"','"+Hora +"','"+ Diag +"','"+Trata+"')");
        bd.DBDesconectar();  
    }
   public void CrearGastos(String id , String pac , String fecha , String item , int cant){
        bd.DBConectar();
        bd.DBIngresar("insert into Gastos (Id_Gastos,Paciente,Fecha,Item,Cant) VALUES ('" + id + "','" + pac + "','" + fecha + "','" + item + "','"+ cant+"')");
        bd.DBDesconectar();  
    }
}
