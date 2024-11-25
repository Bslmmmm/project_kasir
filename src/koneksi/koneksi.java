package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection koneksi;

    public static Connection getKoneksi() {
        if (koneksi == null) {
            try {
            String url="jdbc:mysql://localhost:3306/kasir_kelontong";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, pass);
            System.out.println("Berhasil Terhubung");
        } catch (Exception e) {
            System.out.println("Error");
        }
            }
        return koneksi;
        }
    }

    public static void main(String[] args) {
        getKoneksi();
    }
}
