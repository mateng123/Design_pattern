package com.mateng.bridge;

public interface Computer {
	void sale();
}

class Desktop implements Computer{

	@Override
	public void sale() {
		System.out.println("销售台式机");
	}
	
}
class Laptop implements Computer{

	@Override
	public void sale() {
		System.out.println("销售笔记本");
	}
	
}
class Pad implements Computer{

	@Override
	public void sale() {
		System.out.println("销售平板电脑");
	}
	
}

class LenovoDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("销售联想台式机");
	}
}
class LenovoLaptop extends Desktop{

	@Override
	public void sale() {
		System.out.println("销售联想笔记本");
	}
}
class LenovoPad extends Desktop{
	@Override
	public void sale() {
		System.out.println("销售联想平板电脑");
	}
}

class shenzhuoDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("销售神州台式机");
	}
}
class shenzhuoLaptop extends Desktop{

	@Override
	public void sale() {
		System.out.println("销售神州笔记本");
	}
}
class shenzhuoPad extends Desktop{
	@Override
	public void sale() {
		System.out.println("销售神州平板电脑");
	}
}

class DellDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("销售戴尔台式机");
	}
}
class DellLaptop extends Desktop{

	@Override
	public void sale() {
		System.out.println("销售戴尔笔记本");
	}
}
class DellPad extends Desktop{
	@Override
	public void sale() {
		System.out.println("销售戴尔平板电脑");
	}
}