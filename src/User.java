public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        smartTv.lowVolume();
        smartTv.lowVolume();
        smartTv.lowVolume();
        smartTv.hightVolume();
        System.out.println("Volume Atual" + smartTv.volume);

        System.out.println("TV Ligada?" + smartTv.on);
        System.out.println("Canal Atual?" + smartTv.channel);
        System.out.println("Volume Atual" + smartTv.volume);        
    
        smartTv.on();
        System.out.println("Agora a TV Ligada?" + smartTv.on);

        smartTv.off();
        System.out.println("Agora a TV Ligada?" + smartTv.on);
    }
}
