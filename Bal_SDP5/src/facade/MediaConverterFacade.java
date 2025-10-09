package facade;

/**
 * Facade that provides a simple API for converting media files.
 * Hides the complex interactions between readers, encoders and writers.
 */
public class MediaConverterFacade {
    private final FileReader reader = new FileReader();
    private final Decoder decoder = new Decoder();
    private final Encoder encoder = new Encoder();
    private final FileWriter writer = new FileWriter();


    /**
     * Convert input file to desired output format.
     * @param inputPath Path to the source file
     * @param outputFormat Desired format (e.g. "mp4", "mp3", "jpg")
     */
    public void convert(String inputPath, String outputFormat) throws ConversionException {
        validate(inputPath, outputFormat);


        MediaFile raw = reader.read(inputPath);
        MediaData decoded = decoder.decode(raw);
        MediaData encoded = encoder.encode(decoded, outputFormat);
        writer.write(encoded, replaceExtension(inputPath, outputFormat));


        System.out.println("Converted '" + inputPath + "' -> '" + replaceExtension(inputPath, outputFormat) + "'");
    }


    private void validate(String inputPath, String outputFormat) throws ConversionException {
        if (inputPath == null || inputPath.isBlank()) throw new ConversionException("Input path is empty");
        if (outputFormat == null || outputFormat.isBlank()) throw new ConversionException("Output format is empty");
    }


    private String replaceExtension(String inputPath, String outputFormat) {
        int idx = inputPath.lastIndexOf('.');
        String base = (idx == -1) ? inputPath : inputPath.substring(0, idx);
        return base + "." + outputFormat;
    }
}