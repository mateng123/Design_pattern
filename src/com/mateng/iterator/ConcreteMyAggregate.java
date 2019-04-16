package com.mateng.iterator;

import java.util.ArrayList;
import java.util.List;

/*
 * 自定义的聚合类
 */
public class ConcreteMyAggregate {
	private List<Object> list = new ArrayList<Object>();

	
	//获得迭代器
	public MyIterator createIterator() {
		return new ConcreteIterator();
	}
	
	public void addObject(Object obj) {
		this.list.add(obj);
	}
	public void removeObject(Object obj) {
		this.list.remove(obj);
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	//使用内部类定义迭代器，可以直接使用外部类的属性
	private class ConcreteIterator implements MyIterator{
		
		private int cursor; //用于记录遍历的位置
		
		@Override
		public void first() {
			cursor =0;			
		}

		@Override
		public void next() {
			if(cursor<list.size()) {
				cursor++;
			}
		}

		@Override
		public boolean hasNext() {
			if(cursor<list.size()) {
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			return cursor==0?true:false;
		}

		@Override
		public boolean isLast() {
			return cursor==(list.size()-1)?true:false;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(cursor);
		}
		
	}
}
