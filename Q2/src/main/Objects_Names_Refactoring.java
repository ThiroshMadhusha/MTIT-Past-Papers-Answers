package main;

/**
 * Original 02
 */

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Objects_Names_Refactoring {

	public static void main(String[] args) throws Exception {

		Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

		Element school = document.createElement("School");

		document.appendChild(school);

		Element students = document.createElement("Students");

		school.appendChild(students);

		Element student = document.createElement("Student");

		students.appendChild(student);

		Attr gender = document.createAttribute("gender");

		gender.setValue("Male");

		student.setAttributeNode(gender);

		Element name = document.createElement("Name");

		Attr initials = document.createAttribute("Initials");

		initials.setValue("S.A.");

		name.setAttributeNode(initials);
		
		name.appendChild(document.createTextNode("Nalaka Dissaayakee"));
		
		student.appendChild(name);
		
		Element address = document.createElement("Address");

		Attr no = document.createAttribute("No");

		no.setValue("115/1");

		Attr street = document.createAttribute("Street");

		street.setValue("Avenue Street");

		address.setAttributeNode(no);

		address.setAttributeNode(street);

		address.appendChild(document.createTextNode("No:115/1, Avenue Street, Randy"));

		student.appendChild(address);

		Transformer transformer = TransformerFactory.newInstance().newTransformer();

		DOMSource domsource = new DOMSource(document);

		transformer.transform(domsource, new StreamResult(new File("students.xml")));

		transformer.transform(domsource, new StreamResult(System.out));	

	}

}
