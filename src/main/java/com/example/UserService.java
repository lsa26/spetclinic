package com.example;

import java.util.List;
import java.util.ArrayList;

public class UserService {

    public List<String> getActiveUsers(List<String> allUsers) {
        List<String> activeUsers = new ArrayList<>();
        
        for (String user : allUsers) {
            if (user != null && user.length() > 0) {
                // Bug subtil : ajoute TOUS les utilisateurs non-vides
                // au lieu de vérifier s'ils sont "actifs"
                activeUsers.add(user);
            }
        }
        
        return activeUsers;
    }
    
    // Méthode manquante pour vérifier le statut
    private boolean isUserActive(String username) {
        // L'IA devrait détecter que cette méthode n'est pas utilisée
        return !username.startsWith("INACTIVE_");
    }
}
