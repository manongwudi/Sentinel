package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.FlowRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRulePublisher;
import com.alibaba.fastjson.JSON;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author jiangqiao
 */
@Component("flowRuleApolloPublisher")
public class FlowRuleApolloPublisher extends AbstractApolloCommonService implements
        DynamicRulePublisher<List<FlowRuleEntity>> {

    @Override
    public void publish(String app, List<FlowRuleEntity> rules) throws Exception {
        apolloCommonService.publishRules(app, flowDataIdSuffix, JSON.toJSONString(rules));
    }
}