public class Chatbot {
    private String userInput;  // private field

    // Setter
    public void setUserInput(String input) {
        this.userInput = input;
    }

    // Getter
    public String getUserInput() {
        return this.userInput;
    }

    // Method to generate response
    public String generateResponse() {
        if (userInput.equalsIgnoreCase("hello")) {
            return "Hi there!";
        } else if (userInput.equalsIgnoreCase("how are you")) {
            return "I am Fine and all okay what about you.";
        } 
        else if (userInput.equalsIgnoreCase("bye")){
            return "GoodBye";
        }
        else {
            return "I'm not sure how to respond to that.";
        }
    }
}
