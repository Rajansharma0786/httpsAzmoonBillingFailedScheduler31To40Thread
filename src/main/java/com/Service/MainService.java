package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entity.BillingEntity;
import com.Entity.TblBillingLogs;
import com.Repository.TblBillingLogsRepo;
import com.Repository.TblBillingRepo;

@Service
public class MainService 

{

	@Autowired
	TblBillingRepo billingRepo;
	
	@Autowired
	TblBillingLogsRepo billingLogsRepo;
	
	public void getRequest(TblBillingLogs logs)
	{
		try {
			List<BillingEntity> billing = billingRepo.findByAni(logs.getAni());
			if(billing.size()==0) 
			{
			BillingEntity billingEntity = new BillingEntity();
			billingEntity.setAmount(logs.getAmount());
			billingEntity.setAni(logs.getAni());
//		billingEntity.setBillingDate(logs.getBillingDate());
			billingEntity.setBillingDateTime(logs.getBillingDateTime());
//		billingEntity.setDate(logs.getDate());
			billingEntity.setDateTime(logs.getDateTime());
			billingEntity.setMAct(logs.getMAct());
			billingEntity.setPackType(logs.getPackType());
			billingEntity.setService(logs.getService());
			if(logs.getType()=="sub")
			{
				billingEntity.setStatus("0");
				billingEntity.setBillingStatus(logs.getFailedStatus());
				billingEntity.setBillingType("auto");
				billingRepo.save(billingEntity);
			}
			else 
			{
			billingEntity.setStatus(String.valueOf(logs.getFailedStatus()));
			billingEntity.setBillingStatus(logs.getFailedStatus());
			billingEntity.setBillingType("auto");
			billingRepo.save(billingEntity);
			}
			
			billingEntity.setType(logs.getType());
			billingEntity.setLastBilledDate(logs.getLastBilledDate());
			billingEntity.setNextBilledDate(logs.getNextBilledDate());
			billingEntity.setLanguage(logs.getLanguage());

			billingRepo.save(billingEntity);

			System.out.println("Schedulers For Failed Type");

			logs.setFailedStatus("Done");
			billingLogsRepo.save(logs);
			System.out.println("Status updated for failed logs"+logs.getAni());

		}
		
			else {
				logs.setFailedStatus("AlreadyExist");
				billingLogsRepo.save(logs);
				System.out.println("Status Updated For AlreadyExist"+logs.getAni());
			}
		
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
