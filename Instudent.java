package swpu;
import java.util.Scanner;
public class Instudent {
	 
	 public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 Scanner in = new Scanner(System.in);
	 Student []stu = new Student[5];
	 //ѧ���ɼ���ʼ�� 
	 stu[0] = new Student("Jack","�� ","201903101",80,90,85);
	 stu[1] = new Student("Rose","������","201903102",99,93,90);
	 stu[2] = new Student("John","����ȫ","201903103",87,70,74);
	 stu[3] = new Student("Andi","������","201903104",67,66,68);
	 stu[4] = new Student("Mike","������","201903105",56,90,55);
	 //�ֲ������ĳ�ʼ��
	 String nu1 = "";
	 String na1 = "";
	 String ma1 = "";
	 int t1=0,t2=0,t3=0;
	 System.out.println("-------------------ѧ���ɼ�����ϵͳ------------------------");
	 //����ѧ����Ϣ
	 for(int i=0;i<stu.length;i++) {
	 System.out.println("�������"+(i+1)+"��ѧ����������רҵ��ѧ�ţ���ѧ�ɼ���������ɼ���Ӣ��ɼ�"); 
	 na1 = in.next();//����
	 ma1 = in.next();//רҵ
	 nu1 = in.next();//ѧ��
	 t1 = in.nextInt();
	 t2 = in.nextInt();
	 t3 = in.nextInt();
	 stu[i].setNumber(nu1);
	 stu[i].setName(na1);
	 stu[i].setMajor(ma1);
	 stu[i].setEnglish(t3);
	 stu[i].setComputer(t2);
	 stu[i].setMath(t1);
	 }
	 Search search = new Search();
	 //ѡ����Ҫ�Ĳ��ҵķ���
	 System.out.println("ѡ����Ҫ�Ĳ��ҵķ���, 1ѧ�ţ�2����");
	 int p = in.nextInt();
	 if(p==1) {
	 //ʹ��ѧ�ŵķ������в���
	 System.out.println("����������Ҫ���ҵ�ѧ��ѧ��");
	 String y = in.next();
	 int x = search.StuNum(stu,y);
	 if(x>=0)
	 System.out.println("ѧ��:"+stu[x].number+" ѧ��:"+stu[x].name+" רҵ:"+stu[x].major+" ��ѧ:"+stu[x].math+" �����:"+stu[x].computer+" Ӣ��:"+stu[x].english);
	 else
	 System.out.println("�����ѧ��������");
	 }
	 if(p==2) {
	 //ʹ�������ķ������в���
	 System.out.println("����������Ҫ���ҵ�ѧ������");
	 String thename = in.next();
	 int w = search.StuNam(stu,thename);
	 if(w>=0)
	 System.out.println("ѧ��:"+stu[w].number+" ѧ��:"+stu[w].name+" רҵ:"+stu[w].major+" ��ѧ:"+stu[w].math+" �����:"+stu[w].computer+" Ӣ��:"+stu[w].english);
	 else
	 System.out.println("�����ѧ��������");
	 }
	 System.out.println("�Ƿ���Ҫ�Ե��Ƴɼ��������� [Y/N] 1 =yes,2=no");
	 int op = in.nextInt();
	 if(op==1) {
	 //���Ƴɼ���������������Ҫ��ĿȻ��ֱ�ӽ�������
	 Rank rank = new Rank();//��������
	 System.out.println("��������Ҫ����ĳɼ���� , 1����ѧ��2��Ӣ�3�������");
	 int major = in.nextInt();
	 rank.rankscore(stu,major);
	 //��������ĳɼ�
	 for(int i = 0;i < stu.length;i++) {
	 System.out.println("ѧ��:"+stu[i].number+" ѧ��:"+stu[i].name+" רҵ:"+stu[i].major+" ��ѧ:"+stu[i].math+" �����:"+stu[i].computer+" Ӣ��:"+stu[i].english);
	 }
	 }
	 else {
	 System.out.println("�������˳�ϵͳ");
	 }
	 }
	  
}
