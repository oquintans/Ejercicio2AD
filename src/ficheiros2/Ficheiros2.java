/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheiros2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oracle
 */
public class Ficheiros2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            FileInputStream fich = new FileInputStream("texto1.txt");
            FileOutputStream fich2 = new FileOutputStream("texto2.txt", true);
            int fichleer;
            while ((fichleer = fich.read()) != -1) {

                fich2.write(fichleer);
            }
            fich.close();
            fich2.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ficheiros2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ficheiros2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
