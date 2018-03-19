package com.evernym.broadcast.model

import com.evernym.broadcast.repository.Database
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by pati80 on 3/19/18.
  */
class FollowingSpec extends FlatSpec with Matchers {

    trait Env {
        val user = User(name = "test")
        val user1 = User(name = "test1")
        val user2 = User(name = "test2")
        val cricketChannel = new MobileCricketChannel("1234")
        val newsChannel = new MobileNewsChannel("1234")
        val emailChannel = new EmailChannel("1234@test.com")
    }

    "createAndStore" should "store and return appropriate new Following" in new Env {
        Database.followings.size shouldBe 0

        Following.createAndStore(user, cricketChannel)
        Database.followings.size shouldBe 1

        Following.createAndStore(user1, newsChannel)
        Database.followings.size shouldBe 2

        Following.createAndStore(user2, emailChannel)
        Database.followings.size shouldBe 3
    }
}
