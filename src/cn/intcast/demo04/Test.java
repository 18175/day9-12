package cn.intcast.demo04;



class Keyboard implements USB{
	public void open(){
		System.out.println("开启键盘");
	}
	public void close(){
		System.out.println("关闭键盘");
	}
}
 class Computer {
	public void openComputer(){
		System.out.println("笔记本开机");
	}
	
	public void closeComputer(){
		System.out.println("笔记本关机");
	}
	
	//使用USB设备方法,哪个设备
	//方法的参数,就是USB设备
	public void useUSB(USB usb){// USB usb = new Mouse()
		usb.open();
		usb.close();
	}
	
}
 class Mouse implements USB{
	public void open(){
		System.out.println("开启鼠标");
	}
	
	public void close(){
		System.out.println("关闭鼠标");
	}
}
 interface USB {
	public abstract void open();
	public abstract void close();
}

  public class Test {
	public static void main(String[] args) {
		//创建笔记本对象,调用笔记本的功能
		Computer com = new Computer();
		com.openComputer();
		
		//调用笔记本使用USB设备的方法
		//参数,是USB接口类型,接口不能建立对象
		//调用方法,传递USB接口的实现类的对象
		//Mouse m = new Mouse();
		com.useUSB(new Mouse());
		//使用USB设备,使用键盘
		com.useUSB(new Keyboard());
		
		com.closeComputer();
	}
}
