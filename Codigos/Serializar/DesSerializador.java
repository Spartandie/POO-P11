/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

/**
 *
 * @author spart
 */
public class DesSerializador {
    /**
     * Des serializador
     */
    public DesSerializador() {
        Date d = null;
        
        try{
            FileInputStream fis = new FileInputStream("objetoDate.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d = (Date) ois.readObject();
            ois.close();
        }catch(IOException ioe){
        }catch(ClassNotFoundException cnfe){}
        System.out.println("Objeto Deserializado");
        System.out.println(d);
        d = new Date();
        System.out.println("La fecha actual es: "+d);
    }
    
}
