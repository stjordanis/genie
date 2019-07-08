/*
 *
 *  Copyright 2015 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.genie.web.configs;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Unit tests for the SwaggerConfig class.
 *
 * @author tgianos
 * @since 3.0.0
 */
public class GenieSwaggerAutoConfigurationTest {

    /**
     * Test to make sure the Swagger SpringFox docket is created properly.
     */
    @Test
    public void canCreateDocket() {
        final GenieSwaggerAutoConfiguration config = new GenieSwaggerAutoConfiguration();
        final Docket docket = config.genieApi();
        Assert.assertThat(docket.getDocumentationType(), Matchers.is(DocumentationType.SWAGGER_2));
    }
}