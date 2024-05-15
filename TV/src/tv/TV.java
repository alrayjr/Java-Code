package tv;
public class TV {
    
      int channel = 1; // Default channel is 1 
      int volumeLevel = 1; // Default volume level is 1 
      boolean on = false; // TV is off
  
      TV() { 
      }
  
      void turnOn() { 
        on = true;
      }
      void turnOff() {
        on = false;
      }
 
      void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120)
          channel = newChannel;
      }
      void setVolume(int newVolumeLevel) { 
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
          volumeLevel = newVolumeLevel;
      }
      void channelUp() {
        if (on && channel < 120)
          channel++;
      }
  
      void channelDown() {
        if (on && channel > 1)
          channel--;
      }
      void volumeUp() { 
        if (on && volumeLevel < 7)
          volumeLevel++;
      }
      void volumeDown() {
        if (on && volumeLevel > 1)
          volumeLevel--;
      }  
}