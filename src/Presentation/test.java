/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Domain.Controller;

/**
 *
 * @author andrew
 */
public class test {
    
    public static void main(String args[]){
        test t = new test();
        t.testForAaron();
    }
    
    public void testForAaron(){
        Controller con = new Controller();
        con.buildOrderList();
      //  con.addItemToOrderList(1," ",2,2,"",3,3,0);
    }
    
}
