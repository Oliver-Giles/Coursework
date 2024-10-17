import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import org.junit.Before
class TestLimitCounter {
  @Before def init(): Unit = {
    LimitCounter.reset(0, 10)
  }
  @Test def testInitialValues(): Unit = {
    assertEquals("Lower should be 0", 0, LimitCounter.getLowerLimit)
    assertEquals("Upper should be 10", 10, LimitCounter.getUpperLimit)
    assertEquals("Counter should be 0", 0, LimitCounter.getValue)
  }
  @Test def testSetGetLower(): Unit = {
    LimitCounter.setLowerLimit(5)
    assertEquals("Lower should be 5", 5, LimitCounter.getLowerLimit)
  }
  @Test def testSetGetUpper(): Unit = {
    LimitCounter.setUpperLimit(12)
    assertEquals("Upper should be 12", 12, LimitCounter.getUpperLimit)
  }
  @Test def testSetCounterLower(): Unit = {
    LimitCounter.setLowerLimit(5)
    LimitCounter.setToLowerLimit()
    assertEquals("Counter should be 5", 5, LimitCounter.getValue)
  }
  @Test def testSetCounterUpper(): Unit = {
    LimitCounter.setUpperLimit(12)
    LimitCounter.setToUpperLimit()
    assertEquals("Counter should be 12", 12, LimitCounter.getValue)
  }
  @Test def testResetUpperLimit1(): Unit = {
    LimitCounter.setUpperLimit(12)
    LimitCounter.setToUpperLimit()
    LimitCounter.setUpperLimit(8) // i.e. below the counter posi-tion
    assertEquals("Counter should be 8", 8, LimitCounter.getValue)
  }
  @Test def testResetUpperLimit2(): Unit = {
    LimitCounter.setUpperLimit(12)
    LimitCounter.setToUpperLimit()
    LimitCounter.setUpperLimit(15) // i.e. above the counter posi-tion
    assertEquals("Counter should still be 12", 12, LimitCounter.getValue)
  }
}
