package polymorphismDemo;

public class Main {

	public static void main(String[] args) {

		/*
		BaseLogger[] baseLoggers = new BaseLogger[] { new DatabaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger() };

		for (BaseLogger loggers : baseLoggers) {

			loggers.Log("Log mesajı");
		}
		*/
		
		CustomerManager customerManager= new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
