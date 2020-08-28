package com.sp;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.sp.dto.CustomerDTO;
import com.sp.service.CustomerMgmtService;

@SpringBootApplication
public class SpringDataProj3JpaRepoDirectMethod {

	public static void main(String[] args) {
		
			ApplicationContext ctx=null;
			CustomerMgmtService service=null;
			CustomerDTO dto=null;
			List<CustomerDTO>listDTO=null;
			//get IOC container
			ctx=SpringApplication.run(SpringDataProj3JpaRepoDirectMethod.class, args);
			//get Service class obj
			service=ctx.getBean("custService",CustomerMgmtService.class);
            dto = new CustomerDTO();
            dto.setCadd("hyd");
			/*
			  dto.setCname("raja"); dto.setBillAmt(11544.0);
			 
			
			service.fetchAllRecordsByGivenExampleDTO(dto).forEach(System.out::println);
			*/
            
            System.out.println("............................");
 		   System.out.println(service.removeAllCustomers());

			//close  container
			((ConfigurableApplicationContext) ctx).close();
		}

}
