package com.disaster.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.disaster.management.service.DisasterService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DisasterManagementApplication {

    @Autowired
    private DisasterService disasterService;

    public static void main(String[] args) {
        SpringApplication.run(DisasterManagementApplication.class, args);
    }

    @PostConstruct
    public void onStartup() {
        System.out.println("===== IMPORTANT TEST: Trying to fetch NDMA alerts NOW =====");
        disasterService.fetchNDMAAlerts();
        System.out.println("===== Fetch finished. Check above for Saved or Error messages =====");
    }
}