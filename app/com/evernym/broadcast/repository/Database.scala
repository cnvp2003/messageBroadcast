package com.evernym.broadcast.repository

import scala.collection.mutable.ListBuffer
import com.evernym.broadcast.model._

/**
  * Created by pati80 on 3/19/18.
  */
object Database {

    val channels = ListBuffer[ChannelType]()
    val users = ListBuffer[User]()
    val followings = ListBuffer[Following]()
    //val PhoneNumbers = ListBuffer[PhoneNumber]()

    def createAndStoreChannels = {
        Database.channels += new MobileNewsChannel("1234")
        Database.channels += new MobileCricketChannel("1234")
        Database.channels += new EmailChannel("1234@test.com")
    }

    def createAndStoreUsers = {
        Database.users += User(name="testUser1")
        Database.users += User(name="testUser2")
        Database.users += User(name="testUser3")
        Database.users += User(name="testUser4")
    }


}
