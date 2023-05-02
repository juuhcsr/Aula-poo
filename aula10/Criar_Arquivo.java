package aula10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class Criar_Arquivo {

	public static void main(String[] args) throws IOException {
	
		File f = new File ("teste.txt");
		if (!f.exists()) {
			f.createNewFile();
			System.out.println("arquivo novo criado!!");
		}
		else if (f.exists() && f.isDirectory()) {
			System.out.println("Arquivo já criado e é um diretório");
		}
		else if (f.exists() && f.isFile()) {
			System.out.println("Arquivo criado e é um arquivo:" + f.getName());
		}
		
		System.out.println("Apagando");
		f.delete();
		}
	
	}
