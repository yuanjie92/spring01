package org.jie.spring;
/**
 * ����
 * �̲߳���ȫ
 * @author yuanjie
 *
 */
public class Singleton {
	private static Singleton instance;
	//��֤�����಻��ʵ������ǰ��
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}
