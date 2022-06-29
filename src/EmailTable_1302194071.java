/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalmod8_1302194071; //nama packages

/**
 *
 * @author Adam_1302194071
 */
public class EmailTable_1302194071 {
    public static final String NAMA= " email ", KODE= " id ", SEND= " sender ", SUBJEK= " subject ", KONTEN= " content ", 
            TGL= " datetime ", STAR= " starred ";
    
    private static void outputQueryCreate_1302194071() {
        System.out.println(" Query pembuatan tabel emails : " );
        System.out.println(" CREATE TABLE " + Nama + " (");
        System.out.println(" email_id INT PRIMARY KEY ");
        System.out.println(" from VARCHAR(100), ");
        System.out.println(" subject VARCHAR(100), ");
        System.out.println(" date_time DATETIME, ");
        System.out.println(" starred INT(1) DEFAULT 0 ");
        System.out.println(");");
    }
}
