package Conectar;


import Datos.DNumeros;
import Interfaces.AsignarCama;
import Interfaces.CobroGastos;
import Interfaces.ControlPaciente;
import Interfaces.CrearCama;
import Interfaces.Login;
import java.awt.Component;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Interfaces.CrearDepartamento;
import Interfaces.CrearEspecialidad;
import Interfaces.CrearIsapre;
import Interfaces.CrearItems;
import Interfaces.CrearMedico;
import Interfaces.CrearUsuario;
import Interfaces.Informaciones;
import Interfaces.RegistrarPaciente;
import Interfaces.Tratamiento;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Conectar {
    static String bd = "jdbc:ucanaccess://src\\BBDD\\Examen.accdb";
    static String drv = "net.ucanaccess.jdbc.UcanaccessDriver";
    static Connection con ;
    static Statement stSql;
    static PreparedStatement pt;
    public static String tipo_acc;
    public static int ver;
    public static int Exit;
    public void DBConectar(){
        Component ventana = null;
        try {
            Class.forName(drv) ;
        } catch(java.lang.ClassNotFoundException e) {
            System.err.print("ClassNotFoundException: ") ;
            System.err.println(e.getMessage()) ;
            return ;
        }
        try {
            con = DriverManager.getConnection(bd, "java", "sun");
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(ventana,"SQLException: " + ex.getMessage(),"Error Conexión BD",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void DBDesconectar(){
        Component ventana = null;
        try{
	    con.close();
        } catch(SQLException ex) {
	    JOptionPane.showMessageDialog(ventana,"SQLException: " + ex.getMessage(),"Error Desconexión BD",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void DBIngresar(String s){
        Component ventana = null;
        try{
            stSql = con.createStatement();
            int x=stSql.executeUpdate(s);
            JOptionPane.showMessageDialog(ventana,x + " Dato ha sido ingresado Correctamente!!","Ingreso de Datos",JOptionPane.INFORMATION_MESSAGE);
            stSql.close();
        } catch (SQLException error){
            JOptionPane.showMessageDialog(ventana,"No se pudo insertar el registro. " + error,"Error de Ingreso de Datos!!",JOptionPane.INFORMATION_MESSAGE);
            
	}
    }
    public ResultSet verificar(String s, String Descripcion){
        ResultSet rs=null;
        try{
            String loginResultante = "";
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                loginResultante = rs.getString("Login");
            }
            if(Descripcion.equals(loginResultante)){
               ver = 0 ;
            }else{
               ver = 1; 
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    
    public ResultSet Entrar(String s){
        String Clave = Login.CONTRASEÑA.getText();
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            
            String pass ="" , nom = "", tipo = "";
            if(rs.next()){
            nom= rs.getString("Login");
            pass= rs.getString("Clave");
            tipo= rs.getString("Tipo");
        }
        if(Clave.equals(pass)){
            JOptionPane.showMessageDialog(null,"Ha ingresado exitosamente al sistema","java",1);
            tipo_acc = tipo ;
            ver = 0;
        }else{
            JOptionPane.showMessageDialog(null,"Los Datos no son Correctos","java",1);
            ver = 1;
            Exit++;
        }   
            stSql.close();
        } catch (SQLException e){   
	}
        return (rs);
    }
    //------------ Numeros ID
    public ResultSet NumerosIDdep(String s){
        ResultSet rs=null;
        String c = "";
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            if(rs.next())
            {              
                 c=rs.getString("Id_Departamento");
            }
            if(c==null)
             {
                 CrearDepartamento.IDdep.setText("0001");
             }
            else{   
                 char r1 = c.charAt(2);
                 char r2 = c.charAt(3);

                 String juntar = ""+r1+r2;
                 
                 int var=Integer.parseInt(juntar);
                 DNumeros gen = new DNumeros();
                 gen.generar(var);
            
                CrearDepartamento.IDdep.setText(gen.serie());    
                
             }
            stSql.close();
        } catch (SQLException error){    
	}
        return (rs);
    }
    public ResultSet NumerosIDesp(String s){
        ResultSet rs=null;
        String c = "";
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            if(rs.next())
            {              
                 c=rs.getString("Id_Especialidad");
            }
            if(c==null)
             {
                 CrearEspecialidad.IDesp.setText("0001");
             }
            else{   
                 char r1 = c.charAt(2);
                 char r2 = c.charAt(3);

                 String juntar = ""+r1+r2;
                 
                 int var=Integer.parseInt(juntar);
                 DNumeros gen = new DNumeros();
                 gen.generar(var);
            
                CrearEspecialidad.IDesp.setText(gen.serie());    
                
             }
            stSql.close();
        } catch (SQLException error){    
	}
        return (rs);
    }
     public ResultSet NumerosIDIsapre(String s){
        ResultSet rs=null;
        String c = "";
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            if(rs.next())
            {              
                 c=rs.getString("Id_Isapre");
            }
            if(c==null)
             {
                 CrearIsapre.IDisapre.setText("0001");
             }
            else{   
                 char r1 = c.charAt(2);
                 char r2 = c.charAt(3);

                 String juntar = ""+r1+r2;
                 
                 int var=Integer.parseInt(juntar);
                 DNumeros gen = new DNumeros();
                 gen.generar(var);
            
                CrearIsapre.IDisapre.setText(gen.serie());    
                
             }
            stSql.close();
        } catch (SQLException error){    
	}
        return (rs);
    }
    public ResultSet NumerosIDFuncionario(String s){
        ResultSet rs=null;
        String c = "";
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            if(rs.next())
            {              
                 c=rs.getString("Id_Funcionario");
            }
            if(c==null)
             {
                 CrearMedico.IDMEDICO.setText("0001");
             }
            else{   
                 char r1 = c.charAt(2);
                 char r2 = c.charAt(3);

                 String juntar = ""+r1+r2;
                 
                 int var=Integer.parseInt(juntar);
                 DNumeros gen = new DNumeros();
                 gen.generar(var);
            
                CrearMedico.IDMEDICO.setText(gen.serie());    
                
             }
            stSql.close();
        } catch (SQLException error){    
	}
        return (rs);
    }
    public ResultSet NumerosIDCama(String s){
        ResultSet rs=null;
        String c = "";
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            if(rs.next())
            {              
                 c=rs.getString("Id_Cama");
            }
            if(c==null)
             {
                 CrearCama.IDCAMA.setText("0001");
             }
            else{   
                 char r1 = c.charAt(2);
                 char r2 = c.charAt(3);

                 String juntar = ""+r1+r2;
                 
                 int var=Integer.parseInt(juntar);
                 DNumeros gen = new DNumeros();
                 gen.generar(var);
            
                CrearCama.IDCAMA.setText(gen.serie());    
                
             }
            stSql.close();
        } catch (SQLException error){    
	}
        return (rs);
    }
    public ResultSet NumerosIDItems(String s){
        ResultSet rs=null;
        String c = "";
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            if(rs.next())
            {              
                 c=rs.getString("Id_Items");
            }
            if(c==null)
             {
                 CrearItems.IDITEM.setText("0001");
             }
            else{   
                 char r1 = c.charAt(2);
                 char r2 = c.charAt(3);

                 String juntar = ""+r1+r2;
                 
                 int var=Integer.parseInt(juntar);
                 DNumeros gen = new DNumeros();
                 gen.generar(var);
            
               CrearItems.IDITEM.setText(gen.serie());    
                
             }
            stSql.close();
        } catch (SQLException error){    
	}
        return (rs);
    }
    public ResultSet NumerosIDPaciente(String s){
        ResultSet rs=null;
        String c = "";
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            if(rs.next())
            {              
                 c=rs.getString("Id_Paciente");
            }
            if(c==null)
             {
                 RegistrarPaciente.IDUSUARIO.setText("0001");
             }
            else{   
                 char r1 = c.charAt(2);
                 char r2 = c.charAt(3);

                 String juntar = ""+r1+r2;
                 
                 int var=Integer.parseInt(juntar);
                 DNumeros gen = new DNumeros();
                 gen.generar(var);
            
               RegistrarPaciente.IDUSUARIO.setText(gen.serie());    
                
             }
            stSql.close();
        } catch (SQLException error){    
	}
        return (rs);
    }
    public ResultSet NumerosIDAsignar(String s){
        ResultSet rs=null;
        String c = "";
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            if(rs.next())
            {              
                 c=rs.getString("Id_Ocupacion");
            }
            if(c==null)
             {
                AsignarCama.IDASIGNAR.setText("0001");
             }
            else{   
                 char r1 = c.charAt(2);
                 char r2 = c.charAt(3);

                 String juntar = ""+r1+r2;
                 
                 int var=Integer.parseInt(juntar);
                 DNumeros gen = new DNumeros();
                 gen.generar(var);
            
               AsignarCama.IDASIGNAR.setText(gen.serie());    
                
             }
            stSql.close();
        } catch (SQLException error){    
	}
        return (rs);
    }
    public ResultSet NumerosIDTratamiento(String s){
        ResultSet rs=null;
        String c = "";
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            if(rs.next())
            {              
                 c=rs.getString("Id_Tratamiento");
            }
            if(c==null)
             {
                Tratamiento.IDTRATAMIENTO.setText("0001");
             }
            else{   
                 char r1 = c.charAt(2);
                 char r2 = c.charAt(3);

                 String juntar = ""+r1+r2;
                 
                 int var=Integer.parseInt(juntar);
                 DNumeros gen = new DNumeros();
                 gen.generar(var);
            
               Tratamiento.IDTRATAMIENTO.setText(gen.serie());    
                
             }
            stSql.close();
        } catch (SQLException error){    
	}
        return (rs);
    }
    public ResultSet NumerosIDControl(String s){
        ResultSet rs=null;
        String c = "";
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            if(rs.next())
            {              
                 c=rs.getString("Id_Gastos");
            }
            if(c==null)
             {
                ControlPaciente.IDCONTROL.setText("0001");
             }
            else{   
                 char r1 = c.charAt(2);
                 char r2 = c.charAt(3);

                 String juntar = ""+r1+r2;
                 
                 int var=Integer.parseInt(juntar);
                 DNumeros gen = new DNumeros();
                 gen.generar(var);
            
               ControlPaciente.IDCONTROL.setText(gen.serie());    
                
             }
            stSql.close();
        } catch (SQLException error){    
	}
        return (rs);
    }
    
     //-----Verificar   --------
    public ResultSet verificarDescripcion(String s, String Descripcion){
        ResultSet rs=null;
        try{
            String loginResultante = "";
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                loginResultante = rs.getString("Descripcion");
            }
            if(Descripcion.equals(loginResultante)){
               ver = 0 ;
            }else{
               ver = 1; 
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet verificarNombre(String s, String Descripcion){
        ResultSet rs=null;
        try{
            String loginResultante = "";
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                loginResultante = rs.getString("Nombre");
            }
            if(Descripcion.equals(loginResultante)){
               ver = 0 ;
            }else{
               ver = 1; 
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet verificarNumeroPieza(String s, String Descripcion){
        ResultSet rs=null;
        try{
            String loginResultante = "";
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                loginResultante = rs.getString("Pieza");
            }
            if(Descripcion.equals(loginResultante)){
               ver = 0 ;
            }else{
               ver = 1; 
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    //---------Consultar Combo------------
    public ResultSet ConsultarComboDep(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            CrearMedico.jDep.addItem("Seleccione una opción");
            CrearMedico.ActDepartamento.addItem("Seleccione una opción");
            while (rs.next()) {
                CrearMedico.jDep.addItem(rs.getString("Descripcion"));
                CrearMedico.ActDepartamento.addItem(rs.getString("Descripcion"));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet ConsultarComboEsp(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            CrearMedico.jEspecialidad.addItem("Seleccione una opción");
            CrearMedico.ActEspecialidad.addItem("Seleccione una opción");
            while (rs.next()) {
                CrearMedico.jEspecialidad.addItem(rs.getString("Descripcion"));
                CrearMedico.ActEspecialidad.addItem(rs.getString("Descripcion"));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet ConsultarComboIsapre(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            RegistrarPaciente.ISAPRE.addItem("Seleccione una opción");
            while (rs.next()) {
                RegistrarPaciente.ISAPRE.addItem(rs.getString("Nombre"));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet ConsultarComboPaciente(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            AsignarCama.PACIENTE.addItem("Seleccione una opción");
          
            while (rs.next()) {
                AsignarCama.PACIENTE.addItem(rs.getString("Nombre"));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet ConsultarComboCama(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            AsignarCama.PIEZA.addItem("Seleccione una opción");
            while (rs.next()) {
                AsignarCama.PIEZA.addItem(rs.getString("Pieza"));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet ConsultarComboMedico(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            Tratamiento.MEDICO.addItem("Seleccione una opción");
            while (rs.next()) {
                Tratamiento.MEDICO.addItem(rs.getString("Nombre"));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
        public ResultSet ConsultarComboPacienteTrata(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);;
            Tratamiento.PACIENTE.addItem("Seleccione una opción");
            while (rs.next()) {
                Tratamiento.PACIENTE.addItem(rs.getString("Nombre"));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet ConsultarComboPacienteControl(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            ControlPaciente.PACIENTE.addItem("Seleccione una opción");
            while (rs.next()) {
                ControlPaciente.PACIENTE.addItem(rs.getString("Nombre"));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet ConsultarComboPacientTras(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            ControlPaciente.PacienteTras.addItem("Seleccione una opción");
            while (rs.next()) {
                ControlPaciente.PacienteTras.addItem(rs.getString("Nombre"));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet ConsultarComboCamaTras(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            ControlPaciente.CAMA.addItem("Seleccione una opción");
            while (rs.next()) {
                ControlPaciente.CAMA.addItem(rs.getString("Pieza"));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet Consultarpacientegastos(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
           CobroGastos.PACIENTE.addItem("Seleccione una opción");
            while (rs.next()) {
                CobroGastos.PACIENTE.addItem(rs.getString("Nombre"));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet PacienteInformar(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
           Informaciones.FICHAPACIENTE.addItem("Seleccione una opción");
            while (rs.next()) {
                Informaciones.FICHAPACIENTE.addItem(rs.getString("Nombre"));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    //-------------Agregar ID------------------
    public ResultSet AgregarIDEsp(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                CrearMedico.IDESP.setText(String.valueOf(rs.getString("Id_Especialidad")));
                CrearMedico.ActEsp.setText(String.valueOf(rs.getString("Id_Especialidad")));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet AgregarIDDep(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                CrearMedico.IDDEP.setText(String.valueOf(rs.getString("Id_Departamento")));
                CrearMedico.ActDep.setText(String.valueOf(rs.getString("Id_Departamento")));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet AgregarIDIsapre(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                RegistrarPaciente.IDisap.setText(String.valueOf(rs.getString("Id_Isapre")));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet AgregarIDPaciente(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                AsignarCama.idPac.setText(String.valueOf(rs.getString("Id_Paciente")));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet AgregarIDPieza(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                AsignarCama.idPieza.setText(String.valueOf(rs.getString("Id_Cama")));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet AgregarIDMedico(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                Tratamiento.IDMEDICO.setText(String.valueOf(rs.getString("Id_Funcionario")));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet AgregarIDPacienteTrata(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                Tratamiento.IDPACIENTE.setText(String.valueOf(rs.getString("Id_Paciente")));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet AgregarIDPacienteControl(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                ControlPaciente.IDPACIENTE.setText(String.valueOf(rs.getString("Id_Paciente")));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet AgregarIDPacienteControltrans(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                ControlPaciente.IDPAS.setText(String.valueOf(rs.getString("Id_Paciente")));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet AgregarIDPiezatrans(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                ControlPaciente.IDcam.setText(String.valueOf(rs.getString("Id_Cama")));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet buscarcama(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                ControlPaciente.idcama.setText(String.valueOf(rs.getString("Cama")));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet PACIENTEGASTOS(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                CobroGastos.IDPACIENTE.setText(String.valueOf(rs.getString("Id_Paciente")));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    public ResultSet CAMAGASTOS(String s){
        ResultSet rs=null;
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                CobroGastos.cama.setText(String.valueOf(rs.getString("Id_Cama")));
            }
            stSql.close();   
        } catch (SQLException | HeadlessException e){   
	}
        return (rs);
    }
    //--------------Mostrar Datos en tabla-------------
    public ResultSet MostrarLogin(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("Usuario");
        tm.addColumn("Contraseña");
        tm.addColumn("Tipo");
        CrearUsuario.TBUSUARIO.setModel(tm);
       
        String []datos = new String [3];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                tm.addRow(datos);
            }
            CrearUsuario.TBUSUARIO.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    public ResultSet MostrarCama(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("ID");
        tm.addColumn("Tipo");
        tm.addColumn("Estado");
        tm.addColumn("Nº de Pieza");
        CrearCama.TBCAMA.setModel(tm);
       
        String []datos = new String [4];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                tm.addRow(datos);
            }
            CrearCama.TBCAMA.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    public ResultSet MostrarEspecialidad(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("ID");
        tm.addColumn("Nombre");
        CrearEspecialidad.ESPECIALIDAD.setModel(tm);
       
        String []datos = new String [2];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                tm.addRow(datos);
            }
            CrearEspecialidad.ESPECIALIDAD.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    public ResultSet MostrarIsapre(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("ID");
        tm.addColumn("Nombre");
        CrearIsapre.ISAPRE.setModel(tm);
       
        String []datos = new String [2];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                tm.addRow(datos);
            }
            CrearIsapre.ISAPRE.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    public ResultSet MostrarMedico(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("ID");
        tm.addColumn(" Nombre y Apellido ");
        tm.addColumn("Dirección");
        tm.addColumn("Fono");
        tm.addColumn("Especialidad");
        tm.addColumn("Departamento");
        CrearMedico.MEDICO.setModel(tm);
       
        String []datos = new String [6];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                tm.addRow(datos);
            }
            CrearMedico.MEDICO.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    public ResultSet MostrarItems(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("ID");
        tm.addColumn("Nombre");
        tm.addColumn("Stock");
        tm.addColumn("Valor");
        CrearItems.ITEMS.setModel(tm);
       
        String []datos = new String [4];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                tm.addRow(datos);
            }
            CrearItems.ITEMS.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
        public ResultSet MostrarItemsControl(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("ID");
        tm.addColumn("Nombre");
        tm.addColumn("Stock");
        tm.addColumn("Valor");
        ControlPaciente.CONTROL.setModel(tm);
       
        String []datos = new String [4];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                tm.addRow(datos);
            }
            ControlPaciente.CONTROL.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    public ResultSet MostrarPaciente(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn(" Nombre y Apellido");
        tm.addColumn("Direccion");
        tm.addColumn("Fono");
        tm.addColumn("Isapre");
        tm.addColumn("Fecha_Ing");
        RegistrarPaciente.PACIENTE.setModel(tm);
       
        String []datos = new String [5];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                tm.addRow(datos);
            }
           RegistrarPaciente.PACIENTE.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    public ResultSet MostrarPacienteGastos(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("Nombre Item");
        tm.addColumn("Fecha");
        tm.addColumn("Cantidad");
        tm.addColumn("Valor Unitario");
        tm.addColumn("Total");
        CobroGastos.GASTOS.setModel(tm);
       
        String []datos = new String [5];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                tm.addRow(datos);
            }
           CobroGastos.GASTOS.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    //----------------Eliminar Datos-------------
    public void Eliminar(String s){
        Component ventana = null;
        try{
            stSql = con.createStatement();
            int x=stSql.executeUpdate(s);
            JOptionPane.showMessageDialog(ventana,x + " Dato ha sido Eliminado Correctamente!!","Elimar de Datos",JOptionPane.INFORMATION_MESSAGE);
            stSql.close();
        } catch (SQLException error){
            JOptionPane.showMessageDialog(ventana,"No se pudo Eliminar el registro. " + error,"Error de Eliminación de Datos!!",JOptionPane.INFORMATION_MESSAGE);
            
	}
    }
    //--------------Actualizar Datos ------------
    public void Actualizar(String s){
        Component ventana = null;
        try{
            stSql = con.createStatement();
            int x=stSql.executeUpdate(s);
            //JOptionPane.showMessageDialog(ventana,x + " Dato ha sido Actualizado Correctamente!!","Actualizar de Datos",JOptionPane.INFORMATION_MESSAGE);
            stSql.close();
        } catch (SQLException error){
            JOptionPane.showMessageDialog(ventana,"No se pudo Actualizar el registro. " + error,"Error de actualización de Datos!!",JOptionPane.INFORMATION_MESSAGE);
            
	}
    }

    public ResultSet InformacionMedico(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("Nombre Medico");
        tm.addColumn("Especialidad");
        Informaciones.INFORMACIONES.setModel(tm);
       
        String []datos = new String [2];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                tm.addRow(datos);
            }
           Informaciones.INFORMACIONES.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    public ResultSet InformacionEspecialidad(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("Nombre Especialidad");
        Informaciones.INFORMACIONES.setModel(tm);
       
        String []datos = new String [1];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                tm.addRow(datos);
            }
           Informaciones.INFORMACIONES.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    public ResultSet InformacionCamas(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("Nº Pieza");
        tm.addColumn("TipoCama");
        Informaciones.INFORMACIONES.setModel(tm);
       
        String []datos = new String [2];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                tm.addRow(datos);
            }
           Informaciones.INFORMACIONES.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    public ResultSet InformacionActuales(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("Nombre");
        tm.addColumn("Fecha_Ing");
        Informaciones.INFORMACIONES.setModel(tm);
       
        String []datos = new String [4];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                tm.addRow(datos);
            }
           Informaciones.INFORMACIONES.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    public ResultSet InformacionAlta(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("Nombre");
        tm.addColumn("Fecha_Ing");
        tm.addColumn("Fecha_Alta");
        Informaciones.INFORMACIONES.setModel(tm);
       
        String []datos = new String [5];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                tm.addRow(datos);
            }
           Informaciones.INFORMACIONES.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    public ResultSet InformacionItems(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("Nombre");
        tm.addColumn("Stock");
        Informaciones.INFORMACIONES.setModel(tm);
       
        String []datos = new String [2];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                tm.addRow(datos);
            }
           Informaciones.INFORMACIONES.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    public ResultSet InformacionPacientes(String s){
        ResultSet rs=null;
        DefaultTableModel tm= new DefaultTableModel();
        tm.addColumn("Nombre");
        tm.addColumn("Direccion");
        tm.addColumn("Fono");
        tm.addColumn("Isapre");
        tm.addColumn("Fecha_Ing");
        tm.addColumn("Fecha_Alta");
        Informaciones.INFORMACIONES.setModel(tm);
       
        String []datos = new String [6];
        try{
            stSql = con.createStatement();
            rs=stSql.executeQuery(s);
            while (rs.next()) {
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                tm.addRow(datos);
            }
           Informaciones.INFORMACIONES.setModel(tm);
            stSql.close();   
        } catch (SQLException ex){
	}
        return (rs);
    }
    
}
