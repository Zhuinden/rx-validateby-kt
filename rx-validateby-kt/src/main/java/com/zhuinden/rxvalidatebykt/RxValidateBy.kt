/*
 * Copyright 2020 Gabor Varadi
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
package com.zhuinden.rxvalidatebykt

import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.functions.*
import io.reactivex.functions.Function

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(
    f1,
    f2,
    BiFunction<Boolean, Boolean, Boolean> { t1, t2 -> t1 && t2 }
)

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>, f3: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(
    f1,
    f2,
    f3,
    Function3<Boolean, Boolean, Boolean, Boolean> { t1, t2, t3 -> t1 && t2 && t3 }
)

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>, f3: Flowable<Boolean>, f4: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    Function4<Boolean, Boolean, Boolean, Boolean, Boolean> { t1, t2, t3, t4 -> t1 && t2 && t3 && t4 }
)

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>, f3: Flowable<Boolean>, f4: Flowable<Boolean>, f5: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    Function5<Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> { t1, t2, t3, t4, t5 -> t1 && t2 && t3 && t4 && t5 }
)

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>, f3: Flowable<Boolean>, f4: Flowable<Boolean>, f5: Flowable<Boolean>, f6: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    Function6<Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> { t1, t2, t3, t4, t5, t6 -> t1 && t2 && t3 && t4 && t5 && t6 }
)

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>, f3: Flowable<Boolean>, f4: Flowable<Boolean>, f5: Flowable<Boolean>, f6: Flowable<Boolean>, f7: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    Function7<Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> { t1, t2, t3, t4, t5, t6, t7 -> t1 && t2 && t3 && t4 && t5 && t6 && t7 }
)

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>, f3: Flowable<Boolean>, f4: Flowable<Boolean>, f5: Flowable<Boolean>, f6: Flowable<Boolean>, f7: Flowable<Boolean>, f8: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    Function8<Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> { t1, t2, t3, t4, t5, t6, t7, t8 -> t1 && t2 && t3 && t4 && t5 && t6 && t7 && t8 }
)

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>, f3: Flowable<Boolean>, f4: Flowable<Boolean>, f5: Flowable<Boolean>, f6: Flowable<Boolean>, f7: Flowable<Boolean>, f8: Flowable<Boolean>, f9: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    Function9<Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> { t1, t2, t3, t4, t5, t6, t7, t8, t9 -> t1 && t2 && t3 && t4 && t5 && t6 && t7 && t8 && t9 }
)

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>, f3: Flowable<Boolean>, f4: Flowable<Boolean>, f5: Flowable<Boolean>, f6: Flowable<Boolean>, f7: Flowable<Boolean>, f8: Flowable<Boolean>, f9: Flowable<Boolean>, f10: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10), object : Function<Array<*>, Boolean> {
    override fun apply(t: Array<*>): Boolean {
        @Suppress("UNCHECKED_CAST")
        return (t[0] as Boolean) && (t[1] as Boolean) && (t[2] as Boolean) && (t[3] as Boolean) && (t[4] as Boolean) && (t[5] as Boolean) && (t[6] as Boolean) && (t[7] as Boolean) && (t[8] as Boolean) && (t[9] as Boolean)
    }
})

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>, f3: Flowable<Boolean>, f4: Flowable<Boolean>, f5: Flowable<Boolean>, f6: Flowable<Boolean>, f7: Flowable<Boolean>, f8: Flowable<Boolean>, f9: Flowable<Boolean>, f10: Flowable<Boolean>, f11: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11), object : Function<Array<*>, Boolean> {
    override fun apply(t: Array<*>): Boolean {
        @Suppress("UNCHECKED_CAST")
        return (t[0] as Boolean) && (t[1] as Boolean) && (t[2] as Boolean) && (t[3] as Boolean) && (t[4] as Boolean) && (t[5] as Boolean) && (t[6] as Boolean) && (t[7] as Boolean) && (t[8] as Boolean) && (t[9] as Boolean) && (t[10] as Boolean)
    }
})

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>, f3: Flowable<Boolean>, f4: Flowable<Boolean>, f5: Flowable<Boolean>, f6: Flowable<Boolean>, f7: Flowable<Boolean>, f8: Flowable<Boolean>, f9: Flowable<Boolean>, f10: Flowable<Boolean>, f11: Flowable<Boolean>, f12: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12), object : Function<Array<*>, Boolean> {
    override fun apply(t: Array<*>): Boolean {
        @Suppress("UNCHECKED_CAST")
        return (t[0] as Boolean) && (t[1] as Boolean) && (t[2] as Boolean) && (t[3] as Boolean) && (t[4] as Boolean) && (t[5] as Boolean) && (t[6] as Boolean) && (t[7] as Boolean) && (t[8] as Boolean) && (t[9] as Boolean) && (t[10] as Boolean) && (t[11] as Boolean)
    }
})

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>, f3: Flowable<Boolean>, f4: Flowable<Boolean>, f5: Flowable<Boolean>, f6: Flowable<Boolean>, f7: Flowable<Boolean>, f8: Flowable<Boolean>, f9: Flowable<Boolean>, f10: Flowable<Boolean>, f11: Flowable<Boolean>, f12: Flowable<Boolean>, f13: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13), object : Function<Array<*>, Boolean> {
    override fun apply(t: Array<*>): Boolean {
        @Suppress("UNCHECKED_CAST")
        return (t[0] as Boolean) && (t[1] as Boolean) && (t[2] as Boolean) && (t[3] as Boolean) && (t[4] as Boolean) && (t[5] as Boolean) && (t[6] as Boolean) && (t[7] as Boolean) && (t[8] as Boolean) && (t[9] as Boolean) && (t[10] as Boolean) && (t[11] as Boolean) && (t[12] as Boolean)
    }
})

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>, f3: Flowable<Boolean>, f4: Flowable<Boolean>, f5: Flowable<Boolean>, f6: Flowable<Boolean>, f7: Flowable<Boolean>, f8: Flowable<Boolean>, f9: Flowable<Boolean>, f10: Flowable<Boolean>, f11: Flowable<Boolean>, f12: Flowable<Boolean>, f13: Flowable<Boolean>, f14: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14), object : Function<Array<*>, Boolean> {
    override fun apply(t: Array<*>): Boolean {
        @Suppress("UNCHECKED_CAST")
        return (t[0] as Boolean) && (t[1] as Boolean) && (t[2] as Boolean) && (t[3] as Boolean) && (t[4] as Boolean) && (t[5] as Boolean) && (t[6] as Boolean) && (t[7] as Boolean) && (t[8] as Boolean) && (t[9] as Boolean) && (t[10] as Boolean) && (t[11] as Boolean) && (t[12] as Boolean) && (t[13] as Boolean)
    }
})

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>, f3: Flowable<Boolean>, f4: Flowable<Boolean>, f5: Flowable<Boolean>, f6: Flowable<Boolean>, f7: Flowable<Boolean>, f8: Flowable<Boolean>, f9: Flowable<Boolean>, f10: Flowable<Boolean>, f11: Flowable<Boolean>, f12: Flowable<Boolean>, f13: Flowable<Boolean>, f14: Flowable<Boolean>, f15: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15), object : Function<Array<*>, Boolean> {
    override fun apply(t: Array<*>): Boolean {
        @Suppress("UNCHECKED_CAST")
        return (t[0] as Boolean) && (t[1] as Boolean) && (t[2] as Boolean) && (t[3] as Boolean) && (t[4] as Boolean) && (t[5] as Boolean) && (t[6] as Boolean) && (t[7] as Boolean) && (t[8] as Boolean) && (t[9] as Boolean) && (t[10] as Boolean) && (t[11] as Boolean) && (t[12] as Boolean) && (t[13] as Boolean) && (t[14] as Boolean)
    }
})

fun validateBy(f1: Flowable<Boolean>, f2: Flowable<Boolean>, f3: Flowable<Boolean>, f4: Flowable<Boolean>, f5: Flowable<Boolean>, f6: Flowable<Boolean>, f7: Flowable<Boolean>, f8: Flowable<Boolean>, f9: Flowable<Boolean>, f10: Flowable<Boolean>, f11: Flowable<Boolean>, f12: Flowable<Boolean>, f13: Flowable<Boolean>, f14: Flowable<Boolean>, f15: Flowable<Boolean>, f16: Flowable<Boolean>): Flowable<Boolean> = Flowable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16), object : Function<Array<*>, Boolean> {
    override fun apply(t: Array<*>): Boolean {
        @Suppress("UNCHECKED_CAST")
        return (t[0] as Boolean) && (t[1] as Boolean) && (t[2] as Boolean) && (t[3] as Boolean) && (t[4] as Boolean) && (t[5] as Boolean) && (t[6] as Boolean) && (t[7] as Boolean) && (t[8] as Boolean) && (t[9] as Boolean) && (t[10] as Boolean) && (t[11] as Boolean) && (t[12] as Boolean) && (t[13] as Boolean) && (t[14] as Boolean) && (t[15] as Boolean)
    }
})

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(
    f1,
    f2,
    BiFunction<Boolean, Boolean, Boolean> { t1, t2 -> t1 && t2 }
)

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>, f3: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(
    f1,
    f2,
    f3,
    Function3<Boolean, Boolean, Boolean, Boolean> { t1, t2, t3 -> t1 && t2 && t3 }
)

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>, f3: Observable<Boolean>, f4: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    Function4<Boolean, Boolean, Boolean, Boolean, Boolean> { t1, t2, t3, t4 -> t1 && t2 && t3 && t4 }
)

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>, f3: Observable<Boolean>, f4: Observable<Boolean>, f5: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    Function5<Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> { t1, t2, t3, t4, t5 -> t1 && t2 && t3 && t4 && t5 }
)

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>, f3: Observable<Boolean>, f4: Observable<Boolean>, f5: Observable<Boolean>, f6: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    Function6<Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> { t1, t2, t3, t4, t5, t6 -> t1 && t2 && t3 && t4 && t5 && t6 }
)

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>, f3: Observable<Boolean>, f4: Observable<Boolean>, f5: Observable<Boolean>, f6: Observable<Boolean>, f7: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    Function7<Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> { t1, t2, t3, t4, t5, t6, t7 -> t1 && t2 && t3 && t4 && t5 && t6 && t7 }
)

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>, f3: Observable<Boolean>, f4: Observable<Boolean>, f5: Observable<Boolean>, f6: Observable<Boolean>, f7: Observable<Boolean>, f8: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    Function8<Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> { t1, t2, t3, t4, t5, t6, t7, t8 -> t1 && t2 && t3 && t4 && t5 && t6 && t7 && t8 }
)

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>, f3: Observable<Boolean>, f4: Observable<Boolean>, f5: Observable<Boolean>, f6: Observable<Boolean>, f7: Observable<Boolean>, f8: Observable<Boolean>, f9: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    Function9<Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean> { t1, t2, t3, t4, t5, t6, t7, t8, t9 -> t1 && t2 && t3 && t4 && t5 && t6 && t7 && t8 && t9 }
)

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>, f3: Observable<Boolean>, f4: Observable<Boolean>, f5: Observable<Boolean>, f6: Observable<Boolean>, f7: Observable<Boolean>, f8: Observable<Boolean>, f9: Observable<Boolean>, f10: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10), object : Function<Array<*>, Boolean> {
    override fun apply(t: Array<*>): Boolean {
        @Suppress("UNCHECKED_CAST")
        return (t[0] as Boolean) && (t[1] as Boolean) && (t[2] as Boolean) && (t[3] as Boolean) && (t[4] as Boolean) && (t[5] as Boolean) && (t[6] as Boolean) && (t[7] as Boolean) && (t[8] as Boolean) && (t[9] as Boolean)
    }
})

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>, f3: Observable<Boolean>, f4: Observable<Boolean>, f5: Observable<Boolean>, f6: Observable<Boolean>, f7: Observable<Boolean>, f8: Observable<Boolean>, f9: Observable<Boolean>, f10: Observable<Boolean>, f11: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11), object : Function<Array<*>, Boolean> {
    override fun apply(t: Array<*>): Boolean {
        @Suppress("UNCHECKED_CAST")
        return (t[0] as Boolean) && (t[1] as Boolean) && (t[2] as Boolean) && (t[3] as Boolean) && (t[4] as Boolean) && (t[5] as Boolean) && (t[6] as Boolean) && (t[7] as Boolean) && (t[8] as Boolean) && (t[9] as Boolean) && (t[10] as Boolean)
    }
})

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>, f3: Observable<Boolean>, f4: Observable<Boolean>, f5: Observable<Boolean>, f6: Observable<Boolean>, f7: Observable<Boolean>, f8: Observable<Boolean>, f9: Observable<Boolean>, f10: Observable<Boolean>, f11: Observable<Boolean>, f12: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12), object : Function<Array<*>, Boolean> {
    override fun apply(t: Array<*>): Boolean {
        @Suppress("UNCHECKED_CAST")
        return (t[0] as Boolean) && (t[1] as Boolean) && (t[2] as Boolean) && (t[3] as Boolean) && (t[4] as Boolean) && (t[5] as Boolean) && (t[6] as Boolean) && (t[7] as Boolean) && (t[8] as Boolean) && (t[9] as Boolean) && (t[10] as Boolean) && (t[11] as Boolean)
    }
})

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>, f3: Observable<Boolean>, f4: Observable<Boolean>, f5: Observable<Boolean>, f6: Observable<Boolean>, f7: Observable<Boolean>, f8: Observable<Boolean>, f9: Observable<Boolean>, f10: Observable<Boolean>, f11: Observable<Boolean>, f12: Observable<Boolean>, f13: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13), object : Function<Array<*>, Boolean> {
    override fun apply(t: Array<*>): Boolean {
        @Suppress("UNCHECKED_CAST")
        return (t[0] as Boolean) && (t[1] as Boolean) && (t[2] as Boolean) && (t[3] as Boolean) && (t[4] as Boolean) && (t[5] as Boolean) && (t[6] as Boolean) && (t[7] as Boolean) && (t[8] as Boolean) && (t[9] as Boolean) && (t[10] as Boolean) && (t[11] as Boolean) && (t[12] as Boolean)
    }
})

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>, f3: Observable<Boolean>, f4: Observable<Boolean>, f5: Observable<Boolean>, f6: Observable<Boolean>, f7: Observable<Boolean>, f8: Observable<Boolean>, f9: Observable<Boolean>, f10: Observable<Boolean>, f11: Observable<Boolean>, f12: Observable<Boolean>, f13: Observable<Boolean>, f14: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14), object : Function<Array<*>, Boolean> {
    override fun apply(t: Array<*>): Boolean {
        @Suppress("UNCHECKED_CAST")
        return (t[0] as Boolean) && (t[1] as Boolean) && (t[2] as Boolean) && (t[3] as Boolean) && (t[4] as Boolean) && (t[5] as Boolean) && (t[6] as Boolean) && (t[7] as Boolean) && (t[8] as Boolean) && (t[9] as Boolean) && (t[10] as Boolean) && (t[11] as Boolean) && (t[12] as Boolean) && (t[13] as Boolean)
    }
})

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>, f3: Observable<Boolean>, f4: Observable<Boolean>, f5: Observable<Boolean>, f6: Observable<Boolean>, f7: Observable<Boolean>, f8: Observable<Boolean>, f9: Observable<Boolean>, f10: Observable<Boolean>, f11: Observable<Boolean>, f12: Observable<Boolean>, f13: Observable<Boolean>, f14: Observable<Boolean>, f15: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15), object : Function<Array<*>, Boolean> {
    override fun apply(t: Array<*>): Boolean {
        @Suppress("UNCHECKED_CAST")
        return (t[0] as Boolean) && (t[1] as Boolean) && (t[2] as Boolean) && (t[3] as Boolean) && (t[4] as Boolean) && (t[5] as Boolean) && (t[6] as Boolean) && (t[7] as Boolean) && (t[8] as Boolean) && (t[9] as Boolean) && (t[10] as Boolean) && (t[11] as Boolean) && (t[12] as Boolean) && (t[13] as Boolean) && (t[14] as Boolean)
    }
})

fun validateBy(f1: Observable<Boolean>, f2: Observable<Boolean>, f3: Observable<Boolean>, f4: Observable<Boolean>, f5: Observable<Boolean>, f6: Observable<Boolean>, f7: Observable<Boolean>, f8: Observable<Boolean>, f9: Observable<Boolean>, f10: Observable<Boolean>, f11: Observable<Boolean>, f12: Observable<Boolean>, f13: Observable<Boolean>, f14: Observable<Boolean>, f15: Observable<Boolean>, f16: Observable<Boolean>): Observable<Boolean> = Observable.combineLatest(arrayOf(
    f1,
    f2,
    f3,
    f4,
    f5,
    f6,
    f7,
    f8,
    f9,
    f10,
    f11,
    f12,
    f13,
    f14,
    f15,
    f16), object : Function<Array<*>, Boolean> {
    override fun apply(t: Array<*>): Boolean {
        @Suppress("UNCHECKED_CAST")
        return (t[0] as Boolean) && (t[1] as Boolean) && (t[2] as Boolean) && (t[3] as Boolean) && (t[4] as Boolean) && (t[5] as Boolean) && (t[6] as Boolean) && (t[7] as Boolean) && (t[8] as Boolean) && (t[9] as Boolean) && (t[10] as Boolean) && (t[11] as Boolean) && (t[12] as Boolean) && (t[13] as Boolean) && (t[14] as Boolean) && (t[15] as Boolean)
    }
})