package com.griesba.brewery.inventoryfailover.griesbainventoryfailover.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@EnableDiscoveryClient
@Profile("local-discovery")
@Configuration
public class LocalDiscovery {
}