/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcadagua;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.naming.Context;
import java.util.Arrays;
import java.util.List;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.commons.lang.ArrayUtils;



/**
 *
 * @author asus
 */
public class MarcaDagua {

 
    
    public static void main(String[] args) throws IOException, UnsupportedLookAndFeelException {
              
        ImportarFotos i = new ImportarFotos();
        i.show();
    }
    
    

}
