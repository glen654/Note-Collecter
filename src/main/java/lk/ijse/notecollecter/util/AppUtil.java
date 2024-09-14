package lk.ijse.notecollecter.util;

import java.util.Base64;
import java.util.UUID;

public class AppUtil {
    public static String generateNoteId(){

        return "NOTE-" + UUID.randomUUID();
    }

    public static String generateUserId(){

        return "USER-" + UUID.randomUUID();
    }

    public static String profilePicToBase64(String profilePic){
        return Base64.getEncoder().encodeToString(profilePic.getBytes());
    }

}
