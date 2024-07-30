package org.example;

import java.util.HashMap;

public class Abbreviations {
    private final HashMap<String, String> abbreviations;

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }

    // Method if an abbreviation has already been added
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation);
    }

    // Method to find the explanation for an abbreviation
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(abbreviation);
    }

    // Main method
    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();

        abbreviations.addAbbreviation("lol", "laugh out loud");
        abbreviations.addAbbreviation("omg", "oh my god");
        abbreviations.addAbbreviation("brb", "be right back");

        System.out.println(abbreviations.hasAbbreviation("lol")); // true when testing
        System.out.println(abbreviations.hasAbbreviation("idk")); // false when testing

        System.out.println(abbreviations.findExplanationFor("omg"));
        System.out.println(abbreviations.findExplanationFor("brb"));
        System.out.println(abbreviations.findExplanationFor("idk")); // null
    }
}

