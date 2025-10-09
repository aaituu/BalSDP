package facade;

public class Encoder {
    public MediaData encode(MediaData source, String targetFormat) throws ConversionException {
        System.out.println("[Encoder] Encoding to " + targetFormat);
        if (!CodecRegistry.isSupported(targetFormat)) {
            throw new ConversionException("Unsupported output format: " + targetFormat);
        }
// Simulate encoding
        return new MediaData(targetFormat, new byte[]{});
    }
}