/*
 *     Copyright 2017 EntIT Software LLC, a Micro Focus company, L.P.
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.hp.octane.integrations;

import com.hp.octane.integrations.spi.CIPluginServicesBase;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Octane SDK tests
 */

public class OctaneSDKTest {

    @Test
    public void sdkTestA() {
        OctaneSDK.init(new CIPluginServicesMockA());
        assertNotNull(OctaneSDK.getInstance().getPluginServices());
    }

    private class CIPluginServicesMockA extends CIPluginServicesBase {

    }
}
