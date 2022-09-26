package main.java.design.principle.CARP;

public class ProductDao {
    //1.直接使用setter注入达到目的，但不够抽象，业务扩展时不能保证
//    private DBConnection dbConnection;
//
//    public void setDbConnection(DBConnection dbConnection) {
//        this.dbConnection = dbConnection;
//    }
//
//    public void addProduct(){
//        String conn = dbConnection.getConnection();
//        System.out.println("使用" + conn);
//    }
}
