package com.example;

import java.util.List;
import java.util.ArrayList;

public class UserService {

    public List<String> getActiveUsers(List<String> allUsers) {
        List<String> activeUsers = new ArrayList<>();
        
        for (String user : allUsers) {
            if (user != null && user.length() > 0) {
                // Bug subtil : ajoute TOUS les utilisateurs non-vides
                activeUsers.add(user);
            }
        }
        
        // 💥 ERREUR DE COMPILATION AJOUTÉE
        return activeUsers.undefined();  // Méthode inexistante
    }
    
    private boolean isUserActive(String username) {
        return !username.startsWith("INACTIVE_");
    }
}
