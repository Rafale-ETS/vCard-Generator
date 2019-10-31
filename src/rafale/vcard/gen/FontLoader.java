/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafale.vcard.gen;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Erdna
 */
public class FontLoader {

    Font ft;
    
    public FontLoader(String fontLoc) throws FontFormatException, IOException {
        File fl = new File(fontLoc);
        ft = Font.createFont(Font.TRUETYPE_FONT, fl);
    }
    
    public Font getFont(int style, float size){
        return ft.deriveFont(style, size);
    }
    
}
