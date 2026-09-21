package com.unifebe.devsecops.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Configuracao da aplicacao carregada via variaveis de ambiente (.env).
 * Os valores sensiveis nao ficam mais hardcoded no codigo-fonte.
 */
@Component
public class AppConfig {

    @Value("${DB_PASSWORD}")
    private String dbPassword;

    @Value("${AWS_ACCESS_KEY_ID}")
    private String awsAccessKeyId;

    @Value("${AWS_SECRET_ACCESS_KEY}")
    private String awsSecretAccessKey;

    @Value("${PAYMENT_GATEWAY_API_KEY}")
    private String paymentGatewayApiKey;

    public String getDbPassword() {
        return dbPassword;
    }

    public String getAwsAccessKeyId() {
        return awsAccessKeyId;
    }

    public String getAwsSecretAccessKey() {
        return awsSecretAccessKey;
    }

    public String getPaymentGatewayApiKey() {
        return paymentGatewayApiKey;
    }
}
