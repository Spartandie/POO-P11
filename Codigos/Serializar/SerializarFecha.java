/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializar;

/**
 *
 * @author spart
 */
public class SerializarFecha {
    /**
     * 
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {
        Serializador serializador = new Serializador();
        Thread.sleep(5*1000);
        DesSerializador des = new DesSerializador();
    }
    
}
