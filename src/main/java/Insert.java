import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {
	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		//Session session=factory.getCurrentSession();
//		session.getTransaction().begin();
		System.out.println("session opened");
		Employee employee=new Employee();
		employee.setName("Hibernate");
		
		
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
		session.close();
		System.out.println("Done");
	}
}
