package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;


public class XSLTUtil {
	
	public static void transformXmlByXslt(String srcXml, String dstXml, String xslt) {
		
		TransformerFactory tf = TransformerFactory.newInstance();
		
		try {
			Transformer transformer = tf.newTransformer(new StreamSource(xslt));
			transformer.transform(new StreamSource(srcXml),
					new StreamResult(new FileOutputStream(dstXml)));
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		String srcXml = "src/gs_request.xml";
		String dstXml = "src/gs_request-trans.xml";
		String xslt = "src/gs_request.xslt";
		
		transformXmlByXslt(srcXml, dstXml, xslt);
	}


}
