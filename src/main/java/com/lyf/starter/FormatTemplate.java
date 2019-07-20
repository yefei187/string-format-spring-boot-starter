package com.lyf.starter;


import com.lyf.starter.autoconfiguration.FormatProperties;
import com.lyf.starter.format.FormatProcessor;

public class FormatTemplate {

    private FormatProcessor formatProcessor;
    private FormatProperties formatProperties;
    public FormatTemplate(FormatProcessor formatProcessor,FormatProperties formatProperties) {
        this.formatProcessor = formatProcessor;
        this.formatProperties = formatProperties;
    }

    public <T> String doFormat(T obj){
        StringBuilder sb = new StringBuilder();
        sb.append("Execute format: ").append("<br/>");
        sb.append("properties :" + formatProperties.getInfo().toString()).append("<br/>");
        sb.append("Obj Format Result: ").
                append(formatProcessor.formatToString(obj)).
                append("<br/>");
        return sb.toString();
    }
}
