package question3;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class XorFilterInputStream extends FilterInputStream {
	
	private int b; // key
	
	protected XorFilterInputStream(InputStream arg0, int valeur) {
		super(arg0);
		this.b = valeur;
		this.in = new BufferedInputStream(arg0);
		
	}
	
	@Override
	public int read() throws IOException{
		int v = super.read();
		//int v = this.in.read();
		//System.out.print((char)v + " ");
		v = v^this.b;
		return v;
	}

}
