/*
 * Copyright 2020-Present Okta, Inc.
 *
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
package com.okta.idx.sdk.api.client;

import com.okta.commons.lang.Classes;

final class Clients {

    /**
     * Builds a {@link IDXClientBuilder} instance used to construct {@link IDXClient} instance.
     *
     * @return a new {@link IDXClientBuilder} instance
     */
    static IDXClientBuilder builder() {
        return Classes.newInstance("com.okta.idx.sdk.impl.client.DefaultIDXClientBuilder");
    }
}
