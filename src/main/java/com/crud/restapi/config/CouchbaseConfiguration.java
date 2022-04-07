package com.crud.restapi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class CouchbaseConfiguration extends AbstractCouchbaseConfiguration {

	@Override
	public String getConnectionString() {
		return "127.0.0.1";
	}

	@Override
	public String getUserName() {
		return "crud_apis";
	}

	@Override
	public String getPassword() {
		return "123456";
	}

	@Override
	public String getBucketName() {
		return "crud_apis";
	}

}
