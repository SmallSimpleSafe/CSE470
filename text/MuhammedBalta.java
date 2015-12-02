package text;

public class MuhammedBalta implements Processor{

	@Override
	public String process(String input) {
		// TODO Auto-generated method stub
	input = input.substring(0, input.indexOf('@'));
	
		return input;
	}

	@Override
	public String description(String source) {
		// TODO Auto-generated method stub
		
		return source+"\'s user name "+process(source);
	}

	@Override
	public String author() {
		// TODO Auto-generated method stub
		return "Muhammed Balta";
	}
public static void main(String[] args){
	
	MuhammedBalta mBaltaProcessor = new MuhammedBalta();
	System.out.println(mBaltaProcessor.author());
	System.out.println(mBaltaProcessor.description("muhammed@gmail.com"));
	System.out.println(mBaltaProcessor.process("balta@gmail.com"));
}
}

