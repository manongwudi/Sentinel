package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.FlowRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRuleProvider;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author jiangqiao
 */
@Component("flowRuleApolloProvider")
public class FlowRuleApolloProvider extends AbstractApolloCommonService implements
        DynamicRuleProvider<List<FlowRuleEntity>> {

    @Override
    public List<FlowRuleEntity> getRules(String appName) throws Exception {
        return apolloCommonService.getRules(appName, flowDataIdSuffix, FlowRuleEntity.class);
    }
}
