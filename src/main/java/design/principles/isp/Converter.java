package design.principles.isp;

public class Converter implements CsvConverter {

    public Csv ExcelToCsv(){
        // CSV -> Excel conversion logic
    	return new Csv();
    }

    public Excel CsvToExcel(){
        return new Excel();
    }


}
