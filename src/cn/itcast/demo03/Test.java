package cn.itcast.demo03;

/*
 *  ����Ա������
 *    ���������������Ķ���
 */
public class Test {
	public static void main(String[] args) {
		JavaEE ee = new JavaEE();
		Network net = new Network();
		
		ee.setName("����");
		ee.setId("�з���001");
		
		net.setName("����");
		net.setId("ά����007");
		
	//	System.out.println(ee.getName()+"..."+ee.getId());
	//	System.out.println(net.getName()+"..."+net.getId());
		
		ee.work();
		net.work();
	}
}
/*
 *  ������������ά������ʦ
 *  ����ά������Ա��,�̳�ά������
 */
 class Network extends Maintainer{
	public void work(){
		System.out.println("���繤��ʦ�ڼ�������Ƿ�ͨ"+super.getName()+"..."+super.getId());
	}
}

 class Maintainer extends Employee{

}
 /*
  *  ����JavaEE��������ʦ��
  *    ����,���� ��������
  *  ������Ա��,Ҳ�߱���Щ����,��ȡ��������,�Լ��Ͳ���Ҫ������
  *  ���з���Ա����һ��,�̳��з�����
  */
  class JavaEE extends Develop{
 	//��д������ĸ���ĳ��󷽷�
 	public void work(){
 		//���ø����get����,��ȡname,idֵ
 		System.out.println("JavaEE�Ĺ���ʦ�����Ա�"+ super.getName()+".."+super.getId());
 	}
 }

  class Employee {
	//�����Ա��������
	private String name;
	//�����Ա��������
	private String Id; 
	
	
	//���幤������
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
   *  �����з�Ա����
   *    ����Ա���е�һ��, �̳�Ա���� 
   *    ������Develop ���Լ���Ա�������Լ��е�����
   */
  class Develop extends Employee{

  }
