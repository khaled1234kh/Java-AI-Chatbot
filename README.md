# 🤖 Java AI Chatbot

A simple Java Swing GUI chatbot application that processes user input, responds to frequently asked questions, and provides basic rule-based interaction using NLP techniques.

---

## 📌 Features

🧠 **FAQ Response System**: Matches common user queries and responds intelligently.
🔤 **NLP Processing**: Cleans and normalizes user input (lowercasing, removing punctuation).
💬 **Rule-Based Responses**: Provides fallback replies for greetings, goodbyes, and unknown inputs.
🖥️ **Java Swing GUI**: Interactive desktop interface for real-time chatting.
📚 **OOP Design**: Modular classes like `Chatbot`, `FAQTrainer`, and `NLPProcessor`.

---

## 🖼️ Application Overview
<img width="1915" height="1015" alt="Screenshot 2025-07-21 163223" src="https://github.com/user-attachments/assets/76fa4acc-740e-49ae-8e3f-94e183fdcd7d" />



---

## 🚀 Getting Started

### Prerequisites

* Java 8 or higher
* Any Java IDE (like IntelliJ IDEA or NetBeans)

### Running the Project

Clone the repository:

```bash
git clone https://github.com/khaled1234kh/Java-AI-Chatbot.git  
cd Java-AI-Chatbot
```

Compile and run:

1. Open the project in your IDE
2. Run the `Main.java` file

💡 The GUI will launch automatically via `new ChatbotGUI();`

---

## 🧠 How It Works

User input is taken through a `JTextField`, processed via a basic NLP cleaner, and then checked against an FAQ database.

* If a match is found, the FAQ response is returned
* Otherwise, fallback rules handle greetings and unknown queries

**Modular Breakdown**:

* `Chatbot`: Handles overall logic
* `FAQTrainer`: Stores and matches known questions
* `NLPProcessor`: Normalizes input for matching
* `ChatbotGUI`: Swing-based user interface
* `Main`: Entry point using `SwingUtilities.invokeLater()`

---

## 📂 File Structure

```
Java-AI-Chatbot/
├── aichatbot/
│   ├── Chatbot.java
│   ├── FAQTrainer.java
│   ├── NLPProcessor.java
│   ├── ChatbotGUI.java
│   └── Main.java
```

---

## 🏆 Achievements

✅ Built a fully functional AI chatbot with real-time GUI
✅ Implemented basic NLP preprocessing and response logic
✅ Practiced modular OOP design and Java Swing development
✅ Completed as part of CodeAlpha Internship Project

---

## 👨‍💻 Author

**Khaled Mohamed**
Java Developer | Passionate about AI & GUI Development

• [LinkedIn]: https://www.linkedin.com/in/khaled-mohamed-22a22a325/ 

• [GitHub](https://github.com/khaled1234kh)
