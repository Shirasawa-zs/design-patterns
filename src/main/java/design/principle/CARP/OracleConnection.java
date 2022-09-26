package main.java.design.principle.CARP;

public class OracleConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "oracle Connection";
    }
}
