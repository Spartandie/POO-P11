/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 *
 * @author spart
 */
public class Serializador {
    /**
     * Serializador
     */
    public Serializador() {
        Date d = new Date();
        System.out.println(d);
        
        try{
        
            FileOutputStream fos = new FileOutputStream("objetoDate.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(d);
            oos.close();
            
        }catch(IOException ioe){}
    }
    
}
