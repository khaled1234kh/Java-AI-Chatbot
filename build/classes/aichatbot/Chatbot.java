package aichatbot;

public class Chatbot {
    private FAQTrainer faqTrainer;
    private NLPProcessor nlpProcessor;

    public Chatbot() {
        faqTrainer = new FAQTrainer();
        nlpProcessor = new NLPProcessor();
    }

    public String getResponse(String userInput) {
        String processedInput = nlpProcessor.process(userInput);
        String faqResponse = faqTrainer.getFAQResponse(processedInput);
        if (faqResponse != null) {
            return faqResponse;
        }
        // Fallback rule-based response
        if (processedInput.contains("hello") || processedInput.contains("hi")) {
            return "Hello! How can I assist you today?";
        } else if (processedInput.contains("bye")) {
            return "Goodbye! Have a great day!";
        }
        return "I'm sorry, I don't understand. Can you please rephrase?";
    }
} 