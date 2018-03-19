package com.evernym.broadcast.services

import com.evernym.broadcast.model.{Channel, ChannelTypes, Following, User}

import play.api.Logger

trait BroadcastService {

  def subscribe(user: User, channel: ChannelTypes)

  def unsubscribe(user: User, channel: ChannelTypes)

  def brodcastMesaages()
}

class BroadcastServiceImpl extends BroadcastService {
    private val logger = Logger(getClass)

    def subscribe(user: User, channel: ChannelTypes) = {
        Following.createAndStore(user, channel)
    }

    def unsubscribe(user: User, channel: ChannelTypes) = ???

    def brodcastMesaages() = ???

}