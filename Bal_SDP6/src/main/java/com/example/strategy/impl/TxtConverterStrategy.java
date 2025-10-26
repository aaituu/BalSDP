package com.example.strategy.impl;

import com.example.model.Document;
import com.example.strategy.ConverterStrategy;

/**
 * save as plain text.
 */
public class TxtConverterStrategy implements ConverterStrategy {

    @Override
    public String convert(Document document) {
        return document.content();
    }

    @Override
    public String getFormatName() {
        return "TXT";
    }
}
