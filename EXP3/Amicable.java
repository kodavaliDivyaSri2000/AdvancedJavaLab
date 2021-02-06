import java.rmi.*;

public interface Amicable extends Remote {
//declaring abstract method
public String amicable(int a,int b) throws RemoteException;
  }