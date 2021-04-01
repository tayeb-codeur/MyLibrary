package be.icc.poo.data;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;

public class loadBook(String filetitle) {
	int cpt = 0;
	File f = new File (filetitle);
	
	if (f.exists()) {
		FileReader fr = null;
		BufferedReader br = null;
		String[] data = null;
		
			try {
				try {
				fr =new FileReader(f);
				br = new BufferedReader(fr);
				String  ligne = br.readLine();
				while ((ligne = br.readLine()) != null) {
					data = ligne.split(";");
					Books b = new Books(UUID.fromString(data[0]),data[1]);

					this.books.add(b);				
					cpt++;
				}			
							
			}finally {
				br.close();
			}
			
			catch (IOException e) {	
			}
			System.out.println(b.toString());
		}
		   return cpt;	
		}
	}


