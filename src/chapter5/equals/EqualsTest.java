package chapter5.equals;

/**
 * 
 * @author Administrator
 *
 */
public class EqualsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee wsz1 = new Employee("wsz", 75000, 2012, 1, 17);
		Employee wsz2 = wsz1;
		Employee wsz3 = new Employee("wsz", 75000, 2012, 1, 17);
		
		Employee gao = new Employee("gao", 75000, 2011, 1, 17);
		
		System.out.println("wsz1 == wsz2 : " + (wsz1 == wsz2));
		System.out.println("wsz1 == wsz3 : " + (wsz1 == wsz3));
		System.out.println("wsz2 == wsz3 : " + (wsz2 == wsz3));
		
		System.out.println("wsz1.equals(wsz): " + wsz1.equals(wsz3) );
		
		System.out.println("wsz1.equals(gao): " + wsz1.equals(gao));
		
		System.out.println("gao.toString(): " + gao.toString());
		
		Manager wei = new Manager("Wei", 100000, 2010, 1, 1);
		Manager boss = new Manager("wei", 100000, 2010, 1, 1);
		boss.setBonus(10000);
		
		System.out.println("boss.toString(): " + boss.toString());
		
		System.out.println("wei.equals(boss): " + wei.equals(boss));
		System.out.println("wei.hashCode: " + wei.hashCode());
		System.out.println("boss.hashCode: " + boss.hashCode());
		
		System.out.println("wsz1.hashCode: " + wsz1.hashCode());
		System.out.println("wsz2.hashCode: " + wsz2.hashCode());
		System.out.println("wsz3.hashCode: " + wsz3.hashCode());
		System.out.println("gao.hashCode: " + gao.hashCode());
		
		System.out.println("gao.getClass():" + gao.getClass());
		System.out.println("gao.getClass().getName():" + gao.getClass().getName());
	}
}
