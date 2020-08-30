package behavioral.template.headfirst.after;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public boolean customerWantsCondiments() {
        String userInput = getUserInput();
        return userInput.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        System.out.println("Would you like to add milk and sugar");
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(inStream);
        String result = "no";
        try {
            result = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
