package com.suse.saltstack.netapi.client;

import com.suse.saltstack.netapi.config.SaltStackClientConfig;
import com.suse.saltstack.netapi.parser.SaltStackParser;

/**
 * Describes an interface for creating instances of an HTTP connection implementation.
 */
public interface SaltStackConnectionFactory {
    /**
     * Create a new {@link SaltStackConnection} for a given endpoint and configuration.
     *
     * @param endpoint the API endpoint
     * @param config the configuration
     * @return object representing a connection to the API
     */
    <T> SaltStackConnection<T> create(String endpoint, SaltStackParser<T> parser,  SaltStackClientConfig config);
}
