# AI Chatbot (Java, Desktop GUI)

## Features
- Java-based chatbot for interactive communication
- Uses basic NLP techniques (tokenization, keyword matching)
- Rule-based and FAQ-trained responses
- Simple, extendable architecture for future ML/NLP integration
- Desktop GUI (Swing) for real-time chat

## How to Open in NetBeans
1. Open Apache NetBeans 2025.
2. Go to **File > Open Project**.
3. Navigate to `Users/Public/Documents/AIChatbot` and select the folder.
4. Build and run the project (Main class: `aichatbot.Main`).

## Project Structure
- `src/aichatbot/Main.java` - Entry point, launches GUI
- `src/aichatbot/Chatbot.java` - Chat logic
- `src/aichatbot/NLPProcessor.java` - Basic NLP
- `src/aichatbot/FAQTrainer.java` - FAQ logic
- `src/aichatbot/ChatbotGUI.java` - Swing GUI

## Extending
- Add more FAQs in `FAQTrainer.java`
- Improve NLP in `NLPProcessor.java`
- Add ML/NLP libraries for advanced features 