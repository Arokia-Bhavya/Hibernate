import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.training.hb.Employee;  
  
    
public class StoreData {    
public static void main(String[] args) {    
        
   StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
          
   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
  
   SessionFactory factory = meta.getSessionFactoryBuilder().build();  
   Session session = factory.openSession();  
   Transaction t = session.beginTransaction();   
    System.out.println("insertion of record");         
    Employee e1=new Employee();    
    e1.setName("anitha"); 
    session.save(e1);
    System.out.println("successfully saved");  
    System.out.println("retrieval of record");  
    Employee employee=session.get(Employee.class, 102);   
    System.out.println(employee);
    employee.setName("maria");
    session.save(employee); 
    System.out.println("successfully updated");
    System.out.println(employee);
   
    System.out.println("retrieval of all records");  
    Query query= session.createQuery("from Employee");  
    List<Employee> emplist=query.list();
    for(Employee emp:emplist)
    {
    	System.out.println(emp);
    }
    t.commit(); 
    t = session.beginTransaction();
    employee = session.load(Employee.class, emplist.get(emplist.size() - 1).getId());
	session.delete(employee);
    System.out.println("successfully deleted");
    t.commit(); 
    factory.close();
    session.close();
        
}    
}   
