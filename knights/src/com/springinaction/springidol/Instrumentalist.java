//<start id="instrumentalist_java" /> 
package com.springinaction.springidol;

public class Instrumentalist implements Performer {
  public Instrumentalist() {
  }

  public void perform() throws PerformanceException {
    System.out.print("Playing " + song + " : ");
    //System.out.println(age);
    instrument.play();
  }
  
  private float age;

  private String song;

  public void setSong(String song) { //<co id="co_injectSong"/>
    this.song = song;
  }

  public String getSong() {
    return song;
  }

  public String screamSong() {
    return song;
  }

  private Instrument instrument;

  public void setInstrument(Instrument instrument) { //<co id="co_injectInstrument"/>
    this.instrument = instrument;
  }

public float getAge() {
	return age;
}

public void setAge(float age) {
	this.age = age;
}
}
//<end id="instrumentalist_java" />
