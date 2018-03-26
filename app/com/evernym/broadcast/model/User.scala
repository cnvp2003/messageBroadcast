package com.evernym.broadcast.model

import java.util.UUID

import com.evernym.broadcast.repository.Database

/**
  * Created by pati80 on 3/19/18.
  */
case class User(id: UUID = UUID.randomUUID(), name:String)

object Users {

    def insert(user:User):User = {
        Database.users += user
        user
    }

    def byId(userId: java.util.UUID): Option[User] ={
        Database.users.filter(_.id == userId).headOption
    }
}