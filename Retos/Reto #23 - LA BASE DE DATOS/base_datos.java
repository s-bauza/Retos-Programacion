import java.sql.*;


public class base_datos {

    private static final String Host = "mysql-5707.dinaserver.com";
    private static final int Port = 3306;
    private static final String User = "mouredev_read";
    private static final String Password = "mouredev_pass";
    private static final String Database = "moure_test";

    private static Connection conn;
    public static void main(String[] args) throws Exception {

        System.out.println("Connecting to the database...");
        
        Class.forName("com.mysql.cj.jdbc.Driver");
       
        String url = "jdbc:mysql://" + Host + ":" + Port + "/" + Database;
       
        conn = DriverManager.getConnection(url, User, Password);
        
        System.out.println("Database connected successfully!");

        

        view_info("challenges");
        excercie_solution("challenges");

        conn.close();
    }

    public static void view_info(String table) throws SQLException {
        
        DatabaseMetaData metaData = conn.getMetaData();
        ResultSet tables = metaData.getTables(null, null, "%", null);
        
        while (tables.next()) {
            String tableName = tables.getString("TABLE_NAME");
            if (tableName.equals(table)) {
                System.out.println("Table: " + tableName);
                ResultSet columns = metaData.getColumns(null, null, tableName, null);
                while (columns.next()) {
                    String columnName = columns.getString("COLUMN_NAME");
                    String columnType = columns.getString("TYPE_NAME");
                    System.out.println("  Column: " + columnName + " (" + columnType + ")");
                }
                columns.close();
            }
        }
        tables.close();
    }

    public static void excercie_solution(String table) throws SQLException {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String query = "SELECT * FROM " + table;
        
        stmt = conn.prepareStatement(query);
        rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Difficulty: " + rs.getString("difficulty"));
            System.out.println("Date: " + rs.getTimestamp("date"));
            System.out.println("------------------------------");
            
        }


    }
}