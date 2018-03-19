package com.evernym.broadcast.model

import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by pati80 on 3/19/18.
  */
class ChannelTypeSpec extends FlatSpec with Matchers {

    it should "know it's name" in {
        MobileNewsChannel("1234").name shouldBe "NewsChannel"
        MobileCricketChannel("1234").name shouldBe "CricketChannel"
        EmailChannel("1234@test.com").name shouldBe "EmailChannel"
    }
}
