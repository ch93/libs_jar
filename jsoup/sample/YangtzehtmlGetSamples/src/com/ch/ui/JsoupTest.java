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
		if (state == 1) {      //DOM 方法查找元素
			
			//查找元素
			Elements links = doc.getElementsByTag("h1");
			//元素数据
			String linkHref = links.attr("align");
			String linkText = links.text();
		    System.out.println("Tag 的属性" + linkHref);
		    System.out.println("Tag 的内容" + linkText);
			
//			//查找元素
//			Element content =  doc.getElementById("test1");   
//			Elements links = content.getElementsByTag("a");
//			for (Element link : links) {
//			  //元素数据
//			  String linkHref = link.attr("href");
//			  String linkText = link.text();
//			  System.out.println(linkHref);
//			  System.out.println(linkText);
//			}

		} else if (state == 2) {    //选择器的方法查找元素
			// Selector 选择器
			Elements links = doc.select("a");
			for (Element link : links) {
				  String linkHref = link.attr("href");
				  String linkText = link.text();
				  System.out.println(linkHref);
				  System.out.println(linkText);
				}
		} else if (state == 3){  
			// Selector 选择器组合使用
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
	 *  获取符合规则的字符串
	 * @param strHtml 源字符串
	 */
	private static void getHtmlText(String strHtml) {
		//获得一个Document实例对象
		Document doc = Jsoup.parse(strHtml);
		// Selector选择器
		Elements content =  doc.select(".test2");
		//查找元素
		Elements links = content.select("a");
		for (Element link : links) {
			  //元素数据
			  String linkHref = link.attr("href");
			  String linkText = link.text();
			  System.out.print(linkHref);
			  System.out.print("  " + linkText + "\n");
			  
			}
	}

}
