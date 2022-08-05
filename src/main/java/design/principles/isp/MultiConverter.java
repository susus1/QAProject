package design.principles.isp;

public class MultiConverter implements CsvConverter, PdfConverter {

	@Override
	public Pdf ExcelToPdf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pdf CsvToPdf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Csv ExcelToCsv() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Excel CsvToExcel() {
		// TODO Auto-generated method stub
		return null;
	}

}
