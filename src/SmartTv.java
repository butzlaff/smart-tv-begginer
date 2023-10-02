public class SmartTv {
  boolean power = false;
  int channel = 1;
  int volume = 10;

  public void togglePower() {
    this.power = !power;
  }

  public void volumeUp() {
    if (this.volume == 30) {
      return;
    }
    this.volume++;
  }

  public void volumeDown() {
    if (this.volume == 0) {
      return;
    }
    this.volume--;
  }

  public void channelUp() {
    this.channel++;
  }

  public void channelDown() {
    if (this.channel == 1) {
      return;
    }
    this.channel--;
  }

  public void setChannel(int channel) {
    this.channel = channel;
  }
}