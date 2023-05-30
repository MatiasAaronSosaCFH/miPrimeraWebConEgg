
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 54117
 */
public class Archivo {

    public static void main(String[] args) {
        FileInputStream serviceAccount;
        try {
            serviceAccount = new FileInputStream("path/to/serviceAccountKey.json");
        
        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://miproyect-d6a44-default-rtdb.firebaseio.com")
                .build();
        FirebaseApp.initializeApp(options);

        if(options == null){
            System.out.println("No se conecto ");
        }else{
            System.out.println("Se conecto");
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
}