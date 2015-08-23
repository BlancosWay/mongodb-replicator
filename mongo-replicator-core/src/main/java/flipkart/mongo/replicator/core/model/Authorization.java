/*
 * Copyright 2012-2015, the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package flipkart.mongo.replicator.core.model;

import com.google.common.base.Optional;

/**
 * Created by kishan.gajjar on 12/08/15.
 */
public class Authorization {
    public final String username;
    public final String password;
    private Optional<String> authorizedDB = Optional.absent();

    public Authorization(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Optional<String> getAuthorizedDB() {
        return authorizedDB;
    }

    public void setAuthorizedDB(String authorizedDB) {
        this.authorizedDB = Optional.fromNullable(authorizedDB);
    }
}
