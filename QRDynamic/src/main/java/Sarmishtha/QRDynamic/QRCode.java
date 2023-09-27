package Sarmishtha.QRDynamic;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
public class QRCode {

	public static void main(String[] args) throws WriterException, IOException {
		
     String data="";
    
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Your Details");
     data=sc.nextLine();
     String path="C:\\Users\\dell\\Desktop\\QRCODEDynamic.jpg";
     BitMatrix matrix=new MultiFormatWriter().encode(data,BarcodeFormat.QR_CODE,500,500);
     
     MatrixToImageWriter.writeToPath(matrix, "jpg", Paths.get(path));
     System.out.println("QR Code Generate Successfully");
	}

}
