package facade;

/** Writes converted media to disk (simulated). */
public class FileWriter {
    public void write(MediaData data, String outputPath) {
        System.out.println("[FileWriter] Writing to " + outputPath + " (format=" + data.getFormat() + ")");
// Simulated write (no real IO in this simplified example)
    }
}
