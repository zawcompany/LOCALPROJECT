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
public class searchManagement {
    private String query;
    private List<Object> result;

    public searchManagement(String query) {
        this.query = query;
        this.result = new ArrayList<>();
    }

    public List<Object> search(List<Province> provinces) {
        System.out.println("Searching for: " + query);
        result.clear();
        for (Province province : provinces) {
            // Periksa kecocokan string secara langsung (case-sensitive)
            if (province.getName() != null && province.getName().contains(query)) {
                result.add(province);
            }
        }
        return result;
    }
}

