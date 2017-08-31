package org.jie.spring;
/**
 * ����
 * @author yuanjie
 *
 */
public class SingletonEHan {
	private static SingletonEHan instance = new SingletonEHan();
	
	private SingletonEHan(){}
	
	public static SingletonEHan getIntance(){
		return instance;
	}
}
