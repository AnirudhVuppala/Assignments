package org.example.Singleton;

class DBConnection {
    private static DBConnection instance;

    private DBConnection() {
        System.out.println("DBConnection object created.");
    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }
}




