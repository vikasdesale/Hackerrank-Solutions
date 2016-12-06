import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

 class Calculate {
    public Outputer output;
    public Scanner scanner = new Scanner(System.in);

    public int getINTVal() throws IOException {
        int input = readInt();
        if (input <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return input;
    }

    public int readInt() {
        return scanner.nextInt();
    }

    public static Volume get_Vol() {
        return new Volume();
    }

    public double getDoubleVal() throws IOException {
        double input = scanner.nextDouble();
        if (input <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return input;
    }
}

class Volume {
    ThreeDimensional threeDimensional;

    public double main(int a) {
        threeDimensional = new Cube(a);
        return threeDimensional.getVolume();
    }

    public double main(int l, int b, int h) {
        threeDimensional = new Cuboid(l, b, h);
        return threeDimensional.getVolume();
    }

    public double main(double r) {
        threeDimensional = new Hemisphere(r);
        return threeDimensional.getVolume();
    }

    public double main(double r, double h) {
        threeDimensional = new Cylinder(r,h);
        return threeDimensional.getVolume();
    }
}

abstract class ThreeDimensional {
    public abstract double getVolume();
}

class Cube extends ThreeDimensional {
    private double length;

    Cube(double length) {
        this.length = length;
    }


    public double getVolume() {
        return Math.pow(this.length, 3);
    }
}

class Cuboid extends ThreeDimensional {
    private double length;
    private double breath;
    private double height;

    Cuboid(double length, double breath, double height) {
        this.length = length;
        this.breath = breath;
        this.height = height;
    }


    public double getVolume() {
        return length * breath * height;
    }
}

class Hemisphere extends ThreeDimensional {
    private double radius;

    Hemisphere(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return Math.PI * Math.pow(radius, 3) * 4 / 3 / 2;
    }
}

class Cylinder extends ThreeDimensional {
    private double radius;
    private double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    
    public double getVolume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

class Outputer {
    public static void display(double number) {
        //System.out.println(number);
        System.out.println(String.format("%.3f", number));
    }
}



public class Solution
{
	
	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();		
		try{
			Calculate cal=new Calculate();
			int T=cal.getINTVal();
			while(T-->0){
			double volume = 0.0d;		
			int ch=cal.getINTVal();			
			if(ch==1){
			
				int a=cal.getINTVal();
				volume=Calculate.get_Vol().main(a);
				
				
			}
			else if(ch==2){
			
				int l=cal.getINTVal();
				int b=cal.getINTVal();
				int h=cal.getINTVal();
				volume=Calculate.get_Vol().main(l,b,h);
				
			}
			else if(ch==3){
			
				double r=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r);
				
			}
			else if(ch==4){
			
				double r=cal.getDoubleVal();
				double h=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r,h);
				
			}
			cal.output.display(volume);
			}
					
		}
		catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
		
		
	}
}
/**
 *This class prevents the user from using System.exit(0)
 * from terminating the program abnormally.
 */
class Do_Not_Terminate {
	 
    public static class ExitTrappedException extends SecurityException {
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate	
	

