package com.example.converter;

import com.example.converter.impl.PdfConverter;
import com.example.converter.model.Document;
import com.example.converter.observer.ConsoleObserver;
import com.example.converter.observer.LogObserver;
import com.example.converter.service.ConversionService;


public final class Main {
    public static void main(String[] args) {
        ConversionService service = new ConversionService();

        service.registerConverter(new PdfConverter());

        service.attach(new ConsoleObserver("UI"));
        service.attach(new LogObserver());

        Document doc = new Document("homework.txt", "Important homework content.");

        service.convert(doc, "pdf");
        service.convert(doc, "docx");
    }
}
