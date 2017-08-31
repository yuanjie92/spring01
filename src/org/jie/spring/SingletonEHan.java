package org.jie.spring;
/**
 * ถ๖บบ
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
