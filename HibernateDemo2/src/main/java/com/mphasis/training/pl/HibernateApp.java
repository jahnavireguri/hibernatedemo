package com.mphasis.training.pl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mphasis.training.entites.Account;
import com.mphasis.training.entites.CurrentAccount;
import com.mphasis.training.entites.Laptop;
import com.mphasis.training.entites.Order;
import com.mphasis.training.entites.Person;
import com.mphasis.training.entites.Product;
import com.mphasis.training.entites.SavingsAccount;
import com.mphasis.training.entites.Student;
import com.mphasis.training.util.HibernateUtil;



public class HibernateApp {
	public static void main(String[] args) {
//	Configuration con=  new Configuration()
//            .configure()
//             .addAnnotatedClass(Account.class).addAnnotatedClass(SavingsAccount.class).addAnnotatedClass(CurrentAccount.class);
//StandardServiceRegistryBuilder builder=
//   new StandardServiceRegistryBuilder()
//.applySettings(con.getProperties());

SessionFactory sessionFactory = HibernateUtil.getSessionFactory();


//crieria
Session session =sessionFactory.openSession();
List<Account> account=session.createCriteria(Account.class).list();
for(Account a:account) {
	System.out.println(a.getAcc_holder_name()+" "+a.getAccnum()+" "+a.getBalance());
}
session.close();

//HQL FROM ACCOUNT

Session session1=sessionFactory.openSession();
Query query=session1.createQuery("FROM Account");
query.list().forEach(System.out::println);

//HQL
Query query1= session1.createQuery("SELECT a.accnum FROM Account a");
query1.list().forEach(System.out::println);

//HQL
session1.beginTransaction();
Query qd=session1.createQuery("DELETE FROM Account WHERE accnum=:acc");
qd.setParameter("acc", 123);
qd.executeUpdate();
session1.getTransaction().commit();
System.out.println("deletd");

session1.close();

//sql 
Session s2= sessionFactory.openSession();
SQLQuery sqlQuery =s2.createSQLQuery("select acc_holder_name, accnum from account");
List<Object[]> objects=sqlQuery.list();
for(Object[] row:objects) {
	Account a= new Account();
	a.setAccnum(Integer.parseInt(row[1].toString()));
	a.setAcc_holder_name(row[0].toString());
	System.out.println(a.getAcc_holder_name()+" "+a.getAccnum());
	

}


//Student st = new Student();
//st.setName("priya");
//st.getEmail().add("priya@gmail.com");
//st.getEmail().add("priya@mphasis.com");
//st.getLp().setLpcode("LP124");
//st.getLp().setBrand("Hp");
//st.getLp().setHddsize(1);
//st.getLp().setRamsize(20);
//st.getLp().setProcessor("MediaTeck");
//
//
//Session session = sessionFactory.openSession();
//session.beginTransaction();
//session.save(st);
//session.getTransaction().commit();
//session.close();
//System.out.println("added");

//Person person = new Person();
//person.setName("jahnavi");
//person.getProduct().setPname("laptop");
//person.getProduct().setPname("bluetooth");
//person.getOrder();
//
//Account a= new Account();
//a.setAcc_holder_name("swathi");
//a.setAccnum(1);
//a.setBalance(567348);
//
//SavingsAccount s=new SavingsAccount();
//s.setAcc_holder_name("sowmya");
//s.setAccnum(2);
//s.setBalance(67584);
//s.setAdharNum(12345);
//
//CurrentAccount c= new CurrentAccount();
//c.setAcc_holder_name("supriya");
//c.setAccnum(78643);
//c.setAccnum(3);
//c.setGstin(67858);
//
//Session session = sessionFactory.openSession();
//session.beginTransaction();
//session.save(a);
//session.save(s);
//session.save(c);
//session.getTransaction().commit();
//session.close();
//System.out.println("added");



}}
