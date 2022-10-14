package org.example;


import org.opensky.api.OpenSkyApi;
import org.opensky.model.OpenSkyStates;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        OpenSkyApi api = new OpenSkyApi("USERNAME", "PASSWORD");
        OpenSkyStates os = api.getMyStates(0, null, null);
        System.out.println("Hello world!");
    }
}