package com.mateng.composite;

public class Client {
	public static void main(String[] args) {
		Folder f1 = new Folder("我的收藏");
		AbstractFile f2,f3,f4,f5,f6;
		
		f2 = new ImageFile("马腾帅气的头像.jpg");
		f3 = new TextFile("Hello.txt");
		f1.add(f2);
		f1.add(f3);
		
		Folder f11 = new Folder("电影");
		
		f4 = new VideoFile("碟中谍.avi");
		f5 = new VideoFile("速度与激情.avi");
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);
		
		//f2.killVirus();
		f1.killVirus();
	}
}
