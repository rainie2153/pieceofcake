package laoOffertest;
import laiOfferpackage.Employee;

public class Employeetest {
	public static void main(String args[]) {
		Employee empOne = new Employee("Rainie");//test下的创建了2个对象
		Employee empTwo = new Employee("Yu");
		
		//调用2个对象的成员方法
		empOne.empAge(18);
		empOne.printEmployee();
		empTwo.empAge(20);
		empTwo.printEmployee();
		
	}
}
/*面向对象的3特征－封装 继承 多态。继承is between class and class.we can
think inheritance as inherit from one class from another class the method and
its properties or attributes. so that B class has all the methods and attributes
from class a. we use extends key word.
* 
*
*interface
*There is a problem in 多态：instanceof运算符来判断一个变量所引用的对象的实际类型
*
*/