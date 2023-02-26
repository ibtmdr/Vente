package Module;
import java.sql.*;
// Code de connexion avec une base de donné

public class main {

	public static void main(String[] args) {
		
		
		try {
			// Telechargement de driver JDBC:(outil) permet d'etablir la connection avec la base de donnés
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Etablir la connexion avec le serveur mysql local dont la base de donnes ecole en ajoutant login et mot de passe
			
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ecole", "root", "Ibtissam@12345");
			
			// Porteur de requette sql
			Statement stmt = con.createStatement();
			// Executer la requette sql , met le retour dans result state 
			ResultSet resultats = stmt.executeQuery("SELECT * FROM notation");
		
			// lire le resultat ligne par ligne
			while(resultats.next())  
				System.out.println(resultats.getString(1)+"  "+resultats.getString(2)+"  "+resultats.getInt(3));  

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
