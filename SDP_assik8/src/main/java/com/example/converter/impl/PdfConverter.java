package com.example.converter.impl;

import com.example.converter.model.Document;
import com.example.converter.port.Converter;

/**
 * Pretends to convert to PDF.
 * Real life? It would write bytes. Here we just print.
 */
public final class PdfConverter implements Converter {
    @Override
    public void convert(Document doc) {
        System.out.println("[PdfConverter] Converted '" + doc.getFileName() + "' to PDF.");
    }

    @Override
    public String supportedFormat() {
        return "pdf";
    }
}
