/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teknikinformatika;

import java.sql.Connection;

/**
 *
 * @author Kii
 */
public class Koneksi {
    private static Connection connection;
    public static Connection getConnection(){
        if (connection == null){
            
        }
        return connection;
    }
}
