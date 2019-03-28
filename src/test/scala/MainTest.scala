import org.scalatest.FunSuite

class MainTest extends FunSuite {

  test("testMain") {
    Main.solve(4, Array(Array(4, 6), Array(643, 3564), Array(73, 253), Array(523, 525)))
  }

}
