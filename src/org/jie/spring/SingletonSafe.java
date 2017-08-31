package org.jie.spring;
/**
 * ����
 * �̰߳�ȫ
 * @author yuanjie
 *
 */
public class SingletonSafe {
	private static SingletonSafe instance;
	//��֤�����಻��ʵ������ǰ��
	private SingletonSafe(){}
	
	public synchronized static SingletonSafe getInstance(){
		if(instance == null){
			synchronized(SingletonSafe.class){
				instance = new SingletonSafe();
			}
		}
		return instance;
	}
}
