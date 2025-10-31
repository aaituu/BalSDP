package com.example.converter.service;

import com.example.converter.model.Document;
import com.example.converter.observer.Observer;
import com.example.converter.observer.Subject;
import com.example.converter.port.Converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public final class ConversionService implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private final List<Converter> converters = new ArrayList<>();

    public void registerConverter(Converter converter) {
        if (converter == null) throw new IllegalArgumentException("converter == null");
        converters.add(converter);
    }

    public void convert(Document doc, String targetFormat) {
        Optional<Converter> found = converters.stream()
                .filter(c -> c.supportedFormat().equalsIgnoreCase(targetFormat))
                .findFirst();

        if (found.isPresent()) {
            found.get().convert(doc);
            notifyObservers("Converted '" + doc.getFileName() + "' to " + targetFormat);
        } else {
            notifyObservers("No converter for format: " + targetFormat);
        }
    }

    @Override
    public void attach(Observer o) {
        if (o == null) throw new IllegalArgumentException("observer == null");
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}
