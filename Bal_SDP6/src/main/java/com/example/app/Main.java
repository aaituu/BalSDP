package com.example.app;

import com.example.context.ConverterContext;
import com.example.model.Document;
import com.example.strategy.impl.DocxConverterStrategy;
import com.example.strategy.impl.PdfConverterStrategy;
import com.example.strategy.impl.TxtConverterStrategy;


public class Main {
    public static void main(String[] args) {
        Document doc = new Document("report.txt", "Hello! Data of document.\nLine2: Data");

        ConverterContext context = new ConverterContext(new TxtConverterStrategy());

        System.out.println("1) TXT output:\n" + context.convert(doc));

        context.setStrategy(new DocxConverterStrategy());
        System.out.println("2) DOCX output:\n" + context.convert(doc));

        context.setStrategy(new PdfConverterStrategy());
        System.out.println("3) PDF output:\n" + context.convert(doc));

        System.out.println("Used strategy: " + context.getStrategy().getFormatName());
    }
}
