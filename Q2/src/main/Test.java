package main;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Test {


	public static void main(String[] args) throws Exception {

		Document xx = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

		Element rr = xx.createElement("School");

		xx.appendChild(rr);

		Element vv = xx.createElement("Students");

		rr.appendChild(vv);

		Element w3 = xx.createElement("Student");

		vv.appendChild(w3);

		Attr a1 = xx.createAttribute("gender");

		a1.setValue("Male");

		w3.setAttributeNode(a1);

		Element v1 = xx.createElement("Name");

		Attr e1 = xx.createAttribute("Initials");

		e1.setValue("S.A.");

		v1.setAttributeNode(e1);
		
		v1.appendChild(xx.createTextNode("Nalaka Dissaayakee"));
		
		w3.appendChild(v1);
		
		Element e33 = xx.createElement("Address");

		Attr w1 = xx.createAttribute("N0");

		w1.setValue("115/1");

		Attr w2 = xx.createAttribute("Street");

		w2.setValue("Avenue Street");

		e33.setAttributeNode(w1);

		e33.setAttributeNode(w2);

		e33.appendChild(xx.createTextNode("No:115/1, Avenue Street, Randy"));

		w3.appendChild(e33);

		Transformer w6 = TransformerFactory.newInstance().newTransformer();

		DOMSource w7 = new DOMSource(xx);

		w6.transform(w7, new StreamResult(new File("students.xml")));

		w6.transform(w7, new StreamResult(System.out));	

	}

}
