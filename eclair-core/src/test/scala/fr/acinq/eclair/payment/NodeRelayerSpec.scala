/*
 * Copyright 2019 ACINQ SAS
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

package fr.acinq.eclair.payment

import akka.actor.ActorSystem
import akka.testkit.TestKit
import org.scalatest.{FunSuiteLike, Tag}

/**
 * Created by t-bast on 10/10/2019.
 */

class NodeRelayerSpec extends TestKit(ActorSystem("test")) with FunSuiteLike {

  // TODO: @t-bast: needs tests in RelayerSpec and IntegrationSpec as well

  test("compute route params") {
    fail("todo: test the function only (no actors needed)")
  }

  test("fail to relay when incoming multi-part payment times out") {
    fail("todo: can we verify that we PoisonPill-ed the multi-part handler?")
  }

  test("fail all extraneous multi-part incoming HTLCs") {
    fail("todo: both extra after success and failure")
  }

  test("fail to relay an incoming payment without payment secret") {
    fail("todo: even single-part MUST use a payment secret to protect against probing")
  }

  test("fail to relay when incoming payment secrets don't match") {
    fail("todo: only for multi-part")
  }

  test("fail to relay when expiry is too soon (single-part)") {
    fail("todo")
  }

  test("fail to relay when expiry is too soon (multi-part)") {
    fail("todo")
  }

  test("fail to relay when fees are insufficient (single-part)") {
    fail("todo")
  }

  test("fail to relay when fees are insufficient (multi-part)") {
    fail("todo")
  }

  test("relay incoming multi-part payment") {
    fail("todo: can we verify that we PoisonPill-ed the multi-part handler?")
  }

  test("relay incoming multi-part payment using lowest expiry") {
    fail("todo: when multi-part HTLCs have different expiry")
  }

  test("relay incoming single-part payment") {
    fail("todo: can we verify that we PoisonPill-ed the multi-part handler?")
  }

}
