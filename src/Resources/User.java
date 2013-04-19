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
    private char id, pw;
   private int pou;
    
    public User(char id, char pw, int pou){
        this.id = id;
        this.pw = pw;
        this.pou = pou;
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public char getPw() {
        return pw;
    }

    public void setPw(char pw) {
        this.pw = pw;
    }

    public int getPou() {
        return pou;
    }

    public void setPou(int pou) {
        this.pou = pou;
    }
}
