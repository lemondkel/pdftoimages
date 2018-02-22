import java.io.File;
import java.util.List;

/*
 * Created by Administrator on 2018-02-22.
 */
public class Example {
	public static void main(String[] args) throws Exception {
		File pdf = new File("D:/20180222/test.pdf");
		List<File> imageList = ConvertUtil.convertPdfToImage(pdf); // images files
	}
}