# PDF To Images
This method renders PDF files and draws them into image file list objects, a different concept from Apache POI. An example is made based on Apache Pdfbox.

# How to use?
[1] include Add pdfbox dependencies to the pom.xml.

	<dependencies>
		<!-- https://mvnrepository.com/artifact/org.apache.pdfbox/pdfbox -->
		<dependency>
			<groupId>org.apache.pdfbox</groupId>
			<artifactId>pdfbox</artifactId>
			<version>2.0.8</version>
		</dependency>
	</dependencies>

[2] Leverage ConvertPdfToImage function of ConverbVtil.

	File pdf = new File("D:/20180222/test.pdf");
    List<File> imageList = ConvertUtil.convertPdfToImage(pdf); // images files