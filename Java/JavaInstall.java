public class JavaInstall{
	public static void main(String [] args){
	
	String version = System.getProperty("java.version");
	System.out.print(version);

	String run = System.getProperty("java.runtime.version");
	System.out.print(run);

	String home = System.getProperty("java.home");
	System.out.print(home);

	String vendor = System.getProperty("java.vendor");
	System.out.print(vendor);

	String vendorUrl = System.getProperty("java.vendor.url");
	System.out.print(vendorUrl);

	String classPath = System.getProperty("java.class.path");
	System.out.print(classPath);




	}

}