package com.example.avroreadingservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadSchema {

	
	
	
    @Value("${file.name}") 
	private  String fileLocation;
		 
	 
	 
	 public void read() {
		 System.out.println(fileLocation);
	 }

		/*
		 * public static void main(String[] args) throws IOException, ParseException {
		 * 
		 * ReadSchema rs = new ReadSchema(); rs.read();
		 * 
		 * BasicConfigurator.configure();
		 * 
		 * //DatumReader<GenericRecord> datumReader = new GenericDatumReader<>();
		 * //DataFileReader<GenericRecord> dataFileReader = new
		 * DataFileReader<GenericRecord>(new File(
		 * "C:\\Users\\albaabd\\Documents\\Tools\\summit_12-39-2021-06-04-first1k.avro")
		 * , datumReader); //Schema schema = dataFileReader.getSchema();
		 * 
		 * //System.out.println("["+schema.toString()+"]"); //try and add to array so
		 * when avro schema is converted, it's placed in an array it can be read using
		 * this metho
		 * 
		 * 
		 * try { File file = new File(""); BufferedReader buffered = new
		 * BufferedReader(new InputStreamReader(new FileInputStream(file)));
		 * 
		 * StringBuilder stringBuilder = new StringBuilder(); String line = null; String
		 * ls = System.getProperty("line.separator"); while ((line =
		 * buffered.readLine()) != null) { stringBuilder.append(line);
		 * stringBuilder.append(ls); } // delete the last new line separator
		 * stringBuilder.deleteCharAt(stringBuilder.length() - 1); buffered.close();
		 * 
		 * // System.out.println(response.toString()); JSONArray obj_JSONArray = new
		 * JSONArray(stringBuilder.toString());
		 * 
		 * for (int i = 0; i < obj_JSONArray.length(); i++) { JSONObject obj =
		 * obj_JSONArray.getJSONObject(i); } System.out.println(obj_JSONArray);
		 * System.out.println("Number of records in the file: " +
		 * obj_JSONArray.length());
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("To search for a record, enter it's Deal ID: "); String
		 * deal_id = sc.nextLine();
		 * 
		 * for (int i = 0; i < obj_JSONArray.length(); i++) { if
		 * (obj_JSONArray.toString().contains(deal_id)) {
		 * System.out.println(obj_JSONArray.getJSONObject(i)); break; } else{
		 * System.out.println(deal_id+" was not found.");//Finish error handling for if
		 * not found break; } } }catch (IOException e){ throw new
		 * AvroConversionException("Failed to convert to JSON.", e); }
		 * 
		 * }
		 */

    

}
