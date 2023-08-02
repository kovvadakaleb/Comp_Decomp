/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decomp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author User
 */
public class Decompress {
    
    public static void method(File file) throws IOException{
        String currentdirectory = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gis = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(currentdirectory+"/decompressedfile");
        
        byte arr[] = new byte[1024];
        int length;
        while((length=gis.read(arr))!=-1){
            fos.write(arr,0,length);
        }
        gis.close();
        fis.close();
        fos.close();
        
    }
}
