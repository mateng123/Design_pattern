package com.mateng.composite;
/*
 * �������
 */
public interface Component {

}
//Ҷ�����
interface Leaf extends Component{
	
}
//�������
interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}
