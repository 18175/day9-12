package cn.itcast.demo01;

/*
 *   定义好的Person类进行测试
 *   创建对象,对象调用属性和方法
 */
public class PersonTest {

	public static void main(String[] args) {
		//创建Person类的对象  new
		Person p = new Person();
		//对成员变量赋值
		//p.age = -200;
		//对成员变量age赋值,只能调用Set方法赋值
		p.setAge(50);
		
		p.name = "张三";
		//调用类中方法
		p.speak();
		
		//输出成员变量age值,必须调用get方法
		System.out.println(p.getAge());
	}

}

 class Person {
	 //人的姓名,成员变量
	String name;
	//人的年龄,成员变量
	private int age ;
	
	//变量age被私有,提供方法,让外面的类使用
	//定义方法,对age变量进行赋值,方法名字,必须set开头
	public void setAge(int a){
		//对变量参数a进行范围的限制
		if(a<0 || a > 200){
			//如果a超过范围,手动将age赋值为20
			age = 20;
		}else{
		//如果a没有超过范围,直接对age赋值
		age = a;
		}
	}
	
	//定义方法,对变量age获取值使用,方法名字get
	public int getAge(){
		return age;
	}
	
	
	//定义人的说话功能,方法中,要求说出自己的姓名和年龄
	public void speak(){
		System.out.println(name+"..."+age);
	}
}