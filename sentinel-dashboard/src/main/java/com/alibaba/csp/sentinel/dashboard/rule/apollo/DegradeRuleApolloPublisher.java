package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.DegradeRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRulePublisher;
import com.alibaba.fastjson.JSON;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author jiangqiao
 */
@Component("degradeRuleApolloPublisher")
public class DegradeRuleApolloPublisher extends AbstractApolloCommonService implements
        DynamicRulePublisher<List<DegradeRuleEntity>> {

    @Override
    public void publish(String appName, List<DegradeRuleEntity> rules) throws Exception {
        apolloCommonService.publishRules(appName, degradeDataIdSuffix, JSON.toJSONString(rules));
    }
}
