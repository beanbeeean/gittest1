package ch03;

import java.util.Scanner;

// �ݸ� (ȣ����)
public class MyArticle {

	String article;
	WriteArticle hacker;
	WriteArticle sbs;
	WriteArticle mbc;
	// �ּҰ� ����

	public MyArticle(WriteArticle hacker, WriteArticle sbs, WriteArticle mbc) {
		this.hacker = hacker;
		this.sbs = sbs;
		this.mbc = mbc;
	}

	public void complete() {
		// ��ĳ�ʸ� ����ؼ� ����� �Է°��� �ް� �ݹ� �޼��带 ���� �����ּ���.
		// nextLine
		Scanner sc = new Scanner(System.in);
		article = sc.nextLine();
		
		hacker.printArticle(article);
		sbs.printArticle(article);
		mbc.printArticle(article);
	}
}
