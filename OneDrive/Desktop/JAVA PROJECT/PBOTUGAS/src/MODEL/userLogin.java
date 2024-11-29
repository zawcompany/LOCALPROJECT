/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

/**
 *
 * @author ASUS
 */
public class userLogin extends User{
    public userLogin(String username, String password, String email, String profilePict) {
        super(username, password, email, profilePict);
    }
    public void login() {
        System.out.println("User " + getUsername() + " logged in.");
    }
}
    

