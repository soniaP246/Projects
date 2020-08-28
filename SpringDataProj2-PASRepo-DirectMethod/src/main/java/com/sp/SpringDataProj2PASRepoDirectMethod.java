package com.sp;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sp.dto.CustomerDTO;
import com.sp.service.CustomerMgmtService;

@SpringBootApplication
public class SpringDataProj2PASRepoDirectMethod {

	public static void main(String[] args) {
		
			ApplicationContext ctx=null;
			CustomerMgmtService service=null;
			CustomerDTO dto=null, dto1=null, dto2=null;
			List<CustomerDTO>listDTO=null;
			//get IOC container
			ctx=SpringApplication.run(SpringDataProj2PASRepoDirectMethod.class, args);
			//get Service class obj
			service=ctx.getBean("custService",CustomerMgmtService.class);
			//invoke method
			//System.out.println(".....................................................");
			//service.fetchAllRecordsSortByProperty("cname", false).forEach(System.out::println);;
			//service.fetchAllRecordsSortByProperties(false, "cname", "cadd", "billAmt").forEach(System.out::println);;
            System.out.println("..........................................................");
			service.fetchRecordsByPageNoAndSize(0,3).forEach(System.out::println);

			//close  container
			((ConfigurableApplicationContext) ctx).close();
		}

}
