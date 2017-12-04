import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/* Author: Mario Spies
 * Date: 10/5/2017
 * Description: Two text files, one containing values from 2017 and the other from 2018. 
 *              Find items in 2018 file that are not contained in 2017
 */
public class list {

	public static void main(String args[]) throws FileNotFoundException, IOException {

		
		try (BufferedReader br = new BufferedReader(new FileReader("C:/2018.txt"))) {
			String line;
			ArrayList<String> excelList = new ArrayList<String>();
		    ArrayList<String> QBList = new ArrayList<String>();
			
			
			while ((line = br.readLine()) != null) {
				excelList.add(line);
			}
			
			BufferedReader br2 = new BufferedReader(new FileReader("C:/2017 (1).txt"));
			while ((line = br2.readLine()) != null) {
			    if(line.contains(" ")){
					line = line.substring(0, line.indexOf(" ")); 
					QBList.add(line);
				}

			} 
			
			int test = 0;
			for(int x = 0; x<excelList.size();x++) {
				String excelString = excelList.get(x);
				for(int y = 0; y<QBList.size();y++) {
					String qbString = QBList.get(y);
					
					if(excelString.equals(qbString)) {
					   test++;
					 
					}
	
				}
				if(test>0) {
					test=0;
					
				}
				else {
					 System.out.println(excelString);
				}
			

			}
		}

	}
}

