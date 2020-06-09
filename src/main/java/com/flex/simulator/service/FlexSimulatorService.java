package com.flex.simulator.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flex.simulator.dao.FlexSimulatorDAO;
import com.flex.simulator.dto.FlexSimulatorResponseDto;

@Service
public class FlexSimulatorService {

	@Autowired
	private FlexSimulatorDAO flexSimulatorDAO;

	public FlexSimulatorResponseDto getRates(String primaryCurrency,String secondaryCurrency) {
		FlexSimulatorResponseDto flexSimulatorResponseDto = null;
		Random rand = new Random();
		if (primaryCurrency != null && secondaryCurrency != null) {
			flexSimulatorResponseDto =  flexSimulatorDAO.getrateByCurrencyPairs(
					primaryCurrency, secondaryCurrency);

	}
		return flexSimulatorResponseDto;
	}
	

}
