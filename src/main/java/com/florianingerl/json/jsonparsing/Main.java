package com.florianingerl.json.jsonparsing;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.florianingerl.util.regex.CaptureTreeNode;
import com.florianingerl.util.regex.Matcher;

import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.map.ObjectMapper;

import com.florianingerl.util.regex.Pattern;

public class Main {

	public static void main(String[] args) throws IOException {

		Person pHermann = createSamplePerson();

		ObjectMapper mapper = new ObjectMapper();

		String jsonString = mapper.writeValueAsString(pHermann);

		System.out.println(jsonString);

		Pattern p = Pattern.compile(IOUtils.toString(Main.class.getClassLoader().getResourceAsStream("json.regex")));

		Matcher m = p.matcher(jsonString);

		m.setMode(Matcher.CAPTURE_TREE);

		if (!m.matches()) {
			System.out.println("This isn't valid json!");
			return;
		}

		printTreeNode(m.captureTree().getRoot(), 0);

	}

	private static Person createSamplePerson() {
		Person pFlori = new Person("Florian", 26);
		Person pSonja = new Person("Sonja", 28);
		List<Person> kids = Arrays.asList(pFlori, pSonja);
		List<String> hobbies = Arrays.asList("Reading", "Sleeping");

		Person pHermann = new Person("Hermann", 72, true, hobbies, kids);

		return pHermann;
	}
	
	private static void printTreeNode(CaptureTreeNode node, int tabs) {
		for(int i=0; i < tabs; ++i) System.out.print("\t");
		if(node.getGroupName()!=null) System.out.print(node.getGroupName());
		else System.out.print(node.getGroupNumber());
		if(node.getChildren().isEmpty() ) System.out.print("=" + node.getCapture().getValue());
		
		System.out.println();
		for(CaptureTreeNode child : node.getChildren() ) {
			printTreeNode(child, tabs + 1);
		}
	}

}
