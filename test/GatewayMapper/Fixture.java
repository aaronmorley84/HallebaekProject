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
public class Fixture {
    
    public static void setUp(Connection con) {
		try {
			
			Statement st = con.createStatement();

			// start transaction
			con.setAutoCommit(false);

			// create table
			
			st.addBatch("delete from order");

			// insert tuples
			String insert = "insert into parts values ";
			st.addBatch(insert+"(10506,'Land Before Time I',200,19.99,20) ");
			st.addBatch(insert+"(10507,'Land Before Time II',156,19.99,20)");
			st.addBatch(insert+"(10508,'Land Before Time III',190,19.99,20)");
			st.addBatch(insert+"(10509,'Land Before Time IV',60,19.99,20)");
			st.addBatch(insert+"(10601,'Sleeping Beauty',300,24.99,20)");
			st.addBatch(insert+"(10701,'When Harry Met Sally',120,19.99,30)");
			st.addBatch(insert+"(10800,'Dirty Harry',140,14.99,30)");
			st.addBatch(insert+"(10900,'Dr. Zhivago',100,24.99,30)");

			int[] opcounts = st.executeBatch();
			

			// end transaction
			con.commit();
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println("Fail in Fixture.setup()");
			System.out.println(e.getMessage());
		}
	}
    
}
