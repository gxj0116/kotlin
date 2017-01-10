/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.daemon.common

import java.io.Serializable

/**
 * Allows daemon clients to specify report category and severities for that category that should be reported from daemon
 */
data class ReportingFilter(val category: ReportCategory, val severities: List<Int>) : Serializable {
    companion object {
        const val serialVersionUID: Long = 0
    }
}