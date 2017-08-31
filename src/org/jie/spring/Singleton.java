package org.jie.spring;
/**
 * 懒汉
 * 线程不安全
 * @author yuanjie
 *
 */
public class Singleton {
	private static Singleton instance;
	//保证其他类不能实例化当前类
	private Singleton(){}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}
