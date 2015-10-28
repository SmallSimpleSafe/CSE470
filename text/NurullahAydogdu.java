package text;

public class NurullahAydogdu implements Processor {
    public String process(String input) {
        return input.toUpperCase();
    }
    public String description(String source) {
        return source+" converted to lower case";
    }
    public String author() {
        return "Nurullah Aydogdu";
    }
}
