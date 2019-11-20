package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.SystemRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRuleProvider;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author jiangqiao
 */
@Component("systemRuleApolloProvider")
public class SystemRuleApolloProvider extends AbstractApolloCommonService implements
        DynamicRuleProvider<List<SystemRuleEntity>> {

    @Override
    public List<SystemRuleEntity> getRules(String appName) throws Exception {
        return apolloCommonService.getRules(appName, systemDataIdSuffix, SystemRuleEntity.class);
    }
}
