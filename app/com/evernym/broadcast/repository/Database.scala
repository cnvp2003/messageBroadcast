package com.evernym.broadcast.repository

import scala.collection.mutable.ListBuffer
import com.evernym.broadcast.model._

/**
  * Created by pati80 on 3/19/18.
  */
object Database {

    val channels = ListBuffer[ChannelTypes]()
    val users = ListBuffer[User]()
    val followings = ListBuffer[Following]()
    //val PhoneNumbers = ListBuffer[PhoneNumber]()
}
