package aichatbot;

public class NLPProcessor {
    public String process(String input) {
        // Basic NLP: lowercase, remove punctuation
        return input.toLowerCase().replaceAll("[^a-z0-9 ]", "").trim();
    }
} 