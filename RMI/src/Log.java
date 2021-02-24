
import java.rmi.Remote;
import java.rmi.RemoteException;


public interface Log extends Remote {
   public String log_in (String util, String pass) throws RemoteException ;
   public String consult(String id) throws RemoteException;
    public boolean utilisateur(int id, String pass,  String util) throws RemoteException ;

}
