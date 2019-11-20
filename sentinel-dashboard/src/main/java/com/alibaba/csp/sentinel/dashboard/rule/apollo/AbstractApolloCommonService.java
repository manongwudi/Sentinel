package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author jiangqiao
 */
@Service
public abstract class AbstractApolloCommonService {

    @Autowired
    protected ApolloCommonService apolloCommonService;

    /**
     * 流控规则前缀标示
     */
    @Value("${flow.key.suffix:-flow}")
    String flowDataIdSuffix;

    /**
     * 熔断降级规则前缀标示
     */
    @Value("${degrade.key.suffix:-degrade}")
    String degradeDataIdSuffix;

    /**
     * 热点规则前缀标示
     */
    @Value("${paramFlow.key.suffix:-paramFlow}")
    String paramFlowDataIdSuffix;

    /**
     * 系统规则前缀标示
     */
    @Value("${system.key.suffix:-system}")
    String systemDataIdSuffix;

    /**
     * 授权规则前缀标示
     */
    @Value("${authority.key.suffix:-authority}")
    String authorityDataIdSuffix;
}
