package com.evernym.broadcast.model

import java.util.UUID

import com.evernym.broadcast.repository.Database

/**
  * Created by pati80 on 3/19/18.
  */

sealed trait ChannelType{
    val id: UUID
    val name: String
}

case class MobileNewsChannel(phoneNumber: String) extends ChannelType{
    val id: UUID = UUID.randomUUID()
    val name: String = "NewsChannel"
}

case class MobileCricketChannel(phoneNumber: String) extends ChannelType {
    val id: UUID = UUID.randomUUID()
    val name: String = "CricketChannel"
}

case class EmailChannel(email: String) extends ChannelType{
    val id: UUID = UUID.randomUUID()
    val name: String = "EmailChannel"
}


object Channel {
   /* def createAndStore(channel: ChannelType) = {
        val userChannel = channel match {
            case news:MobileNewsChannel => new MobileNewsChannel("1234")
            case cricket:MobileCricketChannel => new MobileCricketChannel("1234")
            case email:EmailChannel => new EmailChannel("1234@test.com")
        }
        Database.channels += userChannel
    }*/

    def byId(channelId: java.util.UUID): Option[ChannelType] ={
        Database.channels.filter(_.id == channelId).headOption
    }
}