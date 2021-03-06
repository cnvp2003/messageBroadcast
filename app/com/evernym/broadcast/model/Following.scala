package com.evernym.broadcast.model

import java.util.UUID

import com.evernym.broadcast.repository.Database

/**
  * Created by pati80 on 3/19/18.
  */
class Following (channelId: UUID, UserId: UUID)

object Followings {
    def createAndStore(user: User, channel: ChannelType) = {
        Database.followings += new Following(channel.id, user.id)
    }
}