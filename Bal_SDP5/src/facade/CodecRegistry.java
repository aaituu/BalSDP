package facade;

import java.util.Set;


/** Registry for supported codecs/formats. Keeps single responsibility. */
public final class CodecRegistry {
    private static final Set<String> SUPPORTED = Set.of("mp4", "mp3", "jpg", "png", "avi", "wav");


    private CodecRegistry() {}


    public static boolean isSupported(String format) {
        return SUPPORTED.contains(format.toLowerCase());
    }
}
