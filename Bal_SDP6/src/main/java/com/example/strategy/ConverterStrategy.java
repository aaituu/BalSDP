package com.example.strategy;

import com.example.model.Document;

/**
 * Strategy interface: convertation methods of a document
 */
public interface ConverterStrategy {
    String convert(Document document);
    String getFormatName();
}
