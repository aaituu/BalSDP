package facade;

/** Decodes a MediaFile into an intermediate MediaData representation. */
public class Decoder {
    public MediaData decode(MediaFile file) {
        System.out.println("[Decoder] Decoding " + file.getPath() + " (type=" + file.getType() + ")");
// Simulate decoding
        MediaData data = new MediaData(file.getType(), new byte[]{});
        return data;
    }
}