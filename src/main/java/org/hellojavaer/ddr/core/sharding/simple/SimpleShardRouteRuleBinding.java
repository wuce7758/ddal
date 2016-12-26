/*
 * Copyright 2016-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hellojavaer.ddr.core.sharding.simple;

import java.io.Serializable;

/**
 *
 * @author <a href="mailto:hellojavaer@gmail.com">Kaiming Zou</a>,created on 15/11/2016.
 */
public class SimpleShardRouteRuleBinding implements Serializable {

    public static final String       VALUE_TYPE_OF_NUMBER = "number";
    public static final String       VALUE_TYPE_OF_STRING = "string";

    private String               scName;
    private String               tbName;
    private String               sdName;
    private SimpleShardRouteRule rule;
    private String               sdScanValues;
    private String                   sdScanValueType      = VALUE_TYPE_OF_NUMBER;

    public String getScName() {
        return scName;
    }

    public void setScName(String scName) {
        this.scName = scName;
    }

    public String getTbName() {
        return tbName;
    }

    public void setTbName(String tbName) {
        this.tbName = tbName;
    }

    public String getSdName() {
        return sdName;
    }

    public void setSdName(String sdName) {
        this.sdName = sdName;
    }

    public SimpleShardRouteRule getRule() {
        return rule;
    }

    public void setRule(SimpleShardRouteRule rule) {
        this.rule = rule;
    }

    public String getSdScanValues() {
        return sdScanValues;
    }

    public void setSdScanValues(String sdScanValues) {
        this.sdScanValues = sdScanValues;
    }

    public String getSdScanValueType() {
        return sdScanValueType;
    }

    public void setSdScanValueType(String sdScanValueType) {
        this.sdScanValueType = sdScanValueType;
    }
}