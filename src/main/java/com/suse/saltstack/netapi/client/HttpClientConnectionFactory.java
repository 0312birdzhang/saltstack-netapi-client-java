package com.suse.saltstack.netapi.client;

import com.suse.saltstack.netapi.config.SaltStackClientConfig;
import com.suse.saltstack.netapi.parser.SaltStackParser;

/**
 * Implementation of a factory for connections using Apache's HttpClient.
 *
 * @see com.suse.saltstack.netapi.client.HttpClientConnection
 */
public class HttpClientConnectionFactory implements ConnectionFactory {
    /**
     * {@inheritDoc}
     */
    @Override
    public <T> HttpClientConnection<T> create(String endpoint,
            SaltStackParser<T> parser, SaltStackClientConfig config) {
        return new HttpClientConnection<>(endpoint, parser, config);
    }
}
