package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.AuthorityRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRuleProvider;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author jiangqiao
 */
@Component("authorityRuleApolloProvider")
public class AuthorityRuleApolloProvider extends AbstractApolloCommonService implements
        DynamicRuleProvider<List<AuthorityRuleEntity>> {

    @Override
    public List<AuthorityRuleEntity> getRules(String appName) throws Exception {
        return apolloCommonService.getRules(appName, authorityDataIdSuffix, AuthorityRuleEntity.class);
    }
}
