import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class seperateNames {

	public static void main(String args[]) throws FileNotFoundException, IOException {


		try (BufferedReader br = new BufferedReader(new FileReader("C:/unitsPurchases.txt"))) {
			String line;


			while ((line = br.readLine()) != null) {

				line = line.substring(1, line.indexOf(" ")); 
				System.out.println(line);

			} 


		}

	}
}

