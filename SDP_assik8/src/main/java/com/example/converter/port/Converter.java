package com.example.converter.port;

import com.example.converter.model.Document;

public interface Converter {
    void convert(Document doc);
    String supportedFormat();
}
