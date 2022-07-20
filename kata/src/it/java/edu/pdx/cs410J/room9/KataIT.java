package edu.pdx.cs410J.room9;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

class KataIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  @Test
  void invokingMainWith1arg() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "6");
    assertThat(result.getTextWrittenToStandardError(), containsString("Foo"));

  }
  @Test
  void trywith33() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "33");
    assertThat(result.getTextWrittenToStandardError(), containsString("FooFooFoo"));

  }
  @Test
  void trywith3() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "3");
    assertThat(result.getTextWrittenToStandardError(), containsString("FooFoo"));

  }
  @Test
  void trywith1() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "1");
    assertThat(result.getTextWrittenToStandardError(), containsString("1"));

  }
}
