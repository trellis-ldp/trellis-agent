/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.trellisldp.agent;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.trellisldp.spi.AgentService;

/**
 * @author acoburn
 */
public class PrefixingAgentTest {

    @Test
    public void testAgent() {
        final AgentService service = new PrefixingAgent("user:");

        assertEquals("user:acoburn", service.asAgent("acoburn").getIRIString());
        assertEquals("user:foo/bar", service.asAgent("foo/bar").getIRIString());
    }


}