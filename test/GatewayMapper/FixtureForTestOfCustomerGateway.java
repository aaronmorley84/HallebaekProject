/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GatewayMapper;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Andrew
 */
public class FixtureForTestOfCustomerGateway {
    
    public static void setUp(Connection con) {
		try {
			
			Statement st = con.createStatement();

			// start transaction
			con.setAutoCommit(false);

			// create table			
                        
			// insert tuples
			                        
			// end transaction
			con.commit();
                        
                        
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("Fail in FixtureForTest.setup()");
			System.out.println(e.getMessage());
		}
	}
    
}
