package facade;

/** Simple responsibility: read a file and produce a MediaFile object. */
public class FileReader {
    public MediaFile read(String path) {
// In a real app: check file existence, read bytes, detect type.
        System.out.println("[FileReader] Reading " + path);
        String detectedType = detectType(path);
        return new MediaFile(path, detectedType, new byte[]{});
    }


    private String detectType(String path) {
        int idx = path.lastIndexOf('.');
        if (idx == -1) return "unknown";
        return path.substring(idx + 1).toLowerCase();
    }
}
