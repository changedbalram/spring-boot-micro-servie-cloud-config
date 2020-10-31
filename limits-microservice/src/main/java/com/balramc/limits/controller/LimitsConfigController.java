package com.balramc.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balramc.limits.beans.LimitsConfiguration;

/**
 * @author balram
 *
 */
@RestController
@RefreshScope
public class LimitsConfigController {

	@Autowired private LimitsConfiguration limitsConfiguration;
	
	@GetMapping("/limits")
	public LimitsConfiguration test () {
		return new LimitsConfiguration(limitsConfiguration.getMaximum(), limitsConfiguration.getMinimum());
		
	}
}
