package org.spring.schedule;

import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/*第一种
 * public class MyTask extends QuartzJobBean {
	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException {

		System.out.println(Thread.currentThread().getName()+"----》你好");
	}

}*/

/*public class MyTask  {
	public void taskquart()  {
		System.out.println("【当前的日期时间】" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new java.util.Date()));
	}

}*/
@Component
public class MyTask{
	@Scheduled(cron="* * * * * ?")
	public void taskquart() {
		System.out.println("【当前的日期时间】" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new java.util.Date()));
		
	}
	
}
