package edu.pdx.cs410J.room9;

import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class KataTest
{

  @Test
  void tryInputingNumber3(){
    Kata instance = new Kata(3);
    assertThat(instance.getString(), containsString("FooFoo"));
  }



}
