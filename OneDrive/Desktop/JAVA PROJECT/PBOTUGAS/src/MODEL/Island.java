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
public class Island {
    private String islandName;
    private List<Province> provinces;

    public Island(String islandName, List<Province> provinces) {
        this.islandName = islandName;
        this.provinces = provinces;
    }

    public String getIslandName() {
        return islandName;
    }

    public void setIslandName(String islandName) {
        this.islandName = islandName;
    }

    public List<Province> getProvinces() {
        return provinces;
    }

    private static List<String> islands = new ArrayList<>();
    
    static {
        islands.add("Sumatera");
        islands.add("Sulawesi");
        islands.add("Jawa");
        islands.add("Kalimantan");
        islands.add("Bali");
        islands.add("NTT");
        islands.add("NTB");
        islands.add("Maluku");
        islands.add("Papua");
    }

    public static String searchIsland(String keyword) {
        for (String island : islands) {
            if (island.toLowerCase().contains(keyword.toLowerCase())) {
                return island;  // Pulau ditemukan
            }
        }
        return null; 
    }

}

