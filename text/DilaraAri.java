package text;

public class DilaraAri implements Processor {
    public String process(String myString) {
        return myString.substring(3, myString.length());
    }
    public String description(String description) {
        return description+" Returns the characters between the starting and ending index as a String";
    }
    public String author() {
        return "A Dilara Ari";
    }
}
