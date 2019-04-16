package com.mateng.singleton;

import java.util.concurrent.CountDownLatch;

/*
 * ���Զ��̻߳����µ����ִ�������ģʽ��Ч��
 */
public class Client3 {
	public static void main(String[] args) throws Exception{
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		
		for(int i=0;i<threadNum;i++) {
				new Thread(new Runnable(){
					@Override
					public void run() {
						for(int i=0;i<1000000;i++) {
							Object o = SingletonDemo2.getInstance();
						}
						countDownLatch.countDown();
					}
					
				}).start(); 
			}
		countDownLatch.await();
		long end = System.currentTimeMillis();
		System.out.println("�ܺ�ʱ��"+(end-start));
	}
}
