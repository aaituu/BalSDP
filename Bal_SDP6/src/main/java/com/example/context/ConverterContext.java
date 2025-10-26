package com.example.context;

import com.example.model.Document;
import com.example.strategy.ConverterStrategy;

/**
 * Context: manage strategy and make convertation
 */
public class ConverterContext {
    private ConverterStrategy strategy;

    public ConverterContext(ConverterStrategy initialStrategy) {
        setStrategy(initialStrategy);
    }

    public void setStrategy(ConverterStrategy strategy) {
        if (strategy == null) {
            throw new IllegalArgumentException("Strategy cannot be null");
        }
        this.strategy = strategy;
    }

    public ConverterStrategy getStrategy() {
        return strategy;
    }

    public String convert(Document document) {
        return strategy.convert(document);
    }
}
