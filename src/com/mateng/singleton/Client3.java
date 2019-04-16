package com.mateng.singleton;

import java.util.concurrent.CountDownLatch;

/*
 * 测试多线程环境下的五种创建单例模式的效率
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
		System.out.println("总耗时："+(end-start));
	}
}
