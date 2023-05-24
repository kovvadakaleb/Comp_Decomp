package comp_decomp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.util.zip.GZIPOutputStream;

public class Compressor {
    public static void method(File file) throws IOException{
        String fileDirectory = file.getParent();
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(fileDirectory+"/CompressedFile.gz");
        GZIPOutputStream gzos = new GZIPOutputStream(fos);

        byte [] buffer = new byte[1024];
        int length;
        while((length=fis.read(buffer))!=-1) {
            gzos.write(buffer, 0, length);
        }
        gzos.close();
        fos.close();
        fis.close();
        }
    }

