/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comp_decomp;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author User
 */
public class Compressor {
    
    public static void method(File file) throws IOException  {
        String currentdirectory = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(currentdirectory+"/Compressedfile.gz");
        GZIPOutputStream gzos = new GZIPOutputStream(fos);
        
        byte arr[] = new byte[1024];
        int length;
        while((length=fis.read(arr))!=-1){
            gzos.write(arr,0,length);
        }
        
        gzos.close();
        fis.close();
        fos.close();
        
    } 
}
