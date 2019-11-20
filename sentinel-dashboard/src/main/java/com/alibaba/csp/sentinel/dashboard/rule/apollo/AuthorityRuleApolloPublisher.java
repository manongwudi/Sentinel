package com.alibaba.csp.sentinel.dashboard.rule.apollo;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.AuthorityRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRulePublisher;
import com.alibaba.fastjson.JSON;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author jiangqiao
 */
@Component("authorityRuleApolloPublisher")
public class AuthorityRuleApolloPublisher extends AbstractApolloCommonService implements
        DynamicRulePublisher<List<AuthorityRuleEntity>> {

    @Override
    public void publish(String appName, List<AuthorityRuleEntity> rules) throws Exception {
        apolloCommonService.publishRules(appName, authorityDataIdSuffix, JSON.toJSONString(rules));
    }
}
