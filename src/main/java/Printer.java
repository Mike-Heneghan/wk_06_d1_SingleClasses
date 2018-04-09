public class Printer {
    private int paperLeft;
    private int tonerVolume;

    public Printer(int paperLeft, int tonerVolume){
        this.paperLeft = paperLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getPaperLeft(){
        return this.paperLeft;
    }


    public int print(int pages, int copies) {
        if (this.paperLeft >= (pages * copies)) {
            this.paperLeft = (this.paperLeft - (copies * pages));
        }
        return this.paperLeft;
    }

    public void refill(int refill){
        this.paperLeft = this.paperLeft + refill;
    }

    public int getToner(){
        return this.tonerVolume;
    }

}
