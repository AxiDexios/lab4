import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.Map.Entry;

public class lab1_1 {
	public static void main(String []args) {
		
		int p;
		Scanner in = new Scanner(System.in);
		p=in.nextInt();
		int q;
		q=in.nextInt();
		int n = p*q;
		System.out.print("Calculated N=");
		System.out.println(n);
		int f = (p-1)*(q-1); 
		System.out.print("Calculated f=");
		System.out.println(f);
		boolean b = true;
		double d = 0;
		while (b) {
			b=false;
			d= Math.random()*f;
			for(int i = 0;i <= d;i++) {
				if ((i==1)||(i==0)) continue;
				if ((f%i==0)&&(d%i==0)) {
					b=true;
					break;	
				}
				
			}
		}
		int e=0;
		while (true) {
			e++;
			if (((e*d)%f==1)&&(e!=d)) break;
			if (e>f) {
				b=true;
				while(b) {
					b=false;
					d= Math.random()*f;
					for(int i = 0;i <= d;i++) {
						if ((i==1)||(i==0)) continue;
						if ((f%i==0)&&(d%i==0)) {
							b=true;
							break;	
						}
						
					}
				}
				
			}
		}
		
		System.out.print("Generating d=");
		System.out.println(d);
		String m =("");
		m=in.nextLine();
		if(in.hasNextLine()) {
			m=in.nextLine();}
		System.out.println(m);
		ArrayList<Double> list= new ArrayList<>();
		for(int i = 0;i<m.length();i++) {
			list.add(Math.pow(Character.getNumericValue(m.charAt(i)),d)%n);
		}
		System.out.println("Server bla bla");
		System.out.println(e);
		
		ArrayList<BigDecimal> decode= new ArrayList<>();
		for(Double c : list) {
			BigDecimal l = new BigDecimal(Math.pow(c,e)%n);
			decode.add(l);
		}
		
		for(BigDecimal c : decode) {
			System.out.println(c);
		}
    }
	
}

