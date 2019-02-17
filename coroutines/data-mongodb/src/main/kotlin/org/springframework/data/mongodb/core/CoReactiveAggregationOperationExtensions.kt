package org.springframework.data.mongodb.core

import kotlinx.coroutines.reactive.awaitSingle


/**
 * Coroutines variant of [ReactiveAggregationOperation.TerminatingAggregationOperation.all].
 *
 * * **Note: This API will become obsolete in future updates with introduction of lazy asynchronous streams.**
 * See [issue #254](https://github.com/Kotlin/kotlinx.coroutines/issues/254).
 *
 * @author Sebastien Deleuze
 */
suspend inline fun <reified T: Any> ReactiveAggregationOperation.TerminatingAggregationOperation<T>.awaitAll(): List<T> = all().collectList().awaitSingle()