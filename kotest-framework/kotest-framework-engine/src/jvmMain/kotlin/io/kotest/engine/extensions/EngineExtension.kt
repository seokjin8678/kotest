package io.kotest.engine.extensions

import io.kotest.engine.EngineResult
import io.kotest.engine.TestSuite
import io.kotest.engine.listener.TestEngineListener

/**
 * Extension that intercepts calls to the engine.
 *
 * This extension can be used to execute code before or after the engine, change
 * the [TestEngineListener], or adapt the [TestSuite].
 */
internal interface EngineExtension {
   suspend fun intercept(
      suite: TestSuite,
      listener: TestEngineListener,
      execute: suspend (TestSuite, TestEngineListener) -> EngineResult
   ): EngineResult
}
