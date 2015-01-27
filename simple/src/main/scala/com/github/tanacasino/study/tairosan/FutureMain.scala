package com.github.tanacasino.study.tairosan

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

/**
 * Created by tairosan on 15/01/27.
 */
object FutureMain {

  def main(args: Array[String]) {
    println("Hello, World!")

    val f: Future[String] = Future {
      // 非同期で処理したい
      Thread.sleep(5000)
      "future"
    }

    f.onSuccess {
      case value: String =>
        println(s"onSuccess $value")
    }

    f.onFailure {
      case value: Throwable => println(s"onFaulure $value")
    }

    // 非同期で処理したい
    println("End")
    Thread.sleep(6000)
    println("end...")
  }
}
