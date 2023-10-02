public class App {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Power: " + smartTv.power); 
        System.out.println("Channel: " + smartTv.channel);
        System.out.println("Volume: " + smartTv.volume);
        
        smartTv.togglePower();
        System.out.println("Power: " + smartTv.power); 
    }
}
