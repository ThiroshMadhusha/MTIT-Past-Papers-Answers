package main;

/**
 * Original 04
 */
import java.io.File;
import java.util.logging.Logger;

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

public class Declare_Variables {
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		Element school, student, students, address, name;
		Attr gender, initials, no, street;
		Document document;
		Logger log = Logger.getLogger(Declare_Variables.class.getName());
		
		try {
			
			// document create

			document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			
			
	
			school = document.createElement(CommonConstant.XML_ELEMENT_SCHOOL);
	
			document.appendChild(school);
	
			students = document.createElement(CommonConstant.XML_ELEMENT_STUDENTS);
	
			school.appendChild(students);
			
			
	
			student = document.createElement(CommonConstant.XML_ELEMENT_STUDENT);
	
			students.appendChild(student);
			
			
	
			gender = document.createAttribute(CommonConstant.XML_ATTRIBUTE_GENDER);
	
			gender.setValue(CommonConstant.XML_DOCUMENT_GENDER_VALUE);
	
			student.setAttributeNode(gender);
			
			
	
			name = document.createElement(CommonConstant.XML_ELEMENT_NAME);
	
			initials = document.createAttribute(CommonConstant.XML_ATTRIBUTE_INITIALS);
	
			initials.setValue(CommonConstant.XML_DOCUMENT_INITIAL_VALUE);
	
			name.setAttributeNode(initials);
			
			
			
			name.appendChild(document.createTextNode(CommonConstant.XML_DOCUMENT_NAME_VALUE));
			
			student.appendChild(name);
			
			
			
			address = document.createElement(CommonConstant.XML_ELEMENT_ADDRESS);
	
			no = document.createAttribute(CommonConstant.XML_ATTRIBUTE_No);
	
			no.setValue(CommonConstant.XML_DOCUMENT_NUMBER_VALUE);
			
			
	
			street = document.createAttribute(CommonConstant.XML_ATTRIBUTE_STREET);
	
			street.setValue(CommonConstant.XML_DOCUMENT_STREET_VALUE);
	
			address.setAttributeNode(no);
	
			
			
			address.setAttributeNode(street);
	
			address.appendChild(document.createTextNode(CommonConstant.XML_DOCUMENT_STREET_ADDRESS_VALUE));
	
			student.appendChild(address);
			
			} catch(Exception exception) {
				log.info("Error getting Transformer XML Decument".concat(exception.getMessage()));
				throw new RuntimeException("Error getting XML generate Document".concat(exception.getMessage()));
		}

		try {
			Transformer transformer = TransformerFactory.newInstance().newTransformer();

			DOMSource domsource = new DOMSource(document);

			transformer.transform(domsource, new StreamResult(new File(CommonConstant.XML_DOCUMENT_STUDENT_XML_VALUE)));

			transformer.transform(domsource, new StreamResult(System.out));	
			
		} catch(Exception exception) {
			log.info("Error getting Transformer XML Decument".concat(exception.getMessage()));
			throw new RuntimeException("Error getting Transformer XML Decument".concat(exception.getMessage()));
		}
		

	}

}
