package facade;


public class Main {
    public static void main(String[] args) {
        MediaConverterFacade facade = new MediaConverterFacade();


        try {
            facade.convert("sample.mov", "mp4");
            facade.convert("song.wav", "mp3");
            facade.convert("photo.heic", "jpg");
        } catch (ConversionException e) {
            System.err.println("Conversion failed: " + e.getMessage());
        }
    }
}