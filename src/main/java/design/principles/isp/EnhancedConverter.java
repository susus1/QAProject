package design.principles.isp;

public class EnhancedConverter extends Converter implements PdfConverter {

	@Override
	public Pdf ExcelToPdf() {
		// TODO Auto-generated method stub
		return new Pdf();
	}

	@Override
	public Pdf CsvToPdf() {
		// TODO Auto-generated method stub
		return new Pdf();
	}

}
