package excel_and_pdf;

public class Handler {
	public static final String xmlFilePath = "<filepath>";
	public static final String domPDFPath = "<filepath>";
	public static final String saxPDFPath = "<filepath>";

	public static void main(String[] args) throws Exception {
		Convertor dompdfwriter = Container.getReadXMLUsingDOM();
		dompdfwriter.doConvert(xmlFilePath, domPDFPath);

		Convertor saxpdfwriter = Container.getReadXMLUsingSAX();
		saxpdfwriter.doConvert(xmlFilePath, saxPDFPath);
	}
}
