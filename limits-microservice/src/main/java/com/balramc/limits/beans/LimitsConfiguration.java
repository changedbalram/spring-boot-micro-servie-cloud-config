package com.balramc.limits.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author balram
 *
 */
@Component
@ConfigurationProperties("limits-service")
public class LimitsConfiguration {

	private Integer minimum;
	private Integer maximum;
	
	public LimitsConfiguration() {
	}
	
	public LimitsConfiguration(Integer minimum, Integer maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public Integer getMinimum() {
		return minimum;
	}
	public void setMinimum(Integer minimum) {
		this.minimum = minimum;
	}
	public Integer getMaximum() {
		return maximum;
	}
	public void setMaximum(Integer maximum) {
		this.maximum = maximum;
	}
	
}
