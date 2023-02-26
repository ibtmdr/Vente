package Module;
import java.sql.*;

public class vente {

	public static void main(String[] args) {
				
				
				try {
					
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/vente", "root", "Ibtissam@12345");
				     Statement stmt = con.createStatement();
				     
				     ResultSet resultats = stmt.executeQuery("SELECT * FROM client");
				
				     System.out.println("clients :");
					while(resultats.next())  
						System.out.println(resultats.getString(1)+"  "+resultats.getString(2)+"  "+resultats.getString(3));  
                    
					resultats = stmt.executeQuery("SELECT * FROM commande");
				
					
					  System.out.println("commandes :");
						while(resultats.next())  
						System.out.println(resultats.getString(1)+"  "+resultats.getString(2)+"  "+resultats.getString(3));  

				} catch (SQLException e) {
					System.out.println(e.getMessage());
				} catch (ClassNotFoundException e) {
					System.out.println(e.getMessage());
				}

			}

		

		

	}


