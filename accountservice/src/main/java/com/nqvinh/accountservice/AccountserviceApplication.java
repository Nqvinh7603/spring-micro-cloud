/*******************************************************************************
 * Class        ：AccountserviceApplication
 * Created date ：2025/05/04
 * Lasted date  ：2025/05/04
 * Author       ：vinhNQ2
 * Change log   ：2025/05/04：01-00 vinhNQ2 create a new
 ******************************************************************************/
package com.nqvinh.accountservice;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * AccountserviceApplication
 * 
 * @version 01-00
 * @since 01-00
 * @author vinhNQ2
 */
@SpringBootApplication
public class AccountserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountserviceApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setFieldMatchingEnabled(true)
				.setFieldAccessLevel(Configuration.AccessLevel.PRIVATE)
				.setMatchingStrategy(MatchingStrategies.STRICT);
		return modelMapper;
	}

}
