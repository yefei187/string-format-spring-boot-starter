package com.lyf.starter.format;

import com.alibaba.fastjson.JSON;

public class JsonFormatProcessor implements FormatProcessor {
    @Override
    public <T> String formatToString(T obj) {
        return "JsonFormatProcessor:"+JSON.toJSONString(obj);
    }
}