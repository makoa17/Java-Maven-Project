/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.Map;

/**
 *
 * @author makoal
 */
public class Details {
    CollectionReference ref;
    static Firestore db;
    
    public static boolean move(String collection, String doc,
            Map<String, Object> data){
        db = FirestoreClient.getFirestore();
        try
        {
            DocumentReference docRef = db.collection(collection).document(doc);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("data connected");
            return true;
        }catch(Exception e)
        {
            System.out.println("Error "+e.getMessage());
        }
        return false;
    }
}
