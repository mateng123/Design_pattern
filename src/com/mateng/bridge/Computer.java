package com.mateng.bridge;

public interface Computer {
	void sale();
}

class Desktop implements Computer{

	@Override
	public void sale() {
		System.out.println("����̨ʽ��");
	}
	
}
class Laptop implements Computer{

	@Override
	public void sale() {
		System.out.println("���۱ʼǱ�");
	}
	
}
class Pad implements Computer{

	@Override
	public void sale() {
		System.out.println("����ƽ�����");
	}
	
}

class LenovoDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("��������̨ʽ��");
	}
}
class LenovoLaptop extends Desktop{

	@Override
	public void sale() {
		System.out.println("��������ʼǱ�");
	}
}
class LenovoPad extends Desktop{
	@Override
	public void sale() {
		System.out.println("��������ƽ�����");
	}
}

class shenzhuoDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("��������̨ʽ��");
	}
}
class shenzhuoLaptop extends Desktop{

	@Override
	public void sale() {
		System.out.println("�������ݱʼǱ�");
	}
}
class shenzhuoPad extends Desktop{
	@Override
	public void sale() {
		System.out.println("��������ƽ�����");
	}
}

class DellDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("���۴���̨ʽ��");
	}
}
class DellLaptop extends Desktop{

	@Override
	public void sale() {
		System.out.println("���۴����ʼǱ�");
	}
}
class DellPad extends Desktop{
	@Override
	public void sale() {
		System.out.println("���۴���ƽ�����");
	}
}