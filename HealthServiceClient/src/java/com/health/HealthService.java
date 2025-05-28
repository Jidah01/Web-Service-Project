/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.health;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author admin
 */
@WebService(serviceName = "HealthService")
public class HealthService {

    /**
     * This is a sample web service operation
     */
    public String getWaterIntakeStatus(float weight, float intake) {
        float recommended = weight * 0.033f; // 33 ml per kg
        if (intake < recommended) {
            return "Please drink water atleast 3 to 4 Liter perday. You body are dehydrated!";
        } else if (intake == recommended) {
            return "Perfect! You're drinking the right amount, enjoy you day!";
        } else {
            return "You take a too much water. Be cautious!";
        }
    }

}
