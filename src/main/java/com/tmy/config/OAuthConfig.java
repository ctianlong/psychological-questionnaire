package com.tmy.config;

import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.SinaWeiboApi20;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tmy.oauth.service.OAuthServiceDeractor;
import com.tmy.oauth.service.SinaWeiboOAuthService;

@Configuration
public class OAuthConfig {
    
    private static final String CALLBACK_URL = "http://questions.tongjiai.top/oauth/%s/callback";
    
    @Value("${oAuth.sina.appKey}") String sinaAppKey;
    @Value("${oAuth.sina.appSecret}") String sinaAppSecret;
    
    @Bean
    public OAuthServiceDeractor getSinaOAuthService(){
        return new SinaWeiboOAuthService(new ServiceBuilder()
            .provider(SinaWeiboApi20.class)
            .apiKey(sinaAppKey)
            .apiSecret(sinaAppSecret)
            .callback(String.format(CALLBACK_URL, OAuthTypes.SINA_WEIBO))
            .build());
    }
    
}
