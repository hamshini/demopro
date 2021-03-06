package org.samp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.tr.detail.TrainDetails;

public class FinSol {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Train No: ");
		int trainNo = Integer.valueOf(bf.readLine());
		System.out.println("Enter Train Name: ");
		String trainName = bf.readLine();
		System.out.println("Enter Starts: ");
		String trainStarts = bf.readLine();
		System.out.println("Enter Ends: ");
		String trainEnds = bf.readLine();
		System.out.println("Enter Station Name: ");
		String stationName = bf.readLine();
		System.out.println("Enter Arrives: ");
		String arrives = bf.readLine();
		System.out.println("Enter Departs: ");
		String departs = bf.readLine();
		System.out.println("Enter Stop Time: ");
		String stopTime = bf.readLine();
		System.out.println("Enter distance Travelled");
		String distanceTravelled = bf.readLine();
		System.out.println("Enter Day: ");
		int day = Integer.valueOf(bf.readLine());
		System.out.println("Enter Route: ");
		int route = Integer.valueOf(bf.readLine());

		TrainDetails td = new TrainDetails(trainNo,trainName,trainStarts,trainEnds,stationName,
			arrives,departs,stopTime,distanceTravelled,day,route);
		System.out.println("TRain No: " + td.getTrainNo());
		System.out.println("Train Name: " + td.getTrainName());
		System.out.print("Train Starts: " + td.getTrainStrarts());
		session.save(td);
		session.getTransaction().commit();
		sf.close();
		session.close();
	}

}
