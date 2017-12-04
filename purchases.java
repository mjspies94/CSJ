/* Author: Mario Spies
 * Date: 10/5/2017
 * Description: Two text files, one containing values from 2017 and the other from 2018. Find the
 *              percent increase / decrease
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class purchases {

	public static void main(String args[]) throws FileNotFoundException, IOException {


		try (BufferedReader br = new BufferedReader(new FileReader("C:/firstSemesterValues2018.txt"))) {
			String line;
			ArrayList<Integer> seven = new ArrayList<Integer>();
			ArrayList<Integer> eight = new ArrayList<Integer>();
			

			while ((line = br.readLine()) != null) {
				eight.add(Integer.parseInt(line));
			}
			BufferedReader br2 = new BufferedReader(new FileReader("C:/firstSemesterValues2017.txt"));
			while ((line = br2.readLine()) != null) {
				
				seven.add(Integer.parseInt(line));
				

			}
			
			//Percent Increase/Decrease = (difference / original) * 100
			DecimalFormat df = new DecimalFormat("#.##"); 
			
			//System.out.println(eight.size());
			for(int x = 0; x<seven.size();x++) {
				
			
				int seventeenNum = seven.get(x);
				int eighteenNum = eight.get(x);
				int percentage = 0;
				int difference = 0;
				difference = eighteenNum - seventeenNum;
				
				// DECREASE
				if( seventeenNum > eighteenNum) {
					System.out.println(difference);
					//difference = seventeenNum - eighteenNum;
					//System.out.println(seven.get(x)+ " " + eight.get(x));
					percentage = ((difference)/(seventeenNum))*100;
				//System.out.println("-" +df.format(percentage)+ "%");
					
				}
				// INCREASE
				else {
					//difference = eighteenNum - seventeenNum;
					//System.out.println(seven.get(x)+ " " + eight.get(x));
					if (seventeenNum!=0) {
						System.out.println(difference);
						percentage = ((difference)/(seventeenNum))*100;
						//System.out.println(df.format(percentage) + "%");
					}
					else {
						System.out.println(" ");
					}
					
				}
				
				
					
			


			}
		}

	}
}