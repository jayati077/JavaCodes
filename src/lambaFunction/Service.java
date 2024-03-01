package lambaFunction;

abstract class Service {

    String service_name;

    abstract public void start(String service_name);

    abstract public void pause();

    public int close() {
        return 1;
    }

    public static void main(String[] args) {

    }
}
 class SpotifyServices extends Service {
     @Override
     public void start(String s_name) {

     }

     @Override
     public void pause() {

     }

     public static void main(String[] args) {
         Service so = new SpotifyServices();
         SpotifyServices s1 = new SpotifyServices();
         Service t3 = new Service() {
             @Override
             public void start(String service_name) {

             }

             @Override
             public void pause() {

             }


         };
     }
 }






