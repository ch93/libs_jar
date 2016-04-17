package com.ch.ui;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.ch.dal.ReadText;

public class RegexMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReadText readText = new ReadText();
		String path = System.getProperty("user.dir")+"\\jsoup.txt";
		String temp = readText.readHtmlByFileReader(path);
		
		getRegText(temp);
	}

	/**
	 * ��ȡ���Ϲ�����ַ���
	 * @param strReg Դ�ַ���
	 */
	private static void  getRegText(String strHtml) {
		//������ʽ
		String reg = "<[aA]\\s+.*?[hH][rR][eE][fF]=\\s*(\"|\\'|)?(.*?)(\\1)(\\s[^>]*)*?>(.*?)<\\/[aA]>";
		
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(strHtml);
		
		while (matcher.find()) {
			//�ҵ�ƥ����ַ���
			String findText = matcher.group();
			System.out.println(findText);
		}
	}
	
	
}
