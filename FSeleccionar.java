package Funciones;

import Conectar.Conectar;

public class FSeleccionar {
    Conectar bd = new Conectar();
    
    //------------------------------verificar-----------------------
     public void verificarDescripcionDep(String Desc){
        bd.DBConectar();
        bd.verificarDescripcion("SELECT Descripcion FROM Departamento WHERE Descripcion ='" + Desc + "'",Desc);
        bd.DBDesconectar();
    }
    public void verificarDescripcionEsp(String Desc){
        bd.DBConectar();
        bd.verificarDescripcion("SELECT Descripcion FROM Especialidad WHERE Descripcion ='" + Desc + "'" , Desc);
        bd.DBDesconectar();
    }
    public void verificarDescripcionIsapre(String Desc){
        bd.DBConectar();
        bd.verificarNombre("SELECT Nombre FROM Isapre WHERE Nombre ='" + Desc + "'" , Desc);
        bd.DBDesconectar();
    }
    public void verificarNombreFunc(String Desc){
        bd.DBConectar();
        bd.verificarNombre("SELECT Nombre FROM Funcionario WHERE Nombre ='" + Desc + "'" , Desc);
        bd.DBDesconectar();
    }
    public void verificarNombreItems(String Desc){
        bd.DBConectar();
        bd.verificarNombre("SELECT Nombre FROM Items WHERE Nombre ='" + Desc + "'" , Desc);
        bd.DBDesconectar();
    }
    public void verificarNumeroPieza(String Desc){
        bd.DBConectar();
        bd.verificarNumeroPieza("SELECT Pieza FROM Cama WHERE Pieza ='" + Desc + "'" , Desc);
        bd.DBDesconectar();
    }
    public void verificarNombrePaciente(String Desc){
        bd.DBConectar();
        bd.verificarNombre("SELECT Nombre FROM Paciente WHERE Nombre ='" + Desc + "'" , Desc);
        bd.DBDesconectar();
    }
    public void verificarlogin(String login){
        bd.DBConectar();
        bd.verificar("SELECT Login FROM Login WHERE Login ='" + login + "'",login);
        bd.DBDesconectar();
    }
    //---------Entrar Login-------------------
    public void entrar(String Login, String Clave){
        bd.DBConectar();
        bd.Entrar("Select * From Login where Login='"+Login+"'AND Clave = '"+ Clave+"'");
        bd.DBDesconectar();
    }
    //----------------Numeros ID----------------------
    public void numerosDep(){
        bd.DBConectar();
        bd.NumerosIDdep("SELECT MAX(Id_Departamento) AS Id_Departamento FROM Departamento");
        bd.DBDesconectar();
    }
    public void numerosEsp(){
        bd.DBConectar();
        bd.NumerosIDesp("SELECT MAX(Id_Especialidad) AS Id_Especialidad FROM Especialidad");
        bd.DBDesconectar();
    }
    public void numerosIsapre(){
        bd.DBConectar();
        bd.NumerosIDIsapre("SELECT MAX(Id_Isapre) AS Id_Isapre FROM Isapre");
        bd.DBDesconectar();
    }
    public void numerosFuncionario(){
        bd.DBConectar();
        bd.NumerosIDFuncionario("SELECT MAX(Id_Funcionario) AS Id_Funcionario FROM Funcionario");
        bd.DBDesconectar();
    }
    public void numerosIDCama(){
        bd.DBConectar();
        bd.NumerosIDCama("SELECT MAX(Id_Cama) AS Id_Cama FROM Cama");
        bd.DBDesconectar();
    }
    public void numerosIDItems(){
        bd.DBConectar();
        bd.NumerosIDItems("SELECT MAX(Id_Items) AS Id_Items FROM Items");
        bd.DBDesconectar();
    }
    public void numerosIDPaciente(){
        bd.DBConectar();
        bd.NumerosIDPaciente("SELECT MAX(Id_Paciente) AS Id_Paciente FROM Paciente");
        bd.DBDesconectar();
    }
    public void numerosIDAsignar(){
        bd.DBConectar();
        bd.NumerosIDAsignar("SELECT MAX(Id_Ocupacion) AS Id_Ocupacion FROM Ocupacion");
        bd.DBDesconectar();
    }
    public void numerosIDTratamiento(){
        bd.DBConectar();
        bd.NumerosIDTratamiento("SELECT MAX(Id_Tratamiento) AS Id_Tratamiento FROM Tratamiento");
        bd.DBDesconectar();
    }
    public void numerosIDControl(){
        bd.DBConectar();
        bd.NumerosIDControl("SELECT MAX(Id_Gastos) AS Id_Gastos FROM Gastos");
        bd.DBDesconectar();
    }
   //-----------------Seleccionar ComboBox ------------------
    public void ConsultarDepa(){   
        bd.DBConectar();
        bd.ConsultarComboDep("SELECT Descripcion FROM Departamento ORDER BY Descripcion ASC");
        bd.DBDesconectar(); 
    }
    public void ConsultarEsp(){   
        bd.DBConectar();
        bd.ConsultarComboEsp("SELECT  Descripcion FROM Especialidad ORDER BY Descripcion ASC");
        bd.DBDesconectar(); 
    }
    public void ConsultarIsapre(){   
        bd.DBConectar();
        bd.ConsultarComboIsapre("SELECT  Nombre FROM Isapre ORDER BY Nombre ASC");
        bd.DBDesconectar(); 
    }
    public void ConsultarPaciente(){   
        bd.DBConectar();
        bd.ConsultarComboPaciente("SELECT  Nombre FROM Paciente Where Cama = 'NO' ORDER BY Nombre ASC");
        bd.DBDesconectar(); 
    }
    public void ConsultarPieza(){   
        bd.DBConectar();
        bd.ConsultarComboCama("SELECT Pieza FROM Cama Where Estado = 'Disponible' ORDER BY Pieza ASC");
        bd.DBDesconectar(); 
    }
    public void ConsultarPacienteTrata(){   
        bd.DBConectar();
        bd.ConsultarComboPacienteTrata("SELECT Nombre FROM Paciente WHERE Alta= 'NO' ORDER BY Nombre ASC");
        bd.DBDesconectar(); 
    }
    public void ConsultarMedico(){   
        bd.DBConectar();
        bd.ConsultarComboMedico("SELECT Nombre FROM Funcionario ORDER BY Nombre ASC");
        bd.DBDesconectar(); 
    }
    public void ConsultarPas(){   
        bd.DBConectar();
        bd.ConsultarComboPacienteControl("SELECT Nombre FROM Paciente ORDER BY Nombre ASC");
        bd.DBDesconectar(); 
    }
    public void ConsultarPacienteTras(){   
        bd.DBConectar();
        bd.ConsultarComboPacientTras("SELECT Nombre FROM Paciente WHERE Cama = 'SI' ORDER BY Nombre ASC");
        bd.DBDesconectar(); 
    }
    public void ConsultarCamaTras(){   
        bd.DBConectar();
        bd.ConsultarComboCamaTras("SELECT Pieza FROM Cama Where Estado = 'DISPONIBLE' ORDER BY Pieza ASC");
        bd.DBDesconectar(); 
    }
    public void CPaciente(){   
        bd.DBConectar();
        bd.Consultarpacientegastos("SELECT Nombre FROM Paciente ORDER BY Nombre ASC");
        bd.DBDesconectar(); 
    }
    public void CPacienteInformacion(){   
        bd.DBConectar();
        bd.PacienteInformar("SELECT Nombre FROM Paciente ORDER BY Nombre ASC");
        bd.DBDesconectar(); 
    }
  //--------------Agregar ID para un combo-----------
    public void AgregarIDEsp(String s){   
        bd.DBConectar();
        bd.AgregarIDEsp("SELECT Id_Especialidad FROM Especialidad Where Descripcion = '"+ s +"'");
        bd.DBDesconectar(); 
    }
    public void AgregarIDDep(String s){   
        bd.DBConectar();
        bd.AgregarIDDep("SELECT Id_Departamento FROM Departamento Where Descripcion = '"+ s +"'");
        bd.DBDesconectar(); 
    }
    public void AgregarActIDEsp(String s){   
        bd.DBConectar();
        bd.AgregarIDEsp("SELECT Id_Especialidad FROM Especialidad Where Descripcion = '"+ s +"'");
        bd.DBDesconectar(); 
    }
    public void AgregarActIDDep(String s){   
        bd.DBConectar();
        bd.AgregarIDDep("SELECT Id_Departamento FROM Departamento Where Descripcion = '"+ s +"'");
        bd.DBDesconectar(); 
    }
    public void AgregarActIDIsapre(String s){   
        bd.DBConectar();
        bd.AgregarIDIsapre("SELECT Id_Isapre FROM Isapre Where Nombre = '"+ s +"'");
        bd.DBDesconectar(); 
    }
    public void AgregarActIDPaciente(String s){   
        bd.DBConectar();
        bd.AgregarIDPaciente("SELECT Id_Paciente FROM Paciente Where Nombre = '"+ s +"'");
        bd.DBDesconectar(); 
    }
    public void AgregarActIDPieza(String s){   
        bd.DBConectar();
        bd.AgregarIDPieza("SELECT Id_Cama FROM Cama Where Pieza = '"+ s +"'");
        bd.DBDesconectar(); 
    }
     public void AgregarActIDMedico(String s){   
        bd.DBConectar();
        bd.AgregarIDMedico("SELECT Id_Funcionario FROM Funcionario Where Nombre = '"+ s +"'");
        bd.DBDesconectar(); 
    }
    public void AgregarActIDPacienteTrata(String s){   
        bd.DBConectar();
        bd.AgregarIDPacienteTrata("SELECT Id_Paciente FROM Paciente Where Nombre = '"+ s +"'");
        bd.DBDesconectar(); 
    }
    public void AgregarActIDPacienteControl(String s){   
        bd.DBConectar();
        bd.AgregarIDPacienteControl("SELECT Id_Paciente FROM Paciente Where Nombre = '"+ s +"'");
        bd.DBDesconectar(); 
    }
    public void AgregarActIDPacienteTras(String s){   
        bd.DBConectar();
        bd.AgregarIDPacienteControltrans("SELECT Id_Paciente FROM Paciente Where Nombre = '"+ s +"'");
        bd.DBDesconectar(); 
    }
    public void AgregarActIDCamaTras(String s){   
        bd.DBConectar();
        bd. AgregarIDPiezatrans("SELECT Id_Cama FROM Cama Where Pieza = '"+ s +"'");
        bd.DBDesconectar(); 
    }
     public void buscarcama(String s){   
        bd.DBConectar();
        bd.buscarcama("SELECT Cama FROM Ocupacion Where Paciente = '"+ s +"'");
        bd.DBDesconectar(); 
    }
     public void PacienteGastos(String s){   
        bd.DBConectar();
        bd.PACIENTEGASTOS("SELECT Id_Paciente FROM Paciente Where Nombre= '"+ s +"'");
        bd.DBDesconectar(); 
    }
    public void PACIENTECAMAA(String s){   
        bd.DBConectar();
        bd.CAMAGASTOS("SELECT Cama.Id_Cama\n" +
        "FROM Paciente INNER JOIN (Cama INNER JOIN Ocupacion ON Cama.Id_Cama = Ocupacion.Cama) ON Paciente.Id_Paciente = Ocupacion.Paciente\n" +
        "GROUP BY Paciente.Cama, Cama.Estado, Paciente.Nombre, Cama.Id_Cama\n" +
        "HAVING Paciente.Cama='SI' AND Paciente.Nombre='"+s+"';");
        bd.DBDesconectar(); 
    }
    //--------------Mostrar Datos en la Tabla
    public void TablaUsuario(){   
        bd.DBConectar();
        bd.MostrarLogin("Select * From Login");
        bd.DBDesconectar(); 
    }
    public void TablaEspecialidad(String s){   
       if(s.equals("")){ 
        bd.DBConectar();
        bd.MostrarEspecialidad("Select * From Especialidad ORDER BY Id_Especialidad ASC");
        bd.DBDesconectar(); 
       }else{
        bd.DBConectar();
        bd.MostrarEspecialidad("Select * From Especialidad Where Descripcion='"+ s +"' ORDER BY Id_Especialidad ASC");
        bd.DBDesconectar();   
       }
    }
    public void TablaIsapre(String s){   
       if(s.equals("")){ 
        bd.DBConectar();
        bd.MostrarIsapre("Select * From Isapre ORDER BY Id_Isapre ASC");
        bd.DBDesconectar(); 
       }else{
        bd.DBConectar();
        bd.MostrarIsapre("Select * From Isapre Where Nombre='"+ s +"' ORDER BY Id_Isapre ASC");
        bd.DBDesconectar();   
       }
    }
    public void TablaMedico(String s){   
       if(s.equals("")){ 
        bd.DBConectar();
        bd.MostrarMedico("SELECT Funcionario.Id_Funcionario, Funcionario.Nombre, Funcionario.Direccion, Funcionario.Fono, Especialidad.Descripcion, Departamento.Descripcion\n" +
        "FROM Especialidad INNER JOIN (Departamento INNER JOIN Funcionario ON Departamento.Id_Departamento = Funcionario.Departamento) ON Especialidad.Id_Especialidad = Funcionario.Especialidad ORDER BY Funcionario.Id_Funcionario ASC");
        bd.DBDesconectar(); 
       }else{
        bd.DBConectar();
        bd.MostrarMedico("SELECT Funcionario.Id_Funcionario, Funcionario.Nombre, Funcionario.Direccion, Funcionario.Fono, Especialidad.Descripcion, Departamento.Descripcion\n" +
        "FROM Especialidad INNER JOIN (Departamento INNER JOIN Funcionario ON Departamento.Id_Departamento = Funcionario.Departamento) ON Especialidad.Id_Especialidad = Funcionario.Especialidad Where Funcionario.Nombre='"+ s +"' ORDER BY Funcionario.Id_Funcionario ASC");
        bd.DBDesconectar();   
       }
    }
    public void TablaCama(String s){   
       if(s.equals("")){ 
        bd.DBConectar();
        bd.MostrarCama("Select * From Cama ORDER BY Id_Cama ASC");
        bd.DBDesconectar(); 
       }else{
        bd.DBConectar();
        bd.MostrarCama("Select * From Cama Where Pieza='"+ s +"' ORDER BY Id_Cama ASC");
        bd.DBDesconectar();   
       }
    }
    public void TablaItems(String s){   
       if(s.equals("")){ 
        bd.DBConectar();
        bd.MostrarItems("Select * From Items ORDER BY Id_Items ASC");
        bd.DBDesconectar(); 
       }else{
        bd.DBConectar();
        bd.MostrarItems("Select * From Items Where Nombre='"+ s +"' ORDER BY Id_Items ASC");
        bd.DBDesconectar();   
       }
    }
    public void TablaItemsControl(String s){   
       if(s.equals("")){ 
        bd.DBConectar();
        bd.MostrarItemsControl("Select * From Items ORDER BY Id_Items ASC");
        bd.DBDesconectar(); 
       }else{
        bd.DBConectar();
        bd.MostrarItemsControl("Select * From Items Where Nombre='"+ s +"' ORDER BY Id_Items ASC");
        bd.DBDesconectar();   
       }
    }
    public void TablaPaciente(String s){   
       if(s.equals("")){ 
        bd.DBConectar();
        bd.MostrarPaciente("SELECT Paciente.Nombre, Paciente.Direccion, Paciente.Fono, Isapre.Nombre, Paciente.Fecha_Ing\n" +
        "FROM Isapre INNER JOIN Paciente ON Isapre.Id_Isapre = Paciente.Isapre ORDER BY Paciente.Nombre ASC");
        bd.DBDesconectar(); 
       }else{
        bd.DBConectar();
        bd.MostrarPaciente("SELECT Paciente.Nombre, Paciente.Direccion, Paciente.Fono, Isapre.Nombre, Paciente.Fecha_Ing\n" +
        "FROM Isapre INNER JOIN Paciente ON Isapre.Id_Isapre = Paciente.Isapre WHERE Paciente.Nombre='"+ s +"' ORDER BY Paciente.Nombre ASC");
        bd.DBDesconectar();   
       }
    }
public void PacienteGasto(String s){    
        bd.DBConectar();
        bd.MostrarPacienteGastos("SELECT Items.Nombre, Gastos.Fecha, Gastos.Cant, Items.ValorUnit, Sum([Cant]*[ValorUnit]) AS Total\n" +
        "FROM Paciente INNER JOIN (Items INNER JOIN Gastos ON Items.Id_Items = Gastos.Item) ON Paciente.Id_Paciente = Gastos.Paciente\n" +
        "GROUP BY Items.Nombre, Gastos.Fecha, Gastos.Cant, Items.ValorUnit, Paciente.Id_Paciente\n" +
        "HAVING Paciente.Id_Paciente='"+s+"'\n" +
        "ORDER BY Items.Nombre");
        bd.DBDesconectar(); 
}
public void informacionesMedicos(){
    bd.DBConectar();
    bd.InformacionMedico("SELECT Funcionario.Nombre, Especialidad.Descripcion\n" +
    "FROM Especialidad INNER JOIN Funcionario ON Especialidad.Id_Especialidad = Funcionario.Especialidad\n" +
    "GROUP BY Funcionario.Nombre, Especialidad.Descripcion");
    bd.DBDesconectar();
}
public void informacionesEspecialidad(){
    bd.DBConectar();
    bd.InformacionEspecialidad("Select Descripcion From Especialidad ORDER BY Descripcion ASC");
    bd.DBDesconectar();
}
public void informacionesOcupada(){
    bd.DBConectar();
    bd.InformacionCamas("Select Pieza,TipoCama From Cama Where Estado = 'OCUPADO' ORDER BY Pieza ASC");
    bd.DBDesconectar();
}
public void informacionesDisponible(){
    bd.DBConectar();
    bd.InformacionCamas("Select Pieza,TipoCama From Cama Where Estado = 'DISPONIBLE' ORDER BY Pieza ASC");
    bd.DBDesconectar();
}
public void informacionesActuales(){
    bd.DBConectar();
    bd.InformacionActuales("Select Nombre,Fecha_Ing From Paciente Where Alta = 'NO' ORDER BY Nombre ASC");
    bd.DBDesconectar();
}
public void informacionesAlta(){
    bd.DBConectar();
    bd.InformacionAlta("Select Nombre,Fecha_Ing,Fecha_Alta From Paciente Where Alta = 'SI' ORDER BY Nombre ASC");
    bd.DBDesconectar();
}
public void informacionesItems(){
    bd.DBConectar();
    bd.InformacionItems("Select Nombre,Stock From Items ORDER BY Nombre ASC");
    bd.DBDesconectar();
}
public void informacionesPacientes(String s){
    bd.DBConectar();
    bd.InformacionPacientes("SELECT Paciente.Nombre, Paciente.Direccion, Paciente.Fono, Isapre.Nombre, Paciente.Fecha_Ing, Paciente.Fecha_Alta\n" +
"   FROM Isapre INNER JOIN Paciente ON Isapre.Id_Isapre = Paciente.Isapre\n" +
"   WHERE Paciente.Nombre='"+s+"' ORDER BY Paciente.Nombre ASC");
    bd.DBDesconectar();
}
}
    
