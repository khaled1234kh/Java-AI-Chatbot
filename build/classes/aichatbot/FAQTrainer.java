package aichatbot;

import java.util.*;

public class FAQTrainer {
    private Map<String, String> faqMap;

    public FAQTrainer() {
        faqMap = new HashMap<>();
        // Add FAQs here
        faqMap.put("what is your name", "I am an AI Chatbot.");
        faqMap.put("how are you", "I'm just a program, but I'm here to help!");
        faqMap.put("what can you do", "I can answer your questions and chat with you.");
        faqMap.put("who created you", "I was created as a Java project example.");
    }

    public String getFAQResponse(String input) {
        for (String question : faqMap.keySet()) {
            if (input.contains(question)) {
                return faqMap.get(question);
            }
        }
        return null;
    }
} 