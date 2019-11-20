package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.DegradeRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRuleProvider;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author jiangqiao
 */
@Component("degradeRuleApolloProvider")
public class DegradeRuleApolloProvider extends AbstractApolloCommonService implements
        DynamicRuleProvider<List<DegradeRuleEntity>> {

    @Override
    public List<DegradeRuleEntity> getRules(String appName) throws Exception {
        return apolloCommonService.getRules(appName, degradeDataIdSuffix, DegradeRuleEntity.class);
    }
}
