
package com.mycompany.test;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author makoal
 */
public class Connection {
    public static Firestore db;
    
    public static void counterFiredase()
    {
        try 
        {
            FileInputStream sa = new FileInputStream("yourfirebasejson.json");
            //FileInputStream serviceAccount =
            //new FileInputStream("path/to/serviceAccountKey.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
              .setCredentials(GoogleCredentials.fromStream(sa))
              //.setDatabaseUrl("yourfirebasedatabaselink")
              .build();

            FirebaseApp.initializeApp(options);
            db = FirestoreClient.getFirestore();
            System.out.println("Connected");
            String con= "Connected";
            GUProject one = new GUProject(con);
            one.setVisible(true);
        }catch (IOException ex) 
        {
            System.out.println(ex);
        }
    }
}
