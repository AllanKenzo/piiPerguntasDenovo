package com.mycompany.mantendoperguntas;
import java.sql.*;
public class ConnectionFactory {
    static Connection obterConexao()throws Exception {
        String host = "localhost";
        String porta = "3306";
        String database = "jogo";
        String usuario = "root";
        String senha = "avhst1307"; 
        String stringConexao = String.format(
            "jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=America/Sao_Paulo",
            host,
            porta,
            database
        );
        return DriverManager.getConnection(
                stringConexao,
                usuario,
                senha
        );
        //cláusula catch or declare   
    }
}
