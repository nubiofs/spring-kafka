/*
 * Copyright 2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.kafka.security.jaas;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Marius Bogoevici
 * @author Gary Russell
 *
 * @since 2.0
 */
@SuppressWarnings("restriction")
@RunWith(SpringRunner.class)
public class KafkaJaasLoginModuleInitializerTests {

	@Test
	public void testConfigurationParsedCorrectlyWithKafkaClient() throws Exception {
//		ConfigFile configFile = new ConfigFile(new ClassPathResource("jaas-sample-kafka-only.conf").getURI());
//		final AppConfigurationEntry[] kafkaConfigurationArray = configFile
//				.getAppConfigurationEntry(JaasUtils.LOGIN_CONTEXT_CLIENT);
//
//		javax.security.auth.login.Configuration configuration = javax.security.auth.login.Configuration
//				.getConfiguration();
//
//		final AppConfigurationEntry[] kafkaConfiguration = configuration
//				.getAppConfigurationEntry(JaasUtils.LOGIN_CONTEXT_CLIENT);
//		assertThat(kafkaConfiguration).hasSize(1);
//		assertThat(kafkaConfiguration[0].getOptions()).isEqualTo(kafkaConfigurationArray[0].getOptions());
//
//		javax.security.auth.login.Configuration jaasConfig =
//				JaasUtils.jaasConfig(LoginType.CLIENT, Collections.emptyMap());
//		AppConfigurationEntry[] appConfigurationEntry =
//				jaasConfig.getAppConfigurationEntry(JaasUtils.LOGIN_CONTEXT_CLIENT);
//		assertThat(appConfigurationEntry).hasSize(1);
//		assertThat(appConfigurationEntry[0].getOptions()).isEqualTo(kafkaConfigurationArray[0].getOptions());
	}

	@Configuration
	public static class Config {

//		@Bean
//		public KafkaJaasLoginModuleInitializer jaasConfig() throws IOException {
//			KafkaJaasLoginModuleInitializer jaasConfig = new KafkaJaasLoginModuleInitializer();
//			jaasConfig.setControlFlag(ControlFlag.REQUIRED);
//			Map<String, String> options = new HashMap<>();
//			options.put("useKeyTab", "true");
//			options.put("storeKey", "true");
//			options.put("keyTab", "/etc/security/keytabs/kafka_client.keytab");
//			options.put("principal", "kafka-client-1@EXAMPLE.COM");
//			jaasConfig.setOptions(options);
//			return jaasConfig;
//		}

	}

}
