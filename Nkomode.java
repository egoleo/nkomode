import java.awt.Toolkit.*;

import java.util.*;

import ymsg.network.*;


public class Nkomode {
     private Session session;
     
     public Nkomode() {
          session = new Session();
          
          session.addSessionListener(new NkomodeSessionListener());
          
          try {
               //login as a user
               String username = "egoli10";
               String password = "leopablo";
               
               session.login(username, password);
               
               int session_Status = session.getSessionStatus();
               long user_Status = session.getStatus();
               
               YahooGroup[] yahoo_Group = session.getGroups();
               
               for(int i = 0; i < yahoo_Group.length; i++) {
                    //get the yahoo group names
                    String group = yahoo_Group[i].getName();
                    
                    System.out.println("\n[ " + group.toString() + " ]\n");
                    
                    Vector vector = yahoo_Group[i].getMembers();
                    
                    Iterator iterator = vector.iterator();
                    
                    while(iterator.hasNext()) {
                         String str = iterator.next().toString();
                         int index = str.indexOf(" ");
                         String userid = str.substring(0, index);
                         String user = userid.substring(3);
                         
                         System.out.println(user);
                    }
                    
                    //send message here TODO
                    if(user_Status == 0) {
                         System.out.println("User " + username + " is login");
                    }
               }
          } catch (Exception io) {
               io.printStackTrace();    
          }
     }
     
     public static void main(String args[]) {
          new Nkomode();    
     }
}