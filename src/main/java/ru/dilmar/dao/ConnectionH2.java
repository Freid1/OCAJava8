package ru.dilmar.dao;

import java.sql.*;

public  class ConnectionH2 {

    public Connection getDaoConnection() {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:h2:D:\\Програмирование\\AProjects\\DataBase\\homedb","dmitry","12345");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void main(String[] args) {
        ConnectionH2 connectionH2=new ConnectionH2();
        Connection conn=connectionH2.getDaoConnection();
        Statement st = null;
        try {
            st = conn.createStatement();
            st.execute("INSERT INTO NEW VALUES(default,'HELLO')");
            st.execute("INSERT INTO NEW(NAME) VALUES('JOHN')");

        } catch (SQLException e1) {
            e1.printStackTrace();
        }


        String name1 = "Jack";
        String q = "insert into NEW(name) values(?)";
        PreparedStatement st1 = null;

        try {
            st1 = conn.prepareStatement(q);
            st1.setString(1, name1);
            st1.execute();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        ResultSet result;

        try {
            result = st.executeQuery("SELECT * FROM NEW");
            while (result.next()) {
                String name = result.getString("name");
                System.out.println(result.getString("name_id")+" "+name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
