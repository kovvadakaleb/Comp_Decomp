package comp_decomp;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;


public class Decompressor {
    public static void method(File file) throws IOException {
        String fileDirectory = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzis = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory+"/DecompressedFile");

        byte [] buffer = new byte[1024];
        int length;
        while((length=gzis.read(buffer))!=-1) {
            fos.write(buffer, 0, length);
        }
        gzis.close();
        fos.close();
        fis.close();
    }
}
