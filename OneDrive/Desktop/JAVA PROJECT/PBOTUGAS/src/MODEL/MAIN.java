/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author ASUS
 */
import GUI.BERRANDAFIX;
import GUI.WELCOME;
import java.util.ArrayList;
import java.util.List;

public class MAIN {
    public class Main {
        public static List<User> userList = new ArrayList<>();
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new WELCOME().setVisible(true); 
        }
    });
}
}

}


