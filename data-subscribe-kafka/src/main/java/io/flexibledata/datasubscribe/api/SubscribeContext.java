/*
 * Copyright 2016-2018 flexibledata.io.
 * <p>
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
 * </p>
 */
package io.flexibledata.datasubscribe.api;

import io.flexibledata.datasubscribe.constant.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 数据订阅上下文
 * 
 * @author tan.jie
 *
 */
@Data
@AllArgsConstructor
public class SubscribeContext {
	private String schemaName;
	private String tableName;
	private EventType eventType;// 如insert、update、delete
	private Long id;// 主文档id
	private String updateTime;
}