public class SmartTv {
    Boolean ligada = false;
    int volume = 25;
    int canal = 1; 

    public void mudarcanal(int qualcanal){
        canal = qualcanal;
    }
    public void tvLigada (){
            ligada = true;
        }
    public void tvDesligada (){
            ligada = false;
        }
    public void tvAumentarVolume(){
        volume++;
    }
    public void tvAbaixarVolume(){
        volume--;
    }

}
