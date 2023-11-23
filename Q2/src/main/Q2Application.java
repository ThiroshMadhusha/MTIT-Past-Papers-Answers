package main;

/**
 * Original 01
 */
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import common.CommonConstant;

/**
 * IT20146238
 * 11/14/2023
 * Jayathunga T.M.
 * 
 */

public class Q2Application {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Document document;
		
		try {
			
			// document create

			document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
			
	
			Element school = document.createElement(CommonConstant.XML_ELEMENT_SCHOOL);
	
			document.appendChild(school);
	
			Element students = document.createElement(CommonConstant.XML_ELEMENT_STUDENTS);
	
			school.appendChild(students);
			
			
	
			Element student = document.createElement(CommonConstant.XML_ELEMENT_STUDENT);
	
			students.appendChild(student);
			
			
	
			Attr gender = document.createAttribute(CommonConstant.XML_ATTRIBUTE_GENDER);
	
			gender.setValue(CommonConstant.XML_DOCUMENT_GENDER_VALUE);
	
			student.setAttributeNode(gender);
			
			
	
			Element name = document.createElement(CommonConstant.XML_ELEMENT_NAME);
	
			Attr initials = document.createAttribute(CommonConstant.XML_ATTRIBUTE_INITIALS);
	
			initials.setValue(CommonConstant.XML_DOCUMENT_INITIAL_VALUE);
	
			name.setAttributeNode(initials);
			
			
			
			name.appendChild(document.createTextNode(CommonConstant.XML_DOCUMENT_NAME_VALUE));
			
			student.appendChild(name);
			
			
			
			Element address = document.createElement(CommonConstant.XML_ELEMENT_ADDRESS);
	
			Attr no = document.createAttribute(CommonConstant.XML_ATTRIBUTE_No);
	
			no.setValue(CommonConstant.XML_DOCUMENT_NUMBER_VALUE);
			
			
	
			Attr street = document.createAttribute(CommonConstant.XML_ATTRIBUTE_STREET);
	
			street.setValue(CommonConstant.XML_DOCUMENT_STREET_VALUE);
	
			address.setAttributeNode(no);
	
			
			
			address.setAttributeNode(street);
	
			address.appendChild(document.createTextNode(CommonConstant.XML_DOCUMENT_STREET_ADDRESS_VALUE));
	
			student.appendChild(address);
			
			} catch(Exception exception) {
				
				throw new RuntimeException("Error getting XML generate Document".concat(exception.getMessage()));
		}

		try {
			Transformer transformer = TransformerFactory.newInstance().newTransformer();

			DOMSource domsource = new DOMSource(document);

			transformer.transform(domsource, new StreamResult(new File(CommonConstant.XML_DOCUMENT_STUDENT_XML_VALUE)));

			transformer.transform(domsource, new StreamResult(System.out));	
			
		} catch(Exception exception) {
			
			throw new RuntimeException("Error getting Transformer XML Decument".concat(exception.getMessage()));
		}
		

	}

}
