package swpu;

public class Search {
	//��д���ַ�����ѧ�ţ�������
	 
	 public int StuNum(Student arr[] ,String y)//�������飬����ֵ ,ʹ���ַ����ıȽ�
	 {
	 for(int i = 0;i<arr.length;i++)
	 {
	 if(arr[i].number.equals(y))
	 return i;
	 }
	 return -1;
	 }
	 public int StuNam(Student stu[] ,String x) {
	 for(int i = 0;i<stu.length;i++)
	 {
	 if(stu[i].name.equals(x))
	 return i;
	 }
	 return -1;
	 }
}
