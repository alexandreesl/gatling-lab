trait NumberUtils {

  val leftLimit = 1L
  val rightLimit = 10L
  def generateLong = leftLimit + (Math.random * (rightLimit - leftLimit)).toLong

}