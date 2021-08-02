import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.job.post.JobDao;
import com.job.post.JobEntity;

public class Start {
public static void main(String[] args) throws NumberFormatException, IOException {
	System.out.println("Welcome....");
	System.out.println("****************************************");
      
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	while(true) {
		System.out.println("POST THE JOB PRESS 1.....");
		System.out.println("Delete THE JOB PRESS 2....");
		System.out.println("SEE ALL JOB PRESS 3........");
		System.out.println("FOR UDATE THE JOB PRESS 4........");
		System.out.println("FOR EXIT PRESS 5........");
		int c =   Integer.parseInt (br.readLine());
		System.out.println("_____________*************_________________");
		if( c== 1) {
			// create ..add the job
			System.out.println("****************************************");
			System.out.println("Enter the Job Name");
			String j_name = br.readLine();
			System.out.println("Enter the Experience");
			String exp = br.readLine();
			System.out.println("Enter the Location");
			String loc = br.readLine();
			System.out.println("Enter the slary");
			String sal = br.readLine();
			System.out.println("Enter the Key Skill Required");
			String keySkill = br.readLine();
			
			// create a job...
			JobEntity job = new JobEntity(j_name, exp, loc, sal, keySkill );
			System.out.println(job);
			
			   boolean f = JobDao.addJobInDb(job);
			   if(f ) {
				   System.out.println("Job Posted SuccessFully");
			   }else {
				   System.out.println("Something went wrong..!!");
			   }
		}
		else if (c== 2) {
			// Delete the job
			System.out.println("Enter the Job Id ");
			int id = Integer.parseInt(br.readLine()) ;
			boolean f = JobDao.deleteJob( id );
			if(f) {
				System.out.println("Job IS Deleted...");
			}
			else {
				System.out.println("Something went Wrong...!!");
			}
			
		}
		else if (c == 3) {
			// For see All job Post
			JobDao.seeAllJob();
			
		}
		
		else if (c== 4) {
			// Update..........
			System.out.println("Enter the ID Which post wnat to Update And Enter new Information...");
			int id = Integer.parseInt(br.readLine());
			System.out.println("PRESS 1 If you want to update the Job Name ");
			System.out.println("PRESS 2 If you want to update the Experience ");
			System.out.println("PRESS 3 If you want to update the Location ");
			int u1 = Integer.parseInt(br.readLine());
			// for job name update
			if(u1 == 1) {
			System.out.println("Enter the Job Name");
			String job_name = br.readLine();
			
			  boolean f =  JobDao.updateJobName(id, job_name);
			  if(f) {
					System.out.println("Job IS Updated...");
				}
				else {
					System.out.println("Something went Wrong...!!");
				}
				System.out.println("_________________________________________________");
			}
			// for experience update
			if(u1 == 2) {
				System.out.println("Enter the new  Experience");
				String exp = br.readLine();
				boolean f = JobDao.updateJobExperience(id, exp);
				 if(f) {
						System.out.println("Job experience IS Updated...");
					}
					else {
						System.out.println("Something went Wrong...!!");
					}
					System.out.println("_________________________________________________");
			}
			if(u1 == 3) {
				System.out.println("Enter the new Job Location");
				String loc = br.readLine();
				
				  boolean f =  JobDao.updateJobLocation(id, loc);
				  if(f) {
						System.out.println("Job Location IS Updated...");
					}
					else {
						System.out.println("Something went Wrong...!!");
					}
					System.out.println("_________________________________________________");
				}
		

		}
		
		else if (c== 5) {
			// break;
			break;
		}
		else {
			
		}

	}
	System.out.println("Thankyou. for using This Application.....");
	
	}
}
