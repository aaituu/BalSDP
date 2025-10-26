package com.example.strategy.impl;

import com.example.model.Document;
import com.example.strategy.ConverterStrategy;

/**
 * imitation of converting to PDF.
 */
public class PdfConverterStrategy implements ConverterStrategy {

    @Override
    public String convert(Document document) {
        StringBuilder sb = new StringBuilder();
        sb.append("%PDF-HEADER\n");
        sb.append("File: ").append(document.fileName()).append("\n");
        sb.append("--- PDF CONTENT START ---\n");
        sb.append(document.content()).append("\n");
        sb.append("--- PDF CONTENT END ---\n");
        sb.append("%PDF-FOOTER\n");
        return sb.toString();
    }

    @Override
    public String getFormatName() {
        return "PDF";
    }
}
