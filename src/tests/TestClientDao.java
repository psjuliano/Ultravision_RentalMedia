
package tests;

import DAO.ClientDAO;
import DAO.ConnectionClass;
import DAO.MediaDAO;
import controller.ClientsRegister;

/**
 *
 * @author Priscila
 */
public class TestClientDao {
    public static void main(String[] args) {
        ClientsRegister client = new ClientsRegister();
        
        client.setName("Lucas");
        client.setEmail("l@hotmail.com");
        client.setBankName("aib");
        client.setBankCard(123);
        client.setPlanStatus("ok");
        client.setBalance(0);
        client.setBonus(10);
        client.setNotes("hehehe");
       // client.setBankCard(2);
        
        
      //System.out.println("Os dados foram salvos? " + ClientDAO.insert(client));
        
      //System.out.println(MediaDAO.list());
      //System.out.println(ClientDAO.list());
      // System.out.println("***********************");
        
        
        //ConnectionClass.getConnectionClass();
        //client.setIdMembership("12");
        System.out.println(ClientDAO.update(client));
        System.out.println(ClientDAO.delete("12"));
        
    }
    
    
}
