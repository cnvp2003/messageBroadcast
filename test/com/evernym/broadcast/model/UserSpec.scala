package com.evernym.broadcast.model

import java.util.UUID

import com.evernym.broadcast.repository.Database
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by pati80 on 3/19/18.
  */
class UserSpec  extends FlatSpec with Matchers {

    "insert" should "store and return a person" in {
        Database.users.size shouldBe 0
        val user = User(name = "testUser")

        User.insert(user) shouldBe user
        Database.users.size shouldBe 1
    }
}