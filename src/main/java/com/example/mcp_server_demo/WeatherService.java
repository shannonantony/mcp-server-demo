package com.example.mcp_server_demo;


import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Tool(description = "Get weather information by city name")
    public String getWeather(@ToolParam(description= "City or state name") String location) {
        // Mock weather service implementation
        return String.format("The weather in %s is sunny with a temperature of 25°C", location);
    }
}