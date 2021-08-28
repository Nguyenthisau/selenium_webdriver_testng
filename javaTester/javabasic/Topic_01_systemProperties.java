package javabasic;

public class Topic_01_systemProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        System.out.println(projectPath + "\\browserDrivers\\geckodriver.exe");
	}

}
