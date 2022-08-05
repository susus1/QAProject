package design.principles.isp;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CsvConverter converter = new Converter();
		Excel excel =  converter.CsvToExcel(); 
		
		EnhancedConverter enhancedConverter = new EnhancedConverter();
		Pdf pdf =  enhancedConverter.ExcelToPdf();
	}

}
