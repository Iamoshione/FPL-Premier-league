package com.example.SportyApi;


import com.example.SportyApi.controller.HttpRequestManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication
public class SportyApiApplication {


	public static void main(String[] args)  {
		SpringApplication.run(SportyApiApplication.class, args);
		Timer timer = new Timer();
		TimerTask task = new HttpRequestManager();
		long period = 14400000;
		timer.schedule(task, 2000, period);
	}

}

