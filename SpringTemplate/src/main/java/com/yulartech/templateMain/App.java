package com.yulartech.templateMain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import com.yulartech.aoptest.CustomerBo;
import com.yulartech.helloworld.HelloWorld;
import com.yulartech.templateDao.CustomerDBDAO;
import com.yulartech.templateDao.StockBo;
import com.yulartech.templateDomain.Consumer;
import com.yulartech.templateDomain.Customer;
import com.yulartech.templateDomain.CustomerDB;
import com.yulartech.templateDomain.Customers;
import com.yulartech.templateDomain.Item;
import com.yulartech.templateDomain.Stock;
import com.yulartech.templateOutput.FileGenerator;
import com.yulartech.templateOutput.OutputHelper;
import com.yulartech.templateOutput.XMLConverter;
import com.yulartech.templateService.CustomerService;
import com.yulartech.templateService.MailService;
import com.yulartech.templateService.TestSpringEL;

public class App {
	private static final String XML_FILE_NAME = "templatecustomers.xml";
	
	public static void main(String[] args) throws IOException {
/*		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		HelloWorld obj = (HelloWorld) context.getBean("templateBean");
		obj.printHello(); */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
		OutputHelper output = (OutputHelper)context.getBean("templateOutputHelper");
		output.generateOutput();
		
		System.out.println("");
		
		Customer cust = (Customer)context.getBean("templateCustomerBean");
		System.out.println(cust);
		
		System.out.println("");
		
		FileGenerator fg = (FileGenerator)context.getBean("templateFileGenerator");
		System.out.println(fg);
		
		System.out.println("");
		
		Consumer consu = (Consumer)context.getBean("templateConsumerBean");
		System.out.println(consu);
		
		System.out.println("");
		
		CustomerService custA = (CustomerService)context.getBean("templateCustomerService");
    	custA.setMessage("Message by custA");
    	System.out.println("Message : " + custA.getMessage());
    	
    	//retrieve it again
    	CustomerService custB = (CustomerService)context.getBean("templateCustomerService");
    	System.out.println("Message : " + custB.getMessage());
    	
    	System.out.println("");
    	
   /* 	System.out.println("");
    	CustomerService custC = (CustomerService)context.getBean("templateCustomerServiceProxy");
    	System.out.println("*************************");
		custC.printName();
		System.out.println("*************************");
		custC.printURL();
		System.out.println("*************************");
		try {
			custC.printThrowException();
		} catch (Exception e) {

		} */
    	
    	Customers custs = (Customers)context.getBean("templateCustomersBean");
		System.out.println(custs);
		
		ConfigurableApplicationContext confContext = new ClassPathXmlApplicationContext(new String[] {"Spring-Module.xml"});
		
	    CustomerService custSev = (CustomerService)context.getBean("templateCustomerService");
	    	
	    System.out.println(custSev);
	    	
	    confContext.close();
	    
	    TestSpringEL tsel = new TestSpringEL();
	    tsel.testSpringElRes();
	    
	    XMLConverter converter = (XMLConverter) context.getBean("templateXMLConverter");
		Customers custD = new Customers();
		custD.setCountry("CN");
		custD.setType(30);
		custD.setAction("Run ~");
		
		System.out.println("Convert Object to XML!");
		//from object to XML file
		converter.convertFromObjectToXML(custD, XML_FILE_NAME);
		System.out.println("Done \n");
		
		System.out.println("Convert XML back to Object!");
		//from XML to object
		Customers custD2 = (Customers)converter.convertFromXMLToObject(XML_FILE_NAME);
		System.out.println(custD2);
		System.out.println("Done");
		

/*
		CustomerDBDAO customerDBDAO = (CustomerDBDAO)context.getBean("customerDAO");
        CustomerDB customer = new CustomerDB(1, "yular",18);
        customerDBDAO.insert(customer);
    	
        CustomerDB customer1 = customerDBDAO.findByCustomerId(1);
        System.out.println(customer1);
        customer1 = new CustomerDB(1, "yular",21);
        CustomerDB customer3 = new CustomerDB(2, "yular",22);
        CustomerDB customer2 = new CustomerDB(3, "yular",23);
  
        List<CustomerDB>customers = new ArrayList<CustomerDB>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        
        customerDBDAO.insertBatch(customers);

        String sql = "UPDATE CUSTOMER SET NAME ='BATCHUPDATE'";
        customerDBDAO.insertBatchSQL(sql);
        
        CustomerDB customerA = customerDBDAO.findByCustomerId(1);
        System.out.println("Customer A : " + customerA);
        
        CustomerDB customerB = customerDBDAO.findByCustomerId2(1);
        System.out.println("Customer B : " + customerB);
        
        List<CustomerDB> customerAs = customerDBDAO.findAll();
        for(CustomerDB custit: customerAs){
        	 System.out.println("Customer As : " + customerAs);
        }
       
        List<CustomerDB> customerBs = customerDBDAO.findAll2();
        for(CustomerDB custit: customerBs){
        	 System.out.println("Customer Bs : " + customerBs);
        }
        
        String customerName = customerDBDAO.findCustomerNameById(1);
        System.out.println("Customer Name : " + customerName);
        
        int total = customerDBDAO.findTotalCustomer();
        System.out.println("Total : " + total);
 */       
/*		StockBo stockBo = (StockBo)context.getBean("stockBo");
    	
    	/** insert **/
/*    	Stock stock = new Stock();
    	stock.setStockCode("7668");
    	stock.setStockName("HAIO");
    	stockBo.save(stock);
    	
    	/** select **/
/*    	Stock stock2 = stockBo.findByStockCode("7668");
    	System.out.println(stock2);
    	
    	/** update **/
/*    	stock2.setStockName("HAIO-1");
    	stockBo.update(stock2);
    	
    	/** delete **/
 /*   	stockBo.delete(stock2);
    	
    	System.out.println("Done");
    	
 /*       MailService mm = (MailService) context.getBean("templateMailService");
        mm.sendMail("from@no-spam.com",
    		   "to@no-spam.com",
    		   "Testing123", 
    		   "Testing only \n\n Hello Spring Email Sender");
*/		
	/*	CustomerBo customer = (CustomerBo) context.getBean("customerBo");
		customer.addCustomer();
    	
/*		ApplicationContext contextAnnotation = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld obj = (HelloWorld)contextAnnotation.getBean("helloBean");
		obj.printHelloWorld(" XCC ~"); */
		
//		new ClassPathXmlApplicationContext("Spring-Scheduler.xml");
	}
}

