import java.io.*;
public class PipedStreamDemo {
	public static void main (String args[]) throws IOException{
		//对可能发生的异常交由系统处理
		PipedOutputStream pos =new PipedOutputStream();
		PipedInputStream pis =new PipedInputStream(pos);
		byte datamover =0;
		System.out.println("\nNow I start to work......\n");
		try {
			System.out.println("transfer "+datamover+" to pos.\n");
			pos.write(datamover);
			System.out.println("pis get :"+(byte)pis.read());
			}
		finally {
			pis.close();
			pos.close();
		}
	}
}
