package com.example.strategy.impl;

import com.example.model.Document;
import com.example.strategy.ConverterStrategy;

/**
 * imitation of convertation to DOCX.
 */
public class DocxConverterStrategy implements ConverterStrategy {

    @Override
    public String convert(Document document) {
        return String.format("[DOCX]\nFile: %s\nContent:\n%s\n",
                document.fileName(), document.content());
    }

    @Override
    public String getFormatName() {
        return "DOCX";
    }
}
