package com.lyf.starter.format;

public interface FormatProcessor {
    <T> String formatToString(T obj);
}
