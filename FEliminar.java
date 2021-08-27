
package Funciones;

import Conectar.Conectar;

public class FEliminar {
    Conectar bd = new Conectar();
    public void EliminarUsuario(String del){   
        bd.DBConectar();
        bd.Eliminar("DELETE FROM Login WHERE  Login='"+del+"'");
        bd.DBDesconectar(); 
    }
    public void EliminarEspecialidad(String del){   
        bd.DBConectar();
        bd.Eliminar("DELETE FROM Especialidad WHERE  Id_Especialidad='"+del+"'");
        bd.DBDesconectar(); 
    }
    public void EliminarIsapre(String del){   
        bd.DBConectar();
        bd.Eliminar("DELETE FROM Isapre WHERE  Id_Isapre='"+del+"'");
        bd.DBDesconectar(); 
    }
    public void EliminarMedico(String del){   
        bd.DBConectar();
        bd.Eliminar("DELETE FROM Funcionario WHERE  Id_Funcionario='"+del+"'");
        bd.DBDesconectar(); 
    }
    public void EliminarCama(String del){   
        bd.DBConectar();
        bd.Eliminar("DELETE FROM Cama WHERE  Id_Cama='"+del+"'");
        bd.DBDesconectar(); 
    }
    public void EliminarItems(String del){   
        bd.DBConectar();
        bd.Eliminar("DELETE FROM Items WHERE  Id_Items='"+del+"'");
        bd.DBDesconectar(); 
    }
    public void EliminarPaciente(String del){   
        bd.DBConectar();
        bd.Eliminar("DELETE FROM Paciente WHERE  Nombre='"+del+"'");
        bd.DBDesconectar(); 
    }
}
