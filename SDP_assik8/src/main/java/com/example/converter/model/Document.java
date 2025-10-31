package com.example.converter.model;


public final class Document {
    private final String fileName;
    private final String content;

    public Document(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    public String getFileName() { return fileName; }
}
