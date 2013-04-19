


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import Resources.User;
import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public class UserList {
    User currentUser;
    private ArrayList<User> userList = new ArrayList<>();
        
    public User getCurrentUser(int i){
        currentUser = userList.get(i);
        return currentUser;
    }
    
    public void addToUserList(String id, String pw, int pou){
        userList.add(new User(id,pw,pou));
    }

    public String getUserName(){
        return ""+currentUser.getId();
    }
    
    public String getUserPassword(){
        return ""+currentUser.getPw();
    }
    
    public int getUserPowerOfUser(){
        return currentUser.getPou();
    }
    
    public void editUserid(String id){
        currentUser.setId(id);
    }
    
    public void editUserPassword(String pw){
        currentUser.setPw(pw);
    }
    
    public void editUserPowerOfUser(int pou){
        currentUser.setPou(pou);
    }
    
    
}


