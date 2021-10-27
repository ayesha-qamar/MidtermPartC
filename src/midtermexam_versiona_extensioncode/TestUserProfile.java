/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author qamar
 */
public class TestUserProfile {
     public static void main(String[] args) {
         //added comment to show commit
         //commit 2
    Scanner sc = new Scanner(System.in);
    String userID;
    String genre;
    boolean valid = false;
    while (!valid) {
    UserProfile up1 = new UserProfile();
    System.out.println("Please enter your name as user ID:");
    userID = sc.nextLine();
    up1.setUserID(userID);
    System.out.println("Please enter your favorite genre: \nChoose from the following list " + up1.showGenres() );
    genre= sc.nextLine();
    up1.setGenre(genre);
    valid = up1.isValidGenre(genre);
     if (valid) {
         System.out.println("Your profile has been created");
     }
     else {
                System.out.println("Please try again");
            }
    
}
     }
}