 package com.flex.simulator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flex.simulator.dto.FlexSimulatorResponseDto;
import com.flex.simulator.service.FlexSimulatorService;

@RestController
@RequestMapping("/flex")
@CrossOrigin
public class FlexSimulatorController {

	@Autowired
	private FlexSimulatorService flexSimulatorService;
	 
	
	@GetMapping(value="/rates",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<FlexSimulatorResponseDto> getRates(@RequestParam("primaryCurrency") String primaryCurrency, 
			@RequestParam("secondaryCurrency") String secondaryCurrency) {
		FlexSimulatorResponseDto response = flexSimulatorService.getRates(primaryCurrency,secondaryCurrency);
		return ResponseEntity.ok(response);

	}
}
