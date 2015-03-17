/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sshd.common.cipher;

import org.apache.sshd.common.Cipher;
import org.apache.sshd.common.NamedFactory;

/**
 * AES256CTR Cipher
 *
 * @author <a href="mailto:dev@mina.apache.org">Apache MINA SSHD Project</a>
 */
public class AES256CTR extends BaseCipher {

    /**
     * Named factory for AES256CTR Cipher
     */
    public static class Factory implements NamedFactory<Cipher> {
        public static final String NAME = "aes256-ctr";

        public Factory() {
            super();
        }

        public String getName() {
            return NAME;
        }

        public Cipher create() {
            return new AES256CTR();
        }
    }

    public AES256CTR() {
        super(16, 32, "AES", "AES/CTR/NoPadding");
    }

}
