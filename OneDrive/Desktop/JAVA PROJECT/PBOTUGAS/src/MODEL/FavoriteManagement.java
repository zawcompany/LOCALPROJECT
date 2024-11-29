/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODEL;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class FavoriteManagement {
    private List<Destination> favoriteDestination;

    public FavoriteManagement() {
        this.favoriteDestination = new ArrayList<>();
    }

    public void addFavorite(Destination destination) {
        favoriteDestination.add(destination);
        System.out.println("Added to favorites: " + destination.getName());
    }

    public void removeFavorite(Destination destination) {
        favoriteDestination.remove(destination);
        System.out.println("Removed from favorites: " + destination.getName());
    }

}

