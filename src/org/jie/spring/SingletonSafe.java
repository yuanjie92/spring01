package org.jie.spring;
/**
 * 懒汉
 * 线程安全
 * @author yuanjie
 *
 */
public class SingletonSafe {
	private static SingletonSafe instance;
	//保证其他类不能实例化当前类
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
