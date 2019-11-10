package cn.itcast.demo03;

/*
 *  测试员工案例
 *    创建最下面的子类的对象
 */
public class Test {
	public static void main(String[] args) {
		JavaEE ee = new JavaEE();
		Network net = new Network();
		
		ee.setName("张三");
		ee.setId("研发部001");
		
		net.setName("李四");
		net.setId("维护部007");
		
	//	System.out.println(ee.getName()+"..."+ee.getId());
	//	System.out.println(net.getName()+"..."+net.getId());
		
		ee.work();
		net.work();
	}
}
/*
 *  描述的是网络维护工程师
 *  属于维护部的员工,继承维护部类
 */
 class Network extends Maintainer{
	public void work(){
		System.out.println("网络工程师在检查网络是否畅通"+super.getName()+"..."+super.getId());
	}
}

 class Maintainer extends Employee{

}
 /*
  *  描述JavaEE开发工程师类
  *    工号,姓名 工作方法
  *  其他的员工,也具备这些共性,抽取到父类中,自己就不需要定义了
  *  是研发部员工的一种,继承研发部类
  */
  class JavaEE extends Develop{
 	//重写他父类的父类的抽象方法
 	public void work(){
 		//调用父类的get方法,获取name,id值
 		System.out.println("JavaEE的工程师开发淘宝"+ super.getName()+".."+super.getId());
 	}
 }

  class Employee {
	//定义成员变量姓名
	private String name;
	//定义成员变量工号
	private String Id; 
	
	
	//定义工作方法
 void work() {
	 
 };

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
	
	
}
  /*
   *  定义研发员工类
   *    属于员工中的一种, 继承员工类 
   *    抽象类Develop 给自己的员工定义自己有的属性
   */
  class Develop extends Employee{

  }
