package facade;

public final class MediaData {
    private final String format;
    private final byte[] payload;


    public MediaData(String format, byte[] payload) {
        this.format = format;
        this.payload = payload == null ? new byte[]{} : payload.clone();
    }


    public String getFormat() { return format; }
    public byte[] getPayload() { return payload.clone(); }
}