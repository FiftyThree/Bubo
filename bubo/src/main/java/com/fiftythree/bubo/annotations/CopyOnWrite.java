/*
 *
 *                                ^ ^
 *                                O O
 *                              /    )
 *                             /  ,,
 * Bubo – Observable Contracts and Specialized Implementations.
 *                              |/
 * Copyright 2015 FiftyThree, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.fiftythree.bubo.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks a Registrar implementation as using Copy-on-Write (http://en.wikipedia.org/wiki/Copy-on-write) semantics
 * internally. Implementations that use COW provide fast, stable iteration over the registrar's elements but
 * may cause memory heap fragmentation if the add, remove, or clear methods are used too frequently.
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
public @interface CopyOnWrite {
    /**
     * The observer interface(s) which use copy-on-write semantics.
     * @return Observer interface types.
     */
    Class<?>[] value() default {};
}
