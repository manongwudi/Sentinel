package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.ParamFlowRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRuleProvider;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author jiangqiao
 */
@Component("paramFlowRuleApolloProvider")
public class ParamFlowRuleApolloProvider extends AbstractApolloCommonService implements
        DynamicRuleProvider<List<ParamFlowRuleEntity>> {

    @Override
    public List<ParamFlowRuleEntity> getRules(String appName) throws Exception {
        return apolloCommonService.getRules(appName, paramFlowDataIdSuffix, ParamFlowRuleEntity.class);
    }
}
