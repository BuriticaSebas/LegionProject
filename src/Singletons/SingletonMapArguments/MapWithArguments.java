package Singletons.SingletonMapArguments;

import java.util.HashMap;
import java.util.Map;

public class MapWithArguments {
    private static Map<String, String> globalArguments = new HashMap<>();
    private static MapWithArguments instance = new MapWithArguments();

    private MapWithArguments(){};

    public static MapWithArguments getInstance(){
        if (instance == null){
            instance = new MapWithArguments();
        }

        return instance;
    }

    public static Map<String, String> getGlobalArguments() {
        return globalArguments;
    }
}
