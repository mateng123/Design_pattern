package com.mateng.composite;

public class Client {
	public static void main(String[] args) {
		Folder f1 = new Folder("�ҵ��ղ�");
		AbstractFile f2,f3,f4,f5,f6;
		
		f2 = new ImageFile("����˧����ͷ��.jpg");
		f3 = new TextFile("Hello.txt");
		f1.add(f2);
		f1.add(f3);
		
		Folder f11 = new Folder("��Ӱ");
		
		f4 = new VideoFile("���е�.avi");
		f5 = new VideoFile("�ٶ��뼤��.avi");
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);
		
		//f2.killVirus();
		f1.killVirus();
	}
}
