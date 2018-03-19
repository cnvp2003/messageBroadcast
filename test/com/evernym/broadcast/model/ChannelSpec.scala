package com.evernym.broadcast.model

import com.evernym.broadcast.repository.Database
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by pati80 on 3/19/18.
  */
class ChannelSpec extends FlatSpec with Matchers {

    trait Env {
        val cricketChannel = new MobileCricketChannel("1234")
        val newsChannel = new MobileNewsChannel("1234")
        val emailChannel = new EmailChannel("1234@test.com")
    }

    "createAndStore" should "store and return appropriate new channel" in new Env{
        Database.channels.size shouldBe 0

        Channel.createAndStore(cricketChannel)
        Database.channels.size shouldBe 1

        Channel.createAndStore(newsChannel)
        Database.channels.size shouldBe 2

        Channel.createAndStore(emailChannel)
        Database.channels.size shouldBe 3
    }

}
