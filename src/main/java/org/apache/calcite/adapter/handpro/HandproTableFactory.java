/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.calcite.adapter.handpro;

import org.apache.calcite.rel.type.RelDataType;
import org.apache.calcite.rel.type.RelDataTypeImpl;
import org.apache.calcite.rel.type.RelProtoDataType;
import org.apache.calcite.schema.SchemaPlus;
import org.apache.calcite.schema.TableFactory;

import java.util.Map;

/** HandproTableFactory.
 *
 */
public class HandproTableFactory implements TableFactory<HandproTable> {

  public HandproTableFactory() {
    super();
  }

  public HandproTable create(
            SchemaPlus schema,
            String name,
            Map<String, Object> operand,
            RelDataType rowType) {
    /* To create and return a HandproTable here  */
    final RelProtoDataType protoRowType =
            rowType != null ? RelDataTypeImpl.proto(rowType) : null;
    return new HandproScannableTable(name, protoRowType);
  }

}
// End HandproTableFactory.java
