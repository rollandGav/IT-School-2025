package DesignPattern;

class SistemLumini{
    public void stingeLumina(){
        System.out.println("Luminile s-au stins");
    }
}

class SistemAudio{
    public void pornesteBoxe(){
        System.out.println("sistemul audio a fost pornit");
    }
}

class SistemVideo{
    public void videoPornit(){
        System.out.println("videoproiectorul a pornit");
    }
}

class HomeCinemaFacade{
    public SistemLumini sistemLumini;
    public SistemAudio sistemAudio;
    public SistemVideo sistemVideo;

    public HomeCinemaFacade(){
        sistemLumini = new SistemLumini();
        sistemAudio = new SistemAudio();
        sistemVideo = new SistemVideo();
    }

    public void pornesteFilm(){
        sistemLumini.stingeLumina();
        sistemAudio.pornesteBoxe();
        sistemVideo.videoPornit();
    }
}


public class Facade {
    public static void main(String[] args) {
        HomeCinemaFacade facade = new HomeCinemaFacade();
        facade.pornesteFilm();
    }
}
