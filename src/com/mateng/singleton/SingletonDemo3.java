package com.mateng.singleton;
/*
 * 静态内部类实现单例模式
 */

public class SingletonDemo3 {
	private static class SingletonClassInstance{
		private static final SingletonDemo3 instance = new SingletonDemo3();
	}
	
	
	private SingletonDemo3() {
		
	}
	//方法没有同步，调用效率低!
	public static synchronized SingletonDemo3 getInstance() {
		return SingletonClassInstance.instance;
	}
	
}
