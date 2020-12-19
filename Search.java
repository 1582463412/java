package swpu;

public class Search {
	//书写两种方法（学号，姓名）
	 
	 public int StuNum(Student arr[] ,String y)//传入数组，查找值 ,使用字符串的比较
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
