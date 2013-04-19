package Resources;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kris
 */
public class User {
    private String id, pw;
   private int pou;
    
    public User(String id, String pw, int pou){
        this.id = id;
        this.pw = pw;
        this.pou = pou;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public int getPou() {
        return pou;
    }

    public void setPou(int pou) {
        this.pou = pou;
    }
}
