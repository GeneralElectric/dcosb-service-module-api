package io.predix.dcosb.servicemodule.api

import akka.actor.{Actor, ActorRef, ActorRefFactory}
import io.predix.dcosb.dcos.DCOSProxy
import io.predix.dcosb.servicemodule.api
import io.predix.dcosb.util.ActorSuite

class ServiceModuleTest
    extends ActorSuite
    with ServiceModuleMockingSuite {

  "An actor extending ServiceModule" - {

    val serviceModuleMock = new TestServiceModuleMock()

    "on receiving an ActorConfiguration message" - {

      val childMaker = mockFunction[ActorRefFactory, Class[_ <: Actor], String, ActorRef]
      val configuration = ServiceModule.ActorConfiguration(childMaker, stub[DCOSProxy.HttpClientFactory], "service-1")



    }

  }

}
