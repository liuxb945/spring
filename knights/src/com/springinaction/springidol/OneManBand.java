//<start id="onemanband_java" /> 
package com.springinaction.springidol;

import java.util.Collection;

public class OneManBand implements Performer {
  public OneManBand() {
  }

  public void perform() throws PerformanceException {
    for (Song song : songs) {
      String str=song.getTitle();
      System.out.println(str);
    }
  }

  private Collection<Song> songs;

  public void setSongs(Collection<Song> songs) {
    this.songs = songs; //<co id="co_injectInstrumentCollection"/>
  }
}
//<end id="onemanband_java" />
