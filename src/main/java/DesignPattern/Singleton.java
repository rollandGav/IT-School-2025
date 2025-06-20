package DesignPattern;

class DatabaseConnection{
    private String connectionString;
    private static DatabaseConnection instance;

    private DatabaseConnection(){
        connectionString = "jdbc:mysql://localhost:3306/db";
    }

    public static synchronized DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void connect(){
        System.out.println("Connects to : " + connectionString);
    }
}

public class Singleton {
    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getInstance();
        db.connect();
        System.out.println(db);
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        System.out.println(db2);
    }
}
