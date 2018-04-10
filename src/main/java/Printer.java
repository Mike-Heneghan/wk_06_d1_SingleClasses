public class Printer {
    private int paperLeft;
    private int tonerVolume;

    public Printer(int paperLeft, int tonerVolume){
        this.paperLeft = paperLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getPaperLeft(){
        return paperLeft;
    }


//    public void print(int pages, int copies) {
//        if ((this.paperLeft > (pages * copies)) && (this.tonerVolume > (pages * copies))) {
//            this.paperLeft = (this.paperLeft - (copies * pages));
//            this.tonerVolume = (this.tonerVolume - (copies * pages));
//        }
//
//    }

    public void print(int pages, int copies) {
        int totalPages = pages * copies;
            if ((this.paperLeft > totalPages) && (this.tonerVolume > totalPages)){
                this.paperLeft -= totalPages;
                this.tonerVolume -= totalPages;
        }
    }

    public void refill(int refill){
        this.paperLeft = this.paperLeft + refill;
    }

    public int getToner(){
        return this.tonerVolume;
    }

}
