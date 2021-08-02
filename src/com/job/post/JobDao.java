package com.job.post;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JobDao {


	public static boolean addJobInDb(JobEntity job) {

		Connection con = ConnectionProviderr.createConnection();
		String q = "insert into jobApp (jobName, experience,location ,salary, keySkill) values(?, ?, ?, ?, ?)";
		// create the Statement
		try {
			PreparedStatement pstmt = con.prepareStatement(q);
			//set the value
			pstmt.setNString(1, job.getJobName());
			pstmt.setString(2, job.getExprience());
			pstmt.setString(3, job.getLocation());
			pstmt.setString(4, job.getSalary());
			pstmt.setString(5, job.getKeySkill());
			
			// Execute the query
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return true;
	}
	
	// For delete the Job

	public static boolean deleteJob(int id) {
		Connection con = ConnectionProviderr.createConnection();
		// Write the Query..
		String q = "delete from jobApp where id = ?";
		try {
		//preapre the Statement..
		PreparedStatement pstmt  = con.prepareStatement(q);
		pstmt.setInt(1, id);
		pstmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	
	// for See all the Job

	public static void seeAllJob() {
		Connection con = ConnectionProviderr.createConnection();
		// Create Query
		String q = "select * from jobApp";
		
		//create A statement...
		try {
			Statement st = con.createStatement();
			ResultSet set = st.executeQuery(q);
			
			while(set.next()) {
				int id = set.getInt(1);
				String JobName =  set.getString(2);
				String exp = set.getString(3);
				String location = set.getString(4);
				String sal = set.getString(5);
				String skill = set.getString(6);
				
				System.out.println("JobID : "+id);
				System.out.println("JOB Name :"  +JobName);
				System.out.println("Experience :" +exp);
				System.out.println("Location  :" +location);
				System.out.println("Salary : "+ sal);
				System.out.println("KeySkill :" +skill);
				System.out.println("___________________________________________________");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	// for Update  job job Name
	public static boolean updateJobName(int id, String job_name) {
		Connection con = ConnectionProviderr.createConnection();
		//query
		
		try {
		String q = "update jobApp set jobName = ? where id = ? ";
		// create the Statement
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setInt(2, id);
		pstmt.setString(1, job_name);
		
		pstmt.executeUpdate();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return true;
	}
// update the column of Experinece...
	
	public static boolean updateJobExperience(int id, String exp) {
		
		try {
			Connection con = ConnectionProviderr.createConnection();
			String q = "update jobApp set experience = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(2, id);
			pstmt.setString(1, exp);
			
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	
	// for Job Location Update 
	public static boolean updateJobLocation(int id, String loc) {
		try {
			Connection con = ConnectionProviderr.createConnection();
			
			String q = "update jobApp set location = ? where id = ?";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(2, id);
			pstmt.setString(1, loc);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	
	
}
