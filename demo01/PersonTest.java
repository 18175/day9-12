package cn.itcast.demo01;

/*
 *   ����õ�Person����в���
 *   ��������,����������Ժͷ���
 */
public class PersonTest {

	public static void main(String[] args) {
		//����Person��Ķ���  new
		Person p = new Person();
		//�Գ�Ա������ֵ
		//p.age = -200;
		//�Գ�Ա����age��ֵ,ֻ�ܵ���Set������ֵ
		p.setAge(50);
		
		p.name = "����";
		//�������з���
		p.speak();
		
		//�����Ա����ageֵ,�������get����
		System.out.println(p.getAge());
	}

}

 class Person {
	 //�˵�����,��Ա����
	String name;
	//�˵�����,��Ա����
	private int age ;
	
	//����age��˽��,�ṩ����,���������ʹ��
	//���巽��,��age�������и�ֵ,��������,����set��ͷ
	public void setAge(int a){
		//�Ա�������a���з�Χ������
		if(a<0 || a > 200){
			//���a������Χ,�ֶ���age��ֵΪ20
			age = 20;
		}else{
		//���aû�г�����Χ,ֱ�Ӷ�age��ֵ
		age = a;
		}
	}
	
	//���巽��,�Ա���age��ȡֵʹ��,��������get
	public int getAge(){
		return age;
	}
	
	
	//�����˵�˵������,������,Ҫ��˵���Լ�������������
	public void speak(){
		System.out.println(name+"..."+age);
	}
}