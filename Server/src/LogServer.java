
import static java.lang.System.out;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;



public class LogServer extends UnicastRemoteObject implements Log {
     public static Statement stt ;
     public static Statement st ;
    public LogServer () throws RemoteException {
       
    super();
    }

     public static void cnx() {
    try{
    Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost/gestion_produit", "root", "");
          stt =con.createStatement();
          st =con.createStatement();
         
    }
    //tu va creer une base de donnees avec ce nom
    catch (Exception e){
    out.print("erreur de connexion avec la base: "+e);

    }
    }
   
    
     @Override
    public String log_in(String id, String pass) throws RemoteException {
 String a = "" ;
    try{

              
	LogServer.cnx();
          String req = "select * from utilisateur2 where Utilisateur='"+id+"'and Mot_De_Passe ='"+pass+"'";
		// 		out.print(req);
ResultSet hou =stt.executeQuery(req);
                           while(hou.next()){
                               a="1";
                          
                           }
                                 
        
    }
    catch (Exception e){
    System.out.println(e);
    a="2";
    
    }
         
   return a ;
    }
  
    
    
    
    
    public static void main (String args[]){
    try{
    Registry reg = LocateRegistry.createRegistry(1099); 
    reg.rebind("logserver", new LogServer());
    System.out.print("Le Serveur Est Prêt !");
    javax.swing.JOptionPane.showMessageDialog(null,"   Le Serveur Est Prêt");
    
    }
    
    
    catch(Exception e){ System.out.println(e);
    javax.swing.JOptionPane.showMessageDialog(null,"Le serveur ne peut pas demarre.\n erreur :"+e);
    }
    }

    @Override
    public String consult(String id) throws RemoteException {
        throw new UnsupportedOperationException("Ne Supporte pas."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public boolean utilisateur(int id, String pass, String util) throws RemoteException {
        throw new UnsupportedOperationException("Ne Supporte pas."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
