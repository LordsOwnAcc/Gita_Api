package com.astratech.First.dao;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SelfPingService {

    private final RestTemplate restTemplate = new RestTemplate();

    // Runs every 10 minutes
    @Scheduled(fixedRate = 600000)
    public void pingSelf() {
        try {
            String response = restTemplate.getForObject(
                    "https://gita-api-1.onrender.com/health",
                    String.class
            );
            String response2 = restTemplate.getForObject(
                    "https://gitaapi-frontend.onrender.com",
                    String.class
            );

            System.out.println("Self ping successful: " + response);

        } catch (Exception e) {
            System.out.println("Self ping failed: " + e.getMessage());
        }
    }
}
