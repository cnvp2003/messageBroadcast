package com.evernym.broadcast.services

import com.evernym.broadcast.model._
import com.evernym.broadcast.repository.Database
import com.evernym.broadcast.repository.Database.followings
import play.api.Logger

trait SubscribeService {

  def subscribe(userId: java.util.UUID, channelId: java.util.UUID)

  def unsubscribe(user: User, channel: ChannelType)

  def brodcastMesaages()
}

class SubscribeServiceImpl extends SubscribeService {
    private val logger = Logger(getClass)

    def init = Database.createAndStoreChannels

    def subscribe(userId: java.util.UUID, channelId: java.util.UUID) = {
      init
      Channel.byId(channelId).map { channel =>
        Users.byId(userId).map { user =>
             Followings.createAndStore(user, channel) // add entry to following with user and channel
          }
      }
    }

    def unsubscribe(user: User, channel: ChannelType) = ???

    def brodcastMesaages() = ???

}