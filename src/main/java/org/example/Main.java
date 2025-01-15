package org.example;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import org.example.logs.Log;
import org.example.log_parser_factory.json.JsonLogParser;
import org.example.log_parser_factory.json.JsonLogParserFactory;

public class Main {
    public  static void main(String[] args){
        String jsonLogFilePath = "fallakten.json";
        ArrayList<Log> logs;

        System.out.println("------------------------------------------");
        System.out.println("JSON");
        System.out.println("------------------------------------------");

        JsonLogParserFactory jsonLogParserFactory = new JsonLogParserFactory();
        JsonLogParser jsonLogParser = jsonLogParserFactory.createLogParser();

        try {
            logs = jsonLogParser.parseLogFile(jsonLogFilePath);
            for (Log log : logs) {
                System.out.println(log);
            }
            //System.out.println("\n");
            //statistics.displayLogs(logs);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
