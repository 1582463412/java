package swpu;
import java.util.Scanner;
public class Instudent {
	 
	 public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 Scanner in = new Scanner(System.in);
	 Student []stu = new Student[5];
	 //学生成绩初始化 
	 stu[0] = new Student("Jack","软工 ","201903101",80,90,85);
	 stu[1] = new Student("Rose","大数据","201903102",99,93,90);
	 stu[2] = new Student("John","网安全","201903103",87,70,74);
	 stu[3] = new Student("Andi","网工程","201903104",67,66,68);
	 stu[4] = new Student("Mike","物联网","201903105",56,90,55);
	 //局部变量的初始化
	 String nu1 = "";
	 String na1 = "";
	 String ma1 = "";
	 int t1=0,t2=0,t3=0;
	 System.out.println("-------------------学生成绩管理系统------------------------");
	 //输入学生信息
	 for(int i=0;i<stu.length;i++) {
	 System.out.println("请输入第"+(i+1)+"个学生的姓名，专业，学号，数学成绩，计算机成绩，英语成绩"); 
	 na1 = in.next();//姓名
	 ma1 = in.next();//专业
	 nu1 = in.next();//学号
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
	 //选择需要的查找的方法
	 System.out.println("选择需要的查找的方法, 1学号，2姓名");
	 int p = in.nextInt();
	 if(p==1) {
	 //使用学号的方法进行查找
	 System.out.println("输入您所需要查找的学生学号");
	 String y = in.next();
	 int x = search.StuNum(stu,y);
	 if(x>=0)
	 System.out.println("学号:"+stu[x].number+" 学生:"+stu[x].name+" 专业:"+stu[x].major+" 数学:"+stu[x].math+" 计算机:"+stu[x].computer+" 英语:"+stu[x].english);
	 else
	 System.out.println("输入的学生不存在");
	 }
	 if(p==2) {
	 //使用姓名的方法进行查找
	 System.out.println("输入您所需要查找的学生姓名");
	 String thename = in.next();
	 int w = search.StuNam(stu,thename);
	 if(w>=0)
	 System.out.println("学号:"+stu[w].number+" 学生:"+stu[w].name+" 专业:"+stu[w].major+" 数学:"+stu[w].math+" 计算机:"+stu[w].computer+" 英语:"+stu[w].english);
	 else
	 System.out.println("输入的学生不存在");
	 }
	 System.out.println("是否需要对单科成绩进行排名 [Y/N] 1 =yes,2=no");
	 int op = in.nextInt();
	 if(op==1) {
	 //单科成绩的排序（输入所需要科目然后直接进行排序）
	 Rank rank = new Rank();//创建对象
	 System.out.println("输入所需要排序的成绩编号 , 1：数学，2：英语，3：计算机");
	 int major = in.nextInt();
	 rank.rankscore(stu,major);
	 //输出排序后的成绩
	 for(int i = 0;i < stu.length;i++) {
	 System.out.println("学号:"+stu[i].number+" 学生:"+stu[i].name+" 专业:"+stu[i].major+" 数学:"+stu[i].math+" 计算机:"+stu[i].computer+" 英语:"+stu[i].english);
	 }
	 }
	 else {
	 System.out.println("结束，退出系统");
	 }
	 }
	  
}
