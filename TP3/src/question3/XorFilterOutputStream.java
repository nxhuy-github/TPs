package question3;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class XorFilterOutputStream extends FilterOutputStream {

	private int b; //key
	
	public XorFilterOutputStream(OutputStream arg0, int valeur) {
		super(arg0);
		this.b = valeur;
	}
	
	@Override
	public void write(int v) throws IOException{
		v = v^this.b;
		super.write(v);
	}
	
	

}
