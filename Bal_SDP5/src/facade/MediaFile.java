package facade;

public final class MediaFile {
    private final String path;
    private final String type;
    private final byte[] content;


    public MediaFile(String path, String type, byte[] content) {
        this.path = path;
        this.type = type;
        this.content = content == null ? new byte[]{} : content.clone();
    }


    public String getPath() { return path; }
    public String getType() { return type; }
    public byte[] getContent() { return content.clone(); }
}
