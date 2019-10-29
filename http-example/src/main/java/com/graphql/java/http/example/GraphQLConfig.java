package com.graphql.java.examples.springboot.config;

import graphql.execution.AsyncExecutionStrategy;
import graphql.execution.ExecutionStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfig {
 /*   @Bean
    public Map<String, ExecutionStrategy> executionStrategies() {
        Map<String, ExecutionStrategy> executionStrategyMap = new HashMap<>();
        executionStrategyMap.put("queryExecutionStrategy", new AsyncExecutionStrategy());
        return executionStrategyMap;
    }*/

    @Bean(name="queryExecutionStrategy")
    public ExecutionStrategy getQueryExecutionStrategy() {
        return new AsyncExecutionStrategy();
    }
}
