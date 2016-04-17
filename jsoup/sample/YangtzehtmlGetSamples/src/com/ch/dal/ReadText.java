package com.ch.dal;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadText {
	/**
	 * ͨ��BufferedInputStream��ȡ�ı�
	 * @param path
	 * @return
	 */
	public String  readHtmlByBuffered(String path) {
		StringBuffer buffer = new StringBuffer();
		int c = 0;
		try {
			FileInputStream fis = new FileInputStream(path);
			BufferedInputStream bis = new BufferedInputStream(fis);
			while (( c = bis.read()) != -1 ) {
				buffer.append((char)c);
			}
			bis.close();
			fis.close();
			return buffer.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	} 
	
	/**
	 * ͨ��FileReader��ȡ�ı�
	 * @param path
	 * @return
	 */
	public String  readHtmlByFileReader(String path) {
		StringBuffer buffer = new StringBuffer();
		int c = 0;
		try {
			FileReader fis = new FileReader(path);
			while (( c = fis.read()) != -1 ) {
				buffer.append((char)c);
			}
			fis.close();
			return buffer.toString();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	} 

}
