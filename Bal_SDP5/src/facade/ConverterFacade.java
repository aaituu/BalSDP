package facade;

import subsystem.FileReader;
import subsystem.FileConverterSystem;
import subsystem.FileSaverSystem;

public class ConverterFacade {
    private FileReader reader;
    private FileConverterSystem converter;
    private FileSaverSystem saver;

    public ConverterFacade() {
        this.reader = new FileReader();
        this.converter = new FileConverterSystem();
        this.saver = new FileSaverSystem();
    }

    public void convertFile(String inputPath, String inputFormat, String outputFormat, String outputPath) {
        reader.read(inputPath);
        converter.convert(inputFormat, outputFormat);
        saver.save(outputPath);
        System.out.println("[FACADE] Conversion finished!");
    }
}
