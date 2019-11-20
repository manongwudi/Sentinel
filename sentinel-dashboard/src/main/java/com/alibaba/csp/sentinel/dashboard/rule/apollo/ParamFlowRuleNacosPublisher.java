package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.ParamFlowRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRulePublisher;
import com.alibaba.fastjson.JSON;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author jiangqiao
 */
@Component("paramFlowRuleApolloPublisher")
public class ParamFlowRuleNacosPublisher extends AbstractApolloCommonService implements
        DynamicRulePublisher<List<ParamFlowRuleEntity>> {

    @Override
    public void publish(String appName, List<ParamFlowRuleEntity> rules) throws Exception {
        apolloCommonService.publishRules(appName, paramFlowDataIdSuffix, JSON.toJSONString(rules));
    }
}
