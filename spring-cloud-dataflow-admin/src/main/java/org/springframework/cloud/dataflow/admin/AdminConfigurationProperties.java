/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.dataflow.admin;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Marius Bogoevici
 */
@ConfigurationProperties(prefix = "spring.cloud.dataflow.stream")
public class AdminConfigurationProperties {

	private String remoteRepository;

	private Binder binder;

	public String getRemoteRepository() {
		return remoteRepository;
	}

	public void setRemoteRepository(String remoteRepository) {
		this.remoteRepository = remoteRepository;
	}

	public Binder getBinder() {
		return binder;
	}

	public void setBinder(Binder binder) {
		this.binder = binder;
	}

	public enum Binder {
		kafka("org.springframework.cloud:spring-cloud-stream-binder-kafka:1.0.0.BUILD-SNAPSHOT"),
		rabbit("org.springframework.cloud:spring-cloud-stream-binder-rabbit:BUILD-SNAPSHOT"),
		redis("org.springframework.cloud:spring-cloud-stream-binder-redis:BUILD-SNAPSHOT");

		private String coordinates;

		Binder(String coordinates) {
			this.coordinates = coordinates;
		}

		public String getCoordinates() {
			return coordinates;
		}
	}
}
