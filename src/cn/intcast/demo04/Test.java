package cn.intcast.demo04;



class Keyboard implements USB{
	public void open(){
		System.out.println("��������");
	}
	public void close(){
		System.out.println("�رռ���");
	}
}
 class Computer {
	public void openComputer(){
		System.out.println("�ʼǱ�����");
	}
	
	public void closeComputer(){
		System.out.println("�ʼǱ��ػ�");
	}
	
	//ʹ��USB�豸����,�ĸ��豸
	//�����Ĳ���,����USB�豸
	public void useUSB(USB usb){// USB usb = new Mouse()
		usb.open();
		usb.close();
	}
	
}
 class Mouse implements USB{
	public void open(){
		System.out.println("�������");
	}
	
	public void close(){
		System.out.println("�ر����");
	}
}
 interface USB {
	public abstract void open();
	public abstract void close();
}

  public class Test {
	public static void main(String[] args) {
		//�����ʼǱ�����,���ñʼǱ��Ĺ���
		Computer com = new Computer();
		com.openComputer();
		
		//���ñʼǱ�ʹ��USB�豸�ķ���
		//����,��USB�ӿ�����,�ӿڲ��ܽ�������
		//���÷���,����USB�ӿڵ�ʵ����Ķ���
		//Mouse m = new Mouse();
		com.useUSB(new Mouse());
		//ʹ��USB�豸,ʹ�ü���
		com.useUSB(new Keyboard());
		
		com.closeComputer();
	}
}
