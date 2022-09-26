package main.java.design.principle.CARP;

public class MySQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "MySQL Connection";
    }
}
