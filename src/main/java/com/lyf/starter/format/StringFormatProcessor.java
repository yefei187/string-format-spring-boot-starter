package com.lyf.starter.format;

import java.util.Objects;

public class StringFormatProcessor implements FormatProcessor {
    @Override
    public <T> String formatToString(T obj) {
        return "StringFormatProcessor:"+ Objects.toString(obj);
    }
}
