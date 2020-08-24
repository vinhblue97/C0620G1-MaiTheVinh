package binary_file_serialization.exercise.copy_File;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;

class CopyFile {
    public void copyFile(File source, File dest) throws IOException {
        FileInputStream is = null;
        FileOutputStream os = null;
        try {
            if (!source.exists()) {
                throw new FileNotFoundException();
            }
            if (dest.exists() && dest.equals(source)) {
                throw new FileAlreadyExistsException(dest.getPath());
            }
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length = 0;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } catch (FileAlreadyExistsException e) {
            System.err.println("Dest file has alreally existed");
        } catch (FileNotFoundException i) {
            System.err.println("File source not found");
        } finally {
            assert is != null;
            is.close();
            assert os != null;
            os.close();
        }

    }
}
