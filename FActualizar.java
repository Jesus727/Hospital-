
package Funciones;

import Conectar.Conectar;

public class FActualizar {
    Conectar bd = new Conectar();
    public void ActualizarEsp(String a , String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Especialidad Set Descripcion ='"+ a +"' WHERE  Id_Especialidad='"+ b +"'");
        bd.DBDesconectar(); 
    }
    public void ActualizarIsapre(String a , String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Isapre Set Nombre ='"+ a +"' WHERE  Id_Isapre='"+ b +"'");
        bd.DBDesconectar(); 
    }
    //Medico
    public void ActualizarMedicoNom(String a , String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Funcionario Set Nombre ='"+ a +"' WHERE  Id_Funcionario='"+ b +"'");
        bd.DBDesconectar(); 
    }
    public void ActualizarMedicoDir(String a , String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Funcionario Set Direccion ='"+ a +"' WHERE  Id_Funcionario='"+ b +"'");
        bd.DBDesconectar(); 
    }
    public void ActualizarMedicoFono(String a , String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Funcionario Set Fono ='"+ a +"' WHERE  Id_Funcionario='"+ b +"'");
        bd.DBDesconectar(); 
    }
    public void ActualizarMedicoEsp(String a , String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Funcionario Set Especialidad ='"+ a +"' WHERE  Id_Funcionario='"+ b +"'");
        bd.DBDesconectar(); 
    }
    public void ActualizarMedicoDep(String a , String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Funcionario Set Departamento ='"+ a +"' WHERE  Id_Funcionario='"+ b +"'");
        bd.DBDesconectar(); 
    }
    //--------
     public void ActualizarCama(String a , String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Cama Set Pieza ='"+ a +"' WHERE  Id_Cama='"+ b +"'");
        bd.DBDesconectar(); 
    }
    public void ActualizarItems(String a , String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Items Set ValorUnit ='"+ a +"' WHERE  Id_Items='"+ b +"'");
        bd.DBDesconectar(); 
    }
    public void ActualizarStock(int a , String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Items Set Stock = '"+ a +"' WHERE  Id_Items='"+ b +"'");
        bd.DBDesconectar(); 
    }
    //--Paciente
    public void ActualizarPacienteNom(String a , String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Paciente Set Nombre ='"+ a +"' WHERE  Nombre='"+ b +"'");
        bd.DBDesconectar(); 
    }
    public void ActualizarPacienteDir(String a , String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Paciente Set Direccion ='"+ a +"' WHERE  Nombre='"+ b +"'");
        bd.DBDesconectar(); 
    }
    public void ActualizarPacienteFono(String a , String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Paciente Set Fono ='"+ a +"' WHERE  Nombre='"+ b +"'");
        bd.DBDesconectar(); 
    }
    public void ActualizarPacienteCama(String a){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Paciente Set Cama ='SI' WHERE  Id_Paciente='"+ a +"'");
        bd.DBDesconectar(); 
    }
    public void ActualizarCamaPieza(String a){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Cama Set Estado ='OCUPADO' WHERE  Id_Cama='"+ a +"'");
        bd.DBDesconectar(); 
    }
    public void ActualizarFechaCama(String a , String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Ocupacion Set FechaDesocup ='"+ a +"' WHERE Paciente='"+ b +"'");
        bd.DBDesconectar(); 
    }
    public void ActualizarAltaPaciente(String a, String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Paciente Set Fecha_Alta ='"+ a +"' WHERE  Id_Paciente='"+ b +"'");
        bd.DBDesconectar(); 
    }
    public void ActualizarAltaPaciente2(String a){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Paciente Set Alta ='SI' WHERE  Id_Paciente='"+ a +"'");
        bd.DBDesconectar(); 
    }
    //--------Transladar al paciente
    public void TrasladoPaciente(String a, String b){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Ocupacion Set Cama ='"+ a +"' WHERE  Paciente='"+ b +"'");
        bd.DBDesconectar(); 
    }
    public void TrasladoOcupado(String a){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Cama Set Estado ='OCUPADO' WHERE  Id_Cama='"+ a +"'");
        bd.DBDesconectar(); 
    }
    public void TrasladoDisponible(String a){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Cama Set Estado ='DISPONIBLE' WHERE  Id_Cama='"+ a +"'");
        bd.DBDesconectar(); 
    }
    public void Alta(String a){   
        bd.DBConectar();
        bd.Actualizar("UPDATE Paciente Set Cama ='NO' WHERE  Id_Paciente='"+ a +"'");
        bd.DBDesconectar(); 
    }
}
