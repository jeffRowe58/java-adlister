import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class jdbcLec {
    public static void main(String[] args) throws SQLException {

        Config config = new Config();
        //Instantiate the MySQL Driver to register the built in Java Driver Manager

        DriverManager.registerDriver(new Driver());

        //Connect to the database by providing the URL, user, and password of the user we want to connect as

        Connection connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword());

        //Create a statement object to execute queries
        Statement statement = connection.createStatement();

        //We can use the Statement object to make our queries

        //Returns a boolean indicating success
//        statement.execute("DELETE FROM albums WHERE id = 4");

        //Returns the number of rows affected
//        statement.executeUpdate("INSERT INTO albums (artist, name, release_date, genre, sales) VALUES('Nelly Furtado', 'Loose', 2006, 'Dance-pop, hip hop, R&B', 12.5)");

        //Returns a Resultset object
//        statement.executeQuery("SELECT * FROM albums");

        //Handling the results with the ResultSet object
        String selectQuery = "SELECT * FROM albums";
        ResultSet rs = statement.executeQuery(selectQuery);

        //By calling the .next() method we van iterate over the rows.
        //The method will return as true as long as there are rows left in our results

        while(rs.next()){
            //do something with each row
            System.out.println("Here's an album: ");
            System.out.println(" id:" + rs.getLong("id"));
            System.out.println(" artist:" + rs.getString("artist_name"));
            System.out.println(" album:" + rs.getString("album_name"));
        }

        //INSERT query
//        String insertQuery = "INSERT INTO albums (artist_name, album_name, release_date, genre, sales_number) VALUES('Nelly Furtado', 'Loose', 2006, 'Dance-pop, hip hop, R&B', 12.5)";

        //For executeUpdate method, we can have two arguments:
        //First is the Query String we want execute.
        //Second is a constant from the Statement object.
        //This gives us access to the ID's that are automatically generate by the database


//        statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);

        //We can then use the getGeneratedKeys method on the Resultset object which will hold any ID's by the database

//        ResultSet rsKeys = statement.getGeneratedKeys();

//        if(rsKeys.next()){
//            System.out.println("Inserted a new record. New ID: " + rsKeys.getLong(1));
//        }
    }
}
