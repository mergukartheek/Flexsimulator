package com.flex.simulator.dao;

import com.flex.simulator.dto.FlexSimulatorResponseDto;

public interface FlexSimulatorDAO{
	
	FlexSimulatorResponseDto getrateByCurrencyPairs(String primaryCurrency,String secondaryCurrency);

}
