/*
 * Copyright 2017-2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.micronaut.configuration.couchbase;

import com.couchbase.client.java.env.ClusterEnvironment;
import io.micronaut.context.env.Environment;
import io.micronaut.core.util.StringUtils;
import io.micronaut.runtime.ApplicationConfiguration;

import javax.validation.constraints.NotBlank;

/**
 * @author Graham Pople
 * @since 1.0
 */
public abstract class AbstractCouchbaseConfiguration {

    private final ApplicationConfiguration applicationConfiguration;

    /**
     * Constructor.
     * @param applicationConfiguration applicationConfiguration
     */
    public AbstractCouchbaseConfiguration(ApplicationConfiguration applicationConfiguration) {
        this.applicationConfiguration = applicationConfiguration;
    }
}
