package org.example.log_parser_factory.json;

import org.example.log_parser_factory.LogParserFactory;

public class JsonLogParserFactory implements LogParserFactory {
    @Override
    public JsonLogParser createLogParser() {
        return JsonLogParser.getInstance();
    }
}
