package ch03;

import java.util.Scanner;

// 콜리 (호출자)
public class MyArticle {

	String article;
	WriteArticle hacker;
	WriteArticle sbs;
	WriteArticle mbc;
	// 주소값 연결

	public MyArticle(WriteArticle hacker, WriteArticle sbs, WriteArticle mbc) {
		this.hacker = hacker;
		this.sbs = sbs;
		this.mbc = mbc;
	}

	public void complete() {
		// 스캐너를 사용해서 사용자 입력값을 받고 콜백 메서드를 실행 시켜주세요.
		// nextLine
		Scanner sc = new Scanner(System.in);
		article = sc.nextLine();
		
		hacker.printArticle(article);
		sbs.printArticle(article);
		mbc.printArticle(article);
	}
}
