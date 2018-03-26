package com.evernym.broadcast.services

import com.evernym.broadcast.model.{ChannelType, _}
import com.evernym.broadcast.repository.Database
import play.api.Logger


trait ChannelService {

  //def getChannel(channel: ChannelType):ChannelType
  def channelsList:List[ChannelType]
}

class ChannelServiceImpl extends ChannelService {
    private val logger = Logger(getClass)

    def init = Database.createAndStoreChannels

    /*def getChannel(channel: ChannelType): ChannelType = {
        channel match {
            case news:MobileNewsChannel => new MobileNewsChannel("1234")
            case cricket:MobileCricketChannel => new MobileCricketChannel("1234")
            case email:EmailChannel => new EmailChannel("1234@test.com")
        }
    }*/

   def channelsList: List[ChannelType] = {
        Database.channels.toList
   }
}