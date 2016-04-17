package com.ch.ui;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.ch.dal.ReadText;

public class JsoupTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReadText readText = new ReadText();
		String path = System.getProperty("user.dir")+"\\jsoup.txt";
		String temp = readText.readHtmlByFileReader(path);
		Document doc = Jsoup.parse(temp);
		int state = 3;
		if (state == 1) {      //DOM ��������Ԫ��
			
			//����Ԫ��
			Elements links = doc.getElementsByTag("h1");
			//Ԫ������
			String linkHref = links.attr("align");
			String linkText = links.text();
		    System.out.println("Tag ������" + linkHref);
		    System.out.println("Tag ������" + linkText);
			
//			//����Ԫ��
//			Element content =  doc.getElementById("test1");   
//			Elements links = content.getElementsByTag("a");
//			for (Element link : links) {
//			  //Ԫ������
//			  String linkHref = link.attr("href");
//			  String linkText = link.text();
//			  System.out.println(linkHref);
//			  System.out.println(linkText);
//			}

		} else if (state == 2) {    //ѡ�����ķ�������Ԫ��
			// Selector ѡ����
			Elements links = doc.select("a");
			for (Element link : links) {
				  String linkHref = link.attr("href");
				  String linkText = link.text();
				  System.out.println(linkHref);
				  System.out.println(linkText);
				}
		} else if (state == 3){  
			// Selector ѡ�������ʹ��
//			Elements content =  doc.select("#test2");
//			Elements links = content.select("a");
//			for (Element link : links) {
//				  String linkHref = link.attr("href");
//				  String linkText = link.text();
//				  System.out.println(linkHref);
//				  System.out.println(linkText);
//				}
			getHtmlText(temp);
		} else {
			
		}

	}
	/**
	 *  ��ȡ���Ϲ�����ַ���
	 * @param strHtml Դ�ַ���
	 */
	private static void getHtmlText(String strHtml) {
		//���һ��Documentʵ������
		Document doc = Jsoup.parse(strHtml);
		// Selectorѡ����
		Elements content =  doc.select(".test2");
		//����Ԫ��
		Elements links = content.select("a");
		for (Element link : links) {
			  //Ԫ������
			  String linkHref = link.attr("href");
			  String linkText = link.text();
			  System.out.print(linkHref);
			  System.out.print("  " + linkText + "\n");
			  
			}
	}

}
