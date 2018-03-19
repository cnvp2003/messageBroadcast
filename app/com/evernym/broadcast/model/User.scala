package com.evernym.broadcast.model

import java.util.UUID

import com.evernym.broadcast.repository.Database

/**
  * Created by pati80 on 3/19/18.
  */
case class User(id: UUID = UUID.randomUUID(), name:String)

object User {

    def insert(user:User):User = {
        Database.users += user
        user
    }
}