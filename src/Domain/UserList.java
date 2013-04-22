


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import GatewayMapper.Facade;
import Resources.User;
import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public class UserList {
    User currentUser;
    Facade facade = new Facade();
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
    
    public void ClearUserList(){
        userList.clear();
    }
    
    public int getUserListSize(){
        return userList.size();
    }
    
    public boolean checkUserNPw(String id, String pw){
        currentUser = null;
       boolean succes = false;
        for (int i = 0; i < getUserListSize(); i++) {
            getCurrentUser(i);   
            if(getUserName().equals(id) && getUserPassword().equals(pw)){
                    currentUser = getCurrentUser(i);
                        succes = true;
            }
          }
        
        return succes;
    }
    //facade
    public boolean buildUserListFromDB(UserList user){
        return facade.buildUserList(user);
    }
    
    public boolean addUserToDB(String id, String pw, int pou){
        return facade.addUser(id,pw,pou);
    }
    
    public boolean editUserInDB(String id, String pw, int pou){
        return facade.editUser(id,pw,pou);
    }
    
}


