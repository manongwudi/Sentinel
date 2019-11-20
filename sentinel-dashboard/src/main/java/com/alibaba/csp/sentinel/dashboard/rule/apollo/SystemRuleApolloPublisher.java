package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.SystemRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRulePublisher;
import com.alibaba.fastjson.JSON;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author jiangqiao
 */
@Component("systemRuleApolloPublisher")
public class SystemRuleApolloPublisher extends AbstractApolloCommonService implements
        DynamicRulePublisher<List<SystemRuleEntity>> {

    @Override
    public void publish(String appName, List<SystemRuleEntity> rules) throws Exception {
        apolloCommonService.publishRules(appName, systemDataIdSuffix, JSON.toJSONString(rules));
    }
}
