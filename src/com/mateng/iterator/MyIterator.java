package com.mateng.iterator;
/*
 * �Զ���ĵ������ӿ�
 */
public interface MyIterator {
	void first(); //���α�ָ���һ��Ԫ��
	void next();  //���α�ָ����һ��Ԫ��
	boolean hasNext();  //�ж��Ƿ������һ��Ԫ��
	
	boolean isFirst();
	boolean isLast();
	
	Object getCurrentObj();  //��õ�ǰ�α�ָ��Ķ���
	
}
