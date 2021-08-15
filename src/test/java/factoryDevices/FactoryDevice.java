package factoryDevices;

public class FactoryDevice {

    public enum DeviceType{
        ANDROID,
        IOS,
        WINDOWS_PHONE,
        CLOUD
    }

    public static IDevice make(DeviceType deviceType){
        IDevice device;
        switch (deviceType){
            case ANDROID:
                device = new Android();
                break;
            case IOS:
                device = new IOS();
                break;
            case WINDOWS_PHONE:
                device = new WindowsPhone();
                break;
            case  CLOUD:
                device = new BrowserStack();
                break;
            default:
                device = new Android();
                break;
        }
        return  device;
    }
}
